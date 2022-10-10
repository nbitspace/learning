package com.nbit.learn.oops;

public class OopsEg {
	public static void oops() {//static method
		//Car is a class
		//vetriCar is an object
		//Object is like a variable
		//Object created with new keyword
		Car vetriCar = new Car();
		System.out.println("vetri-car colour: " + vetriCar.colour);
		System.out.println("vetri-car model: " + vetriCar.model);
		System.out.println("vetri-car reg: " + vetriCar.reg);
		
		Car vaishanthCar = new Car();
		System.out.println("vaishanth-car colour: " + vaishanthCar.colour);
		vaishanthCar.colour = "Black";
		vaishanthCar.model = "Y";
		System.out.println("vaishanth-car colour: " + vaishanthCar.colour);
		System.out.println("vetri-car colour: " + vetriCar.colour);
		System.out.println("vaishanth-car model: " + vaishanthCar.model);
		System.out.println("vaishanth-car reg: " + vaishanthCar.reg);
		
		//Static Variable access
		//Static Variable is accessed with syntax Class.staticVariable
		System.out.println("Car wheel count: " + Car.wheelCount);
		System.out.println("Car wheel count: " + vaishanthCar.wheelCount);//not-recommended
		

		//Non-static variables cannot be used by Class
		//System.out.println("Car wheel count: " + Car.colour);//ERROR
		
		Car.wheelCount = 6;//Not Final - so value can be changed
		System.out.println("Car wheel count: " + Car.wheelCount);
		
		System.out.println("Car steering count: " + Car.STEERING_COUNT);
		
		//Final variables cannot be changed - Car.STEERING_COUNT
		//Car.STEERING_COUNT = 2;//ERROR
		
		
		Car akashCar = new Car("Blue");
		System.out.println("akash-car colour: " + akashCar.colour);
		System.out.println("akash-car model: " + akashCar.model);
		System.out.println("akash-car reg: " + akashCar.reg);
		
		Car priyaCar = new Car("White", "Z", 7654);
		System.out.println("priya-car colour: " + priyaCar.colour);
		System.out.println("priya-car model: " + priyaCar.model);
		System.out.println("priya-car reg: " + priyaCar.reg);
	}
}
