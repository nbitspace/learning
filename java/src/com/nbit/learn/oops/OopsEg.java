package com.nbit.learn.oops;

import java.util.ArrayList;
import java.util.List;

import com.nbit.learn.BoxInt;
import com.nbit.learn.oops.encapsulation.AccessModifierEg1;
import com.nbit.learn.oops.encapsulation.AccessModifierEg2;
import com.nbit.learn.oops.encapsulation2.AccessModifierEg1Derived;
import com.nbit.learn.oops.encapsulation2.AccessModifierEg3;

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
	
	//Polymorphism - Overriding, overloading
	public static void polymorphism() {
		SuperBike venkatSB = new SuperBike("Big", 15, 8765, "B");
		venkatSB.turn();//method overriding - bike.turn()
		venkatSB.headLightToggle();
		venkatSB.headLightToggle();
		venkatSB.headLightToggle();
		
		Car priyaCar = new Car("White", "Z", 7654);
		priyaCar.turn();//vehicle.turn()
		priyaCar.headLightToggle();
		
		venkatSB.headLightToggle();//method overloading - no parameter - 0
		venkatSB.headLightToggle(false);//method overloading - by parameter count - 1
		
		venkatSB.headLightToggle(false);//method overloading - by parameter type - boolean
		venkatSB.headLightToggle((short)5);//method overloading - by parameter type - short
		
		venkatSB.headLightToggle(true);//method overloading - by parameter count - 1
		venkatSB.headLightToggle(false, (short)3);//method overloading - by parameter count - 2
		
		priyaCar.kms(3540L);
		priyaCar.kms(6540L, 6000L);
		//assume service is done now after 6000kms.
		priyaCar.kms(8940L, 10000L);
		priyaCar.kms();
		priyaCar.kms(9854L);
		//overriding is a problem with multiple inheritance. so, Java doesn't support multiple inheritance
		
		//Super Example - Parent class instance access
		SuperBike superPetrolEg = new SuperBike();
		superPetrolEg.petrolVariantSuper(20);
		
		//Super Example - Parent method access
		Car superMethodEg = new Car();
		superMethodEg.indicator(true);
		
		//Initializer block example
		SuperBike initializerEg = new SuperBike();//--0 --execution starts
		initializerEg.petrol = 16;//--5  --executes fifth
		System.out.println("Outside: Petrol value: " + initializerEg.petrol);
		
		//When you create a new object, -- 0
		//First, Base class initialization happens, -- 1
		//Then, that class's variable initialization, -- 2
		//Then, that class's initializer block -- 3
		//Then, that class's constructor block -- 4
		//Finally, object is created -- 5
		
		//'final' keyword examples are given in SuperBike Class;
		//initializerEg.speedLimit = 200; - Final 1 - cannot change variable.
		//initializerEg.start() - Final 2 - cannot use start() method of SuperBike class because of final keyword in Vehicle.start()
		//SuperSuperBike - Final 3 - cannot extend SuperBike with keyword final
		
		
		Vehicle upCast = new Car();//Upcast - polymorphism
		Car noUpCast = new Car();//Without upcast
		Vehicle upCast2 = new SuperBike();//Upcast
		upCast2.turn();//Method overriding happens the same way even if you upcast
		Bike upcast3 = new SuperBike();
		System.out.println("Upcast petrol value: " + upcast3.petrol);//Bike.petrol instead of SuperBike.petroll
		//Bank sbi1 = new SBI();
		//Bank icici1 = new ICICI();
		
		//static binding - object type determined at compile time
		Car staticBinding = new Car();
		//dynamic binding - object type determined at runtime.
		Vehicle dynamicBinding = new Car();
		
		//Terms:
		//instance = object = variable
		//method = function
		
		Car instanceCheck = new Car();
		System.out.println("instanceCheck is Car's instance: " + (instanceCheck instanceof Car));
		//System.out.println("instanceCheck is Bike's instance: " + (instanceCheck instanceof Bike));//ERROR - compile time. Bike and instanceCheck are not related
		System.out.println("instanceCheck is Vehicle's instance: " + (instanceCheck instanceof Vehicle));
		
		Vehicle instanceCheck2;
		//System.out.println("instanceCheck2 is Car's instance: " + (instanceCheck2 instanceof Car));//ERROR - compile time. instanceCheck2 is not initialized
		instanceCheck2 = new Car();
		System.out.println("instanceCheck2 is Car's instance: " + (instanceCheck2 instanceof Car));
		System.out.println("instanceCheck2 is Bike's instance: " + (instanceCheck2 instanceof Bike));//No error because Vehicle can have both Car and Bike objects
		
		//instanceCheck2.drive();//Cannot use Car.drive() because the instance is a Vehicle.
		if(instanceCheck2 instanceof Car) {
			Car downCastEg = (Car)instanceCheck2;//Downcast performed
			downCastEg.drive();//Now we can use Car.drive() because we have downcasted
		} else if(instanceCheck2 instanceof Bike) {
			Bike downCast = (Bike)instanceCheck2;
		}
		
	}
	
	public static void abstraction() {
		//Abstract class:
		//Cannot create object for Vehicle class because Vehicle is an Abstract class
		//Vehicle something = new Vehicle(4562, null);
		
		//Abstract Method
		Vehicle car = new Car();
		car.engine();

		//Cannot create object for interface.
		//Seat interfaceObject = new Seat();
		
		//Car implements Seat
		Seat inheritedSeat = new Car();
		inheritedSeat.adjustSeat();
		inheritedSeat.seatCover();
		System.out.println("seatColour: " +inheritedSeat.seatColour);
		System.out.println("seatDesign: " +inheritedSeat.seatDesign);
		System.out.println("seatMaterial: " +inheritedSeat.seatMaterial);
		System.out.println("seatCushion: " +inheritedSeat.seatCushion);
		System.out.println("seatColour: " +Seat.seatColour);
		System.out.println("seatDesign: " +Seat.seatDesign);
		System.out.println("seatMaterial: " +Seat.seatMaterial);
		System.out.println("seatCushion: " +Seat.seatCushion);
		
		Car inheritedSeat2 = new Car();
		inheritedSeat2.adjustSeat();
		inheritedSeat2.seatCover();
		//multiple interface implements for a Class. Car implements Seat, Window.
		inheritedSeat2.openWindow();
	}
	
	public static void encapsulation() {
		//Packages - folder.
		//This class com.nbit.learn.oops.encapsulation.OopsEncapsulationEg 
		//in the package com.nbit.learn.oops.encapsulation
		//is in folder com/nbit/learn/oops/encapsulation/
		
		//you need to import and then use the class
		//or mention package straight away while using a class.
		
		//Access Modifiers:
		//public: public can be accessed everywhere. Outside the class & outside the package also.
		//private: private can be accessed only within the class. Cannot be accessed outside.
		//protected: protected can be accessed within the package, protected can be accessed in the derived class
		//default: default can be access only within the package.
		
		AccessModifierEg1 e1 = new AccessModifierEg1();
		AccessModifierEg2 e2 = new AccessModifierEg2();
		AccessModifierEg3 e3 = new AccessModifierEg3();
		AccessModifierEg1Derived e1d = new AccessModifierEg1Derived();
		
		//Public method access example:
		e1.accessVariables();
		AccessModifierEg1.callPublicMethod();
		AccessModifierEg2.callPublicMethod();
		AccessModifierEg1Derived.callPublicMethod();
		AccessModifierEg3.callPublicMethod();//Public method can be accessed anywhere
		
		//Private method access example:
		//Trying to access private method in the class AccessModifierEg1
		//e2.accessVariables();
		AccessModifierEg1.callPrivateMethod();//Works only within the same class
		AccessModifierEg2.callPrivateMethod();//ERROR - compile time
		AccessModifierEg1Derived.callPrivateMethod();//ERROR - compile time
		AccessModifierEg3.callPrivateMethod();//ERROR
		
		//Protected method access example:
		//e3.accessVariables();
		AccessModifierEg1.callProtectedMethod();
		AccessModifierEg2.callProtectedMethod();
		AccessModifierEg1Derived.callProtectedMethod();
		AccessModifierEg3.callProtectedMethod();//ERROR - compile time
		
		//Default method access example:
		//e1d.accessVariables();
		AccessModifierEg1.callDefaultMethod();
		AccessModifierEg2.callDefaultMethod();
		AccessModifierEg3.callDefaultMethod();//ERROR -compile time
		AccessModifierEg1Derived.callDefaultMethod();//ERROR - compile time
		

		//Getter , Setter Examples:
		//e2.data = "Nothing"; - private - cannot access
		e2.setData("Nothing");//Calling Setter Method
		System.out.println("data value = " + e2.getData());
		System.out.println("name value = " + e2.getName());
		System.out.println("access count = " + e2.getAccessCount());
	}
	
	public static void misc() throws CloneNotSupportedException {
		
		//Clone Example:
		Object o = getObject();
		System.out.println("Object.getClass = " + o.getClass());
		System.out.println(o.toString());
		
		Object p = o;
		((Bike)o).reg = 7654;
		System.out.println("o reg = " + ((Bike)o).reg);
		System.out.println("p reg = " + ((Bike)p).reg);
		
		Bike q = (Bike)((Bike)o).clone();
		((Bike)o).kms = 60L;
		q.kms = 70L;
		System.out.println("o kms = " + ((Bike)o).kms);
		System.out.println("q kms = " + q.kms);
		System.out.println("p kms = " + ((Bike)p).kms);
		
		
	}
	
	public static Object getObject() {
		return new Bike();
	}
}
