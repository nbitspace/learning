package com.nbit.learn.thread;

public class InterruptThreadEg extends Thread {

	@Override
	public void run() {
		System.out.println("Thread start");
		for(int i=0; i <10; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
		try {
			Thread.sleep(5000);
			System.out.println("After sleep");
		} catch (Exception e) {
			System.out.println("Interrupted: " + e);
			e.printStackTrace();
		}
		System.out.println("Thread Completion");
	}
}
