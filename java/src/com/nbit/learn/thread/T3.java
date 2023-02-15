package com.nbit.learn.thread;

public class T3 extends Thread {
	String name;

	public T3(String name) {
		this.name = name;
	}
	
	public T3(ThreadGroup tg, String n) {
		super(tg, n);
	}

	@Override
	public void run() {
		try {
			ThreadGroup tg = Thread.currentThread().getThreadGroup();
			System.out.println("COUNT in T3: " + tg.getName() + " " + tg.activeCount());
			System.out.println("T3:" 
					+ tg.getName()
					+ " " + Thread.currentThread().getName() + "\t" + name);
			Thread.sleep(1000);
			tg.interrupt();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
