package com.nbit.learn.mycollection;

import java.io.FileReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

import com.nbit.learn.oops.Bike;
import com.nbit.learn.oops.Car;
import com.nbit.learn.oops.SuperBike;
import com.nbit.learn.oops.Vehicle;

public class MapEg {
	public static void mapEg() {
		//HashMap is used to lookup keys and retrieve their values.
		//HashMap doesn't maintain order
		HashMap<Integer, String> a = new HashMap<Integer, String>();
		a.put(1, "Priya");
		a.put(2, "Malavi");
		a.put(3, "Nithya");
		a.put(3, "Ramya");//Replaces 3rd element. Keys are unique in HashSet
		//a[4] = "Dhivya";
		a.put(5, "Ramya");//Values can repeat. Values are non unique
		a.put(0, "Liya");
		a.put(32, "Lina");
		a.put(26, "Swara");
		
		System.out.println("HashMap values: " + a);
		
		System.out.println("Value of Reg id 3 : " + a.get(3));
		System.out.println("Value of Reg id 4 : " + a.getOrDefault(4, "NO Value"));
		System.out.println("Value of Reg id 5 : " + a.getOrDefault(5, "NO Value"));
		
		System.out.println(a.entrySet());
		a.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
		System.out.println();
		a.entrySet().stream()
		.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		.forEach(System.out::println);
		
		//Don't use containsValue(). Or use with caution. Because values are not optimized for search.
		System.out.println("Map contains Swara: " + a.containsValue("Swara"));
		a.remove(5);
		
		Map m = Collections.synchronizedMap(a);//Now m is synchronized.
		System.out.println("Get 5: " + m.get(5));
	}
	
	public static void linkedHashMapEg() {
		//LinkedHashMap maintains order
		
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(54325, "Neetha");
		map.put(9876, "Neethi");
		map.put(24654, "Aura");
		map.put(1, "Mana");
		
		System.out.println("Map values: " + map);
		System.out.println("Get name with id 9876: " + map.get(9876));
	}
	
	public static void treeMapEg() {
		//No null values
		//Maintains ascending order
		
		TreeMap<Integer, Vehicle> map = new TreeMap<Integer, Vehicle>();
		map.put(4590, new Bike(200, 4590, "Y"));
		map.put(9999, new SuperBike("Big", 300, 9999, "A"));
		Car c = new Car("Z", 7654);
		map.put(c.reg, c);
		map.put(1234, new Car("ZZ", 1234));
		
		System.out.println("TreeMap Values: " + map);
		System.out.println("Vehicle with reg 9999: " + map.get(9999));
		System.out.println("Ceiling 5000:" + map.ceilingKey(5000));
		System.out.println("Floor 10000: " + map.floorKey(10000));
		System.out.println("Floor 2000: " + map.floorKey(2000));
		System.out.println("Floor 10000: " + map.floorEntry(10000));
		System.out.println("Contains 7654: " + map.containsKey(4590));
		System.out.println("Contains Car 7654: " + map.containsValue(c));
		//Use containsValue() with caution. Because values are not optimized for search.
		
		System.out.println("Head Map: " + map.headMap(5000));
		System.out.println("Head Map: " + map.headMap(4590));
		System.out.println("Head Map: " + map.headMap(4590, true));//Default false

		System.out.println("Tail Map: " + map.tailMap(5000));
		System.out.println("Tail Map: " + map.tailMap(7654));
		System.out.println("Tail Map: " + map.tailMap(7654, false));//Default true
		
		System.out.println("Sub Map: " + map.subMap(2000, 10000));
		System.out.println("Sub Map: " + map.subMap(4590, 9999));//Default true, false
		System.out.println("Sub Map: " + map.subMap(4590, false, 9999, true));
	}
	
	public static void hashTableEg() {
		//This is synchronized.
		//No null key or value
		Hashtable<Integer, String> name = new Hashtable<Integer, String>();
		name.put(1, "Harry");
		name.put(2, "Hermione");
		name.put(3, "Giny");
		name.put(5, "Ron");
		name.remove(5);
		name.putIfAbsent(3, "Dumbledore");
		System.out.println("HashTable value: " + name);
		System.out.println("Get 2: " + name.get(2));
		System.out.println("Get 5: " + name.getOrDefault(5, "None"));
	}
	
	public static void propertiesEg() {
		try {
			FileReader f = new FileReader("my.properties");
			Properties myProp = new Properties();
			myProp.load(f);
			String printer = myProp.getProperty("printer");
			System.out.println("printer value: " + printer);
			
			int times = Integer.valueOf(myProp.getProperty("times"));
			for(int i=0; i < times; i++)
				System.out.println(printer);
			
			Properties p = System.getProperties();
			System.out.println(p);
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void concurrentHashMapEg() {
		//Concurrent updates can be done
		ConcurrentHashMap<Integer, String> aadhaar = new ConcurrentHashMap<>();
		aadhaar.put(765434567, "Pinky");
		aadhaar.put(254323454, "Sweety");
		aadhaar.put(254433454, "Lena");
		
	}
}
