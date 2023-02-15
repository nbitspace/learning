package com.nbit.learn.oops;

//A class is like a template
//An object is created for a class
//Object is like a variable
//Object created with new keyword
public class Car extends Vehicle implements Seat, Window {//inheritance is done using 'extends' keyword
	//Vehicle is base class
	//Car is derived class
	
	
	//Static block
	//Used to perform the required operations when the class gets loaded.
	static {
		System.out.println(Car.class.getName() + " class loaded");
		System.out.println("Getting ready to create car");
	}
	
	
	// static variable. So associated with Class and not with object
	public static int wheelCount = 4;
	public static final int STEERING_COUNT = 1;

	// object's attributes
	public String colour = "Red";// Attribute, field, variable, data-member
	public boolean music = false;// no static - so associated with object
	//public int reg = 321; - moved to Vehicle base class - inherited from Vehicle
	//public String model; - inherited from Vehicle
	

	public Car() {// default constructor
		model = "X";
		this.reg = 432;
	}

	public Car(String col) {// constructor - 1 parameter
		
		this("X", 43);//Constructor call using 'this' keyword
		this.colour = col;
		//music = false;
	}
	
	public Car(String model, int reg) {
		this.model = model;
		this.reg = reg;
	}

	public Car(String colour, String mod, int r) {// constructor - 3 parameters/arguments
		// colour = colour; will not work. 'this.' should be used
		this.colour = colour;
		model = mod;
		this.reg = r;
		music = true;
	}
	
	//Non-static method
	//called with an object. Eg: vaishanthCar.drive()
	//This method can use (non-static) class/object's attributes.
	public void drive() {
		System.out.println("Driving " + colour 
				+ " colour car of model " + this.model 
				+ " with reg no " + this.reg);
	}
	
	//We can specify @Override or not. This is optional.
	@Override
	public void indicator(boolean isLeft) {
		super.indicator(isLeft);//Base class indicator method is called
		if (isLeft)
			System.out.println("Left indicator on the side is ON.");
		else
			System.out.println("Right indicator on the side is ON.");
	}
	
	//Static method
	//Called with Class name. Eg. Car.driveStatic();
	//This method cannot use (non-static) class/object's attributes. 
	public static void driveStatic() {
		//This method cannot use (non-static) class/object's attributes.
		//System.out.println("Car Colour: " + this.colour);//ERROR
		System.out.println("Always same output for all objects");
	}

	@Override
	void engine() {//Base class Abstract method
		System.out.println("Car Engine");
	}

	@Override
	public void adjustSeat() {
		System.out.println("Seat Adjusted");
		
	}

	@Override
	public void seatCover() {
		System.out.println("Seat cover put on");
		
	}

	@Override
	public void openWindow() {
		System.out.println("Window opened");
		
	}

	@Override
	public void closeWindow() {
		System.out.println("Window closed");
		
	}
	
	//This method executes when GC is called and the object is garbage collected
	public void finalize() {
		System.out.println("Garbage Collected: reg:" + reg + " col:" + colour);
	}
	
	//Thread Method Synchronization example
	synchronized public void syncMethodEg(String s) {
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
	
	public void syncBlockEg(String s) {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("s:" + s + "-nonsync thread-name:" 
			+ Thread.currentThread().getName() + " i:" + i);
				Thread.sleep(500);
			}
			
			synchronized (this) {
				for (int i = 6; i <= 10; i++) {
					System.out.println("s:" + s + "-sync thread-name:" 
				+ Thread.currentThread().getName() + " i:" + i);
					Thread.sleep(200);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	synchronized static public void staticSyncMethodEg(String s) {
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
	
	public void staticSyncBlockEg(String s) {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("s:" + s + "-nonsync thread-name:" 
			+ Thread.currentThread().getName() + " i:" + i);
				Thread.sleep(500);
			}
			
			synchronized (Car.class) {
				for (int i = 6; i <= 10; i++) {
					System.out.println("s:" + s + "-sync thread-name:" 
				+ Thread.currentThread().getName() + " i:" + i);
					Thread.sleep(200);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
