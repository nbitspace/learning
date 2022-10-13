package com.nbit.learn.oops;

public class Vehicle {
	public int reg = 321;
	public String model;
	public Wheel wheel;//aggregation
	private boolean headLight = false;//true=on, false=off

	public Vehicle() {//constructor
		reg = 432;
		wheel = new Wheel();
	}

	public Vehicle(int reg, String model) {
		this.reg = reg;
		this.model = model;
		
		wheel = new Wheel();
		wheel.size = 14;
		wheel.isTubeless = false;
	}

	public void turn() {
		System.out.println("Vehicle with reg:" + reg + " is turning");
	}
	
	public void headLightToggle() {
		if(headLight == false) {
			headLight = true;
			System.out.println(this.reg + ": Headlight is ON!");
		} else if(this.headLight == true) {
			this.headLight = false;
			System.out.println(this.reg + ": Headlight is OFF!");
		}
	}
}
