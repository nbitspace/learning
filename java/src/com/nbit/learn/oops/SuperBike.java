package com.nbit.learn.oops;

//Multi-level inheritance
// SuperBike > Bike > Vehicle
public class SuperBike extends Bike {
	public String doom = "Big";
	//public int reg; - implicit - from base class Vehicle
	
	public SuperBike(String doom, int petrol, int reg, String model) {
		super(petrol, reg, model);//Should be in first line
		this.doom = doom;
	}
	
}
