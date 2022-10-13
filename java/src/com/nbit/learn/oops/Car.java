package com.nbit.learn.oops;

//A class is like a template
//An object is created for a class
//Object is like a variable
//Object created with new keyword
public class Car extends Vehicle {//inheritance is done using 'extends' keyword
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
	
	//Static method
	//Called with Class name. Eg. Car.driveStatic();
	//This method cannot use (non-static) class/object's attributes. 
	public static void driveStatic() {
		//This method cannot use (non-static) class/object's attributes.
		//System.out.println("Car Colour: " + this.colour);//ERROR
		System.out.println("Always same output for all objects");
	}
}
