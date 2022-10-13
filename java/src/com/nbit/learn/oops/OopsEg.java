package com.nbit.learn.oops;

public class OopsEg {
	public static void oops() {//static method
		System.out.println("Oops Example:");
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
		
		vaishanthCar.drive();
		akashCar.drive();
		priyaCar.drive();
		
		Car.driveStatic();//static method call
		vaishanthCar.driveStatic();//warning, not-recommended
		akashCar.driveStatic();
		
		Bike venkatBike = new Bike();
		System.out.println("venkat-bike reg: " + venkatBike.reg);
		System.out.println("venkat-bike model: " + venkatBike.model);
		
		Bike naveenBike = new Bike(15, 890, "S");//parameterised - base class constructor eg
		System.out.println("naveen-bike reg: " + naveenBike.reg);
		System.out.println("naveen-bike model: " + naveenBike.model);
		
		Vehicle something = new Vehicle(4562, null);
		System.out.println("something-vehicle reg: " + something.reg);
		System.out.println("something-vehicle model: " + something.model);
		
		//derived object can be assigned to base class type
		Vehicle pcCar = new Car("Brown","S", 567);//parameterised - base class constructor eg
		System.out.println("pc-car reg: " + pcCar.reg);
		System.out.println("pc-car model: " + pcCar.model);
		//System.out.println("pc-car colour: " + pcCar.colour);//Can't use because pcCar object type is Vehicle
		
		
		//Change type - typecasting
		Car pcCarDup = (Car) pcCar;//typecasting - vehicle converted to car
		System.out.println("pc-car-duplicate reg: " + pcCarDup.reg);
		System.out.println("pc-car-duplicate model: " + pcCarDup.model);
		System.out.println("pc-car colour: " + pcCarDup.colour);//Can use because
		
		//Car obj = new Vehicle(567, "M");//ERROR - can convert from small class to big class object.
		
		SuperBike venkatSB = new SuperBike("Big", 15, 8765, "B");
		System.out.println("venkatSB-superbike-duplicate doom: " + venkatSB.doom);
		System.out.println("venkatSB-superbike-duplicate model: " + venkatSB.model);
		System.out.println("venkatSB-superbike colour: " + venkatSB.petrol);
		
	}
	
	public static void oops2() {
		SuperBike venkatSB = new SuperBike("Big", 15, 8765, "B");
		venkatSB.turn();//method overriding - bike.turn()
		venkatSB.headLightToggle();
		venkatSB.headLightToggle();
		venkatSB.headLightToggle();
		
		Car priyaCar = new Car("White", "Z", 7654);
		priyaCar.turn();//vehicle.turn()
		priyaCar.headLightToggle();
		venkatSB.headLightToggle();
		
		//overriding is a problem with multiple inheritance. so, Java doesn't support multiple inheritance
	}
}
