package com.nbit.learn.oops;


//public class Bike extends Vehicle, Cycle {//ERROR - multiple inheritance is not allowed in Java

public class Bike extends Vehicle {
	//reg, model
	public int petrol = 10;//10 litre tank
	public Bike() {
		super();//Base class default constructor - automatic
	}
	
	public Bike(int petrol, int reg, String model) {
		super(reg, model);//Base class parameterised constructor
		this.reg = reg;//We can also assign like this
		this.petrol = petrol;
	}
	
	public void turn() {//Method overriding - polymorphism
		System.out.println("Vehicle with reg:" + reg + " is 'leaning' and turning");
	}
	
	
}
