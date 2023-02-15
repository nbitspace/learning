package com.nbit.learn.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.nbit.learn.oops.Car;

public class ThreadEg {
	public static void sleep() throws Exception {
		for (int i = 0; i < 20; i++) {
			System.out.print("\nSlept " + i);
			Thread.sleep(10000);//1 second = 1000 milliseconds, 1000000 micro seconds,
		}
	}
	
	public static void twoThread() throws Exception {
		System.out.println("Creating threads");
		T1 t1 = new T1();//creating thread by implementing Runnable interface
		T2 t2 = new T2("Second Tread");//creating thread by extending Thread class
		T2 t2_2 = new T2("Third Thread");
		//t2.run();//This is normal method call. Not a separate thread.
		
		Thread thread1 = new Thread(t1, "First Thread");
		thread1.start();//Starting run() in T1 class
		
		t2.start();//Starting run() in T2 class
		//t2.start();//Error in runtime.
		t2_2.start();
		System.out.println("Threads Created");
		t2.join(1000);
		System.out.println("Thread 2 completed");
	}
	
	public static void threadPool() {
		ExecutorService exe = Executors.newFixedThreadPool(3);
		for(int i=0; i < 10; i++) {
			T3 t = new T3("Name - " + i);
			exe.execute(t);
		}
		//exe.shutdown();
		
		//Context switching
	}
	
	public static void threadGroup() throws Exception {
		ThreadGroup tg = new ThreadGroup("threadgroup-1");
		ThreadGroup tg2 = new ThreadGroup("threadgroup-2");
		T3 a = new T3(tg, "thread 1");
		T3 b = new T3(tg2, "Thread 2");
		T2 c = new T2(tg, "Thread 3");
		
		c.start();
		b.start();
		a.start();
		System.out.println("COUNT in main: " + tg.getName() + " " + tg.activeCount());
		
		System.out.println("Group Count: " + Thread.currentThread().getThreadGroup().activeGroupCount());
		System.out.println("TG destroyed: " + tg2.isDestroyed());
	}
	
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
	public static void syncMethodEg() {
		Car c = new Car();
		Sync s1 = new Sync(c, "Thread1");
		Sync s2 = new Sync(c, "Thread2");
		s1.start();
		s2.start();

	}
	
	static final String resource1 = "vaishanth";
	static final String resource2 = "akash";
	public static void deadLockEg() {
		try {
			Thread t1 = new Thread() {
				public void run() {
					synchronized(resource1) {
						System.out.println("t1: lock resource1");
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						synchronized(resource2) {
							System.out.println("t1: lock resource 2");
						}
					}
					System.out.println("Thread 1 finished. Deadlock did not happen");
				}
			};
			Thread t2 = new Thread() {
				public void run() {
					synchronized(resource2) {
						System.out.println("t2: lock resource 2");
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						synchronized(resource1) {
							System.out.println("t2: lock resource1");
						}
					}
					System.out.println("Thread 2 finished. Deadlock did not happen");
				}
			};
			
			t1.start();
			t2.start();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//wait, notify, notifyAll
	public static void interThreadComm() {
		InterThreadEg it = new InterThreadEg(50000);
		new Thread() {
			public void run() {
				it.withdraw(70000);
			}
		}.start();

		new Thread() {
			public void run() {
				it.deposit(10000);
			}
		}.start();
		
		new Thread() {
			public void run() {
				it.withdraw(10000);
			}
		}.start();

		new Thread() {
			public void run() {
				it.withdraw(45000);
			}
		}.start();
		
		new Thread() {
			public void run() {
				it.deposit(50000);
			}
		}.start();
	}
	
	public static void interruptThread() {
		InterruptThreadEg t = new InterruptThreadEg();
		t.start();
		try {
			t.interrupt();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
