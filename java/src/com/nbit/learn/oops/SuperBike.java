package com.nbit.learn.oops;


//Final example - 3 - class
//class SuperSuperBike extends SuperBike {}
//ERROR - cannot extend SuperBike because of the final keyword


//Multi-level inheritance
// SuperBike > Bike > Vehicle
public final class SuperBike extends Bike {//Final example - 3 - class
	
	public int petrol = 12; //--2  --executes second
	public String doom = "Big"; 
	//public int reg; - implicit - from base class Vehicle

	public final int speedLimit = 150;//Final example - 1 - variable
	
	static {
		//this.petrol = 10; - object value cannot be initialized here
		//Static is called only once for the whole program
		System.out.println("SuperBike class initialized - static block");
	}

	
	//initializer block
	{
		petrol = 13; //--3  --executes third
		System.out.println("Initializer block: SuperBike is initialized");
		System.out.println("Initializer block: petrol value: " + petrol);
	}
	
	public SuperBike() {
		//super(); - it's there by default, we need not give explicitly //--1 --executes first
		
		System.out.println("SuperBike Default constructor");//--4  --executes fourth
		this.petrol = 14;
		System.out.println("Constructor block: petrol value: " + petrol);
		
		//this.speedLimit = 200;//Final example - 1 - Error
	}
	
	public SuperBike(String doom, int petrol, int reg, String model) {
		super(petrol, reg, model);//Should be in first line
		this.doom = doom;
	}
	
	public void petrolVariantSuper(int petrol) {
		System.out.println("petrol: " + petrol);
		System.out.println("this.petrol: " + this.petrol);
		System.out.println("super.petrol: " + super.petrol);
	}
	
	//Final example - 2 - method/function
	//ERROR because base class method has 'final' keyword, so derived class cannot override
//	public void start() {
//		System.out.println("Start with huge sound");
//	}
	
}
