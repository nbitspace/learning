package com.nbit.learn.oops.encapsulation2;

import com.nbit.learn.oops.encapsulation.AccessModifierEg1;

public class AccessModifierEg3 {
	public static void callProtectedMethod() {
		//Cannot call a protected method from another package.
		//AccessModifierEg1.aProtectedMethod();//ERROR - compile time
	}
	
	public static void callPublicMethod() {
		AccessModifierEg1.aPublicMethod();
	}
	
	public static void callPrivateMethod() {
		//Private method cannot be used ouside it's class.
		//AccessModifierEg1.aPrivateMethod();//ERROR - compile time
	}
	
	public static void callDefaultMethod() {

		//Default method cannot be used in another package
		//AccessModifierEg1.aDefaultMethod();
	}
}
