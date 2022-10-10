package com.nbit.learn.oops;

//A class is like a template
//An object is created for a class
//Object is like a variable
//Object created with new keyword
public class Car {
	//static variable. So associated with Class and not with object
	public static int wheelCount = 4;
	public static final int STEERING_COUNT = 1;
	
	//object's attributes
	public String colour = "Red";//Attribute, field, variable, data-member
	public String model;//no static - so associated with object
	public int reg = 321;

	public Car() {//default constructor
		model = "X";
		this.reg = 432;
	}
	
	public Car(String col) {//constructor - 1 parameter
		this.colour = col;
		//reg value is 321;
	}
	
	public Car(String colour, String mod, int r) {//constructor - 3 parameters/arguments
		//colour = colour; will not work. 'this.' should be used
		this.colour = colour;
		model = mod;
		this.reg = r;
	}
}
