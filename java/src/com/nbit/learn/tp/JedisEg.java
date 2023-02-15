package com.nbit.learn.tp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisPubSub;
import redis.clients.jedis.Pipeline;
import redis.clients.jedis.Response;
import redis.clients.jedis.Transaction;

public class JedisEg extends Thread {
	public String pubOrSub;
	
	public JedisEg(String pos) {
		this.pubOrSub = pos;
	}
		
	public static void jedisEg() {
		
		Jedis j = new Jedis("localhost", 6379);
		j.set("hi", "from java");
		
		Map<String, String> book = new HashMap<String, String>();
		book.put("Harry Potter", "JK Rowling");
		book.put("Ponniyin Selvan", "Kalki");
		j.hmset("books", book);
		
		String popSong = j.get("popular-song");
		System.out.println("popular-song: " + popSong);
		String resp = j.get("hi");
		System.out.println("hi: " + resp);
		
		Map<String, String> v = j.hgetAll("5873");
		System.out.println("5873=" + v);
		
//		j.lpush("os", "Linux", "Windows", "Mac OS X");
//		j.lpush("os", "unix");
//		String[] os = new String[] {"solaris", "Android"};
//		j.lpush("os", os);
		
		boolean mem = j.sismember("movies", "varisu");
		System.out.println("is varisu member of movies: " + mem);
		
		Map<String, Double> mark = new HashMap<>();
		mark.put("Math", 90.0);
		mark.put("Science", 83D);
		mark.put("Social", 70d);
		
		j.zadd("mark", mark);
//		mark.entrySet().forEach(m -> {
//			j.zadd("marks", m.getValue(), m.getKey());
//		});
		List<String> sortSetVals = j.zrange("mark", 0, 100);
		System.out.println("mark sort set vals: " + sortSetVals);
		j.del("language");
		j.sadd("language", "go");
		j.watch("language");
		j.sadd("language", "scala");
		
		Transaction t = j.multi();
		t.sadd("language", "c++");
		t.sadd("language", "java", "python");
		List<Object> res = t.exec();
		
		j.close();
	}
	

	@Override
	public void run() {
		if (pubOrSub == "publish") {
			Jedis pub = new Jedis();
			for(int i = 50; i < 150; i=i+2) {
				System.out.println("Publish:" + "processing image-" + i);
				pub.publish("image-metadata", "processing image-" + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			pub.close();
		}
		else if (pubOrSub == "subscribe") {
			Jedis sub = new Jedis();
			JedisPubSub ps = new JedisPubSub() {
				@Override
				public void onMessage(String channel, String message) {
					System.out.println("c:" + channel + "  m:" + message);
				}
			};
			sub.subscribe(ps, "image-metadata");
			
			System.out.println("Subscribe finish");
		}
	}
	
	public static void pubSub() {
		System.out.println("Pub Sub Eg:");
		
		JedisEg publisher = new JedisEg("publish");
		publisher.start();
		
		JedisEg subscribe = new JedisEg("subscribe");
		subscribe.start();
	}
	
	public static void jedisPool() {
		final JedisPoolConfig poolConfig = new JedisPoolConfig();
		poolConfig.setMaxTotal(100);
		poolConfig.setMinIdle(20);
		poolConfig.setMaxIdle(100);
		JedisPool pool = new JedisPool(poolConfig);
		
		try(Jedis j = pool.getResource()) {
			String val = j.get("hi");
			System.out.println("From pool connection: hi:" + val);
		}
		pool.close();
	}
	
	public static void redisCluster() {
		
		HostAndPort host1 = new HostAndPort("localhost", 6379);
		//HostAndPort host2 = new HostAndPort("<host2ip>", 6379);
		
		Set<HostAndPort> hosts = new HashSet<>();
		hosts.add(host1);
		//hosts.add(host2);
		
		try(JedisCluster cluster = new JedisCluster(hosts)) {
			String val = cluster.get("hi");
			System.out.println("Redis Cluster: hi:" + val);
		}
	}
	
	public static void pipeline() {
		Jedis j = new Jedis();//connection make
		Jedis j2 = new Jedis();
		Pipeline p = j.pipelined();//pipeline object
		p.set("hello", "world");//send in pipe
		
		for(int i = 0 ; i < 50; i++) {
			Map<String, String> actor = new HashMap<String, String>();
			actor.put("vijay", "joseph");
			actor.put("rajini", "sivaji");
			p.hmset("actors" + i, actor);//send in pipe
		}
		
		System.out.println("actors49 vijay: " +  j2.hexists("actors49", "vijay"));
		
		Response<Boolean> isExistResp = p.hexists("actors49", "vijay");//Get in pipe
		Response<String> helloResp = p.get("hello");//Get in pipe
		p.sync();//waits to finish execution
		System.out.println("Pipeline done");
		
		Boolean isExist = isExistResp.get();
		String hello = helloResp.get();
		System.out.println("actors49 vijay: " + isExist);
		System.out.println("hello value: " + hello);
		j.close();
	}
}
