package com.nbit.learn.thread;

import com.nbit.learn.oops.Car;

public class MiscEg extends Thread {
	public static void garbageCollectorEg() {
		Car a = new Car("X", 8590);
		Car b = new Car("Blue", "Z", 7032);
		Car c = new Car("Y", 3958);
		Car d = c;//Garbage collection doesn't happen for this object
		new Car("A", 9684);//gc happens for anonymous object
		a = null;//gc happens for unreferenced object
		b = null;
		c = null;
		System.gc();
		
	}
	
	@Override
	public void run() {
		System.out.println("Shutdown completed. Bye from MiscEg");
	}
	
	public static void shutdownEg() throws Exception {
		//Crtl+C in terminal
		//System.exit(int)
		//user logoff
		//shutdown
	
		System.out.println("Shutdown Eg");
		MiscEg shut = new MiscEg();
		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(shut);
		Thread.sleep(2000);
		//r.removeShutdownHook(shut);
		r.addShutdownHook(new T2("thread 2"));
		
		//Can't guarantee that shutdown hook will always be executed.
	}
}
