package com.nbit.learn.oops.encapsulation2;

import com.nbit.learn.oops.encapsulation.AccessModifierEg1;

public class AccessModifierEg1Derived extends AccessModifierEg1 {
	public static void callPublicMethod() {
		AccessModifierEg1.aPublicMethod();
	}
	
	public static void callPrivateMethod() {
		//Private method cannot be used ouside it's class.
		//AccessModifierEg1.aPrivateMethod();//ERROR - compile time
	}
	
	public static void callProtectedMethod() {
		//Protected method of another class in another package can be called if it's a derived class
		AccessModifierEg1.aProtectedMethod();
	}
	
	public static void callDefaultMethod() {
		//Default method cannot be used in another package
		//AccessModifierEg1.aDefaultMethod();
	}
}
