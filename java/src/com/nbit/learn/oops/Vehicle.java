package com.nbit.learn.oops;

public abstract class Vehicle {
	public int reg = 321;
	public String model;
	public Wheel wheel;// aggregation
	private boolean headLight = false;// true=on, false=off
	public short intensity = 1;
	public Long kms = 0L;//Long value ends with L
	
	private static boolean suspension = true;
	private final boolean SPEEDOMETER = true;

	public Vehicle() {// constructor
		System.out.println("\nVehicle Default Constructor");
		reg = 432;
		wheel = new Wheel();
	}

	public Vehicle(int reg, String model) {//constructor - parameterised
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
		if (headLight == false) {
			headLight = true;
		} else if (this.headLight == true) {
			this.headLight = false;
		}
		headLightStatus();
	}

	public void headLightToggle(boolean onOrOff) {// method overloading by parameter count.
		headLight = onOrOff;
		headLightStatus();
	}
	
	//Can't overload by changing return type
//	public String headLightToggle(boolean onOrOff) {// method overloading not possible
//		return "String value";
//	}

	public void headLightToggle(short intensity) {// method overloading by type
		System.out.print("Intensity changed from " + this.intensity);
		this.intensity = intensity;
		System.out.println(" to " + this.intensity);
	}
	
	public void headLightToggle(boolean onOrOff, short intensity) {// method overloading by count
		headLightToggle(intensity);
		headLightToggle(onOrOff);
	}

	public void headLightStatus() {
		if (headLight == true) {
			System.out.println(this.reg + ": Headlight is ON with intensity:" + this.intensity);
		} else {
			System.out.println(this.reg + ": Headlight is OFF with intensity:" + this.intensity);
		}
	}
	
	public void kms() {
		System.out.println(this.reg + ": Vehicle has gone " + this.kms + "kms.");
	}

	public void kms(Long km) {
		this.kms = km;
		kms();
	}
	
	public void kms(Long km, Long serviceKm) {
		this.kms = km;
		if (this.kms > serviceKm) {
			System.out.println(this.reg + ": Your KM:" + this.kms + ". Service needed after " + serviceKm + "kms. Service not done.");
		} else {
			System.out.println(this.reg + ": Your KM:" + this.kms + ". Service not needed till kms " + serviceKm);
		}
	}
	
	public void indicator(boolean isLeft) {
		if (isLeft)
			System.out.println("Left indicator in front is ON.");
		else
			System.out.println("Right indicator in front is ON.");
	}
	
	public final void start() {//Final example - 2 - method/function
		System.out.println("Vehicle Started");
	}
	
	abstract void engine();//Abstract method example
//	{
//		System.out.println("Engine definition");
//	}
}
