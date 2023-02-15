package com.nbit.learn.thread;

public class T2 extends Thread {
	
	public T2(String name) {
		super(name);
	}
	public T2(ThreadGroup tg, String name) {
		super(tg, name);
	}

	@Override
	public void run() {
		try {
			ThreadGroup tg = Thread.currentThread().getThreadGroup();
			System.out.println("COUNT in T2: " + tg.getName() + " " + tg.activeCount());
			System.out.println("T2:" + tg.getName()
					+ " " + Thread.currentThread().getName());
			for (int i = 51; i < 100; i++) {
				System.out.println("COUNT in T2: " + tg.getName() + " " + tg.activeCount());
				System.out.println("T2 : " + i);
				Thread.sleep(200);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
