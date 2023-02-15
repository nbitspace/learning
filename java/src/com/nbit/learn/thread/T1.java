package com.nbit.learn.thread;

public class T1 implements Runnable {//Creating thread by implementing Runnable

	@Override
	public void run() {
		try {
			for (int i = 0; i < 50; i++) {
				System.out.println("T1 : " + i);
				//Thread.sleep(10000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
