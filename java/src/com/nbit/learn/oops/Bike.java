package com.nbit.learn.oops;


//public class Bike extends Vehicle, Cycle {//ERROR - multiple inheritance is not allowed in Java

public class Bike extends Vehicle implements Cloneable {
	//reg, model
	public int petrol = 10;//10 litre tank
	public Bike() {
		super();//Base class default constructor - automatic
		System.out.println("Bike Default Contructor");
	}
	
	public Bike(int petrol, int reg, String model) {
		super(reg, model);//Base class parameterised constructor
		this.reg = reg;//We can also assign like this
		this.petrol = petrol;
	}
	
	public void turn() {//Method overriding - polymorphism
		System.out.println("Vehicle with reg:" + reg + " is 'leaning' and turning");
	}

	@Override
	void engine() {
		System.out.println("Bike Engine");
		
	}
	
	@Override
	public String toString() {
		String val = "[";
		val += "reg=" + this.reg;
		val += ";petrol=" + this.petrol;
		val += ";model=" + this.model;
		val += ";intensity=" + this.intensity;
		val += ";kms=" + this.kms + "]";
		
		return val;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
