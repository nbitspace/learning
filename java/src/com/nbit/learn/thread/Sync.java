package com.nbit.learn.thread;

import com.nbit.learn.oops.Car;

public class Sync extends Thread{
	/*
	 * Sync - to have consistency in multithreading ;
	 * 2 type - ProcessSynchronization, ThreadSynchronization;
	 * ThreadSynchronization type: 
	 * 1. MutuallyExclusive: 
	 * 		a. Synchronized method 
	 * 		b. Synchronized block 
	 * 		c. Static Synchronization
	 * 
	 * 2. Cooperation (inter-thread communication in java)
	 * 
	 */
	

	Car c;
	
	public Sync(Car c, String threadName) {
		super(threadName);
		this.c = c;
	}

	public void printVal(String s) {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("s:" + s + " thread-name:" 
			+ Thread.currentThread().getName() + " i:" + i);
				Thread.sleep(100);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	 
	@Override
	public void run() {
		printVal("nonsync-method");
		System.out.println();
		
		new Car().syncMethodEg("nonsync-obj-method");//Non synchronized across threads as it's a different object for different threads
		System.out.println();
		
		c.syncMethodEg("sync-method");//This is a synchronized method
		System.out.println();
		
		c.syncBlockEg("sync-block");//This has a synchronized block
		
		new Car().staticSyncMethodEg("obj-static-method");//Static synchronization method
		
		new Car().staticSyncBlockEg("obj-static-block");//Static synchronization block
	}

}
