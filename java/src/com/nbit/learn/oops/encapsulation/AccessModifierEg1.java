package com.nbit.learn.oops.encapsulation;

public class AccessModifierEg1 {
	public String name1 = "PS";
	private String name2 = "Prince";
	protected String name3 = "PS";
	String name4 = "PS";
	
	public void accessVariables() {
		AccessModifierEg1 e1 = new AccessModifierEg1();
		e1.name1 = "n1";
		e1.name2 = "n2";
		e1.name3 = "n3";
		e1.name4 = "n4";
	}
	
	public static void aPublicMethod() {
		System.out.println("This is a public method.");
	}
	
	private static void aPrivateMethod() {
		System.out.println("aPrivateMethod() is a private method in the class AccessModifierEg1");
	}
	
	protected static void aProtectedMethod() {
		System.out.println("This is a protected method");
	}
	
	//default static void aDefaultMethod() {}//ERROR - default keyword can be given only in interface
	
	static void aDefaultMethod() {
		System.out.println("This is a default method");
	}
	
	public static void callPublicMethod() {
		AccessModifierEg1.aPublicMethod();
	}
	
	public static void callPrivateMethod() {
		//aPrivateMethod() can be called only within this class because it's private.
		AccessModifierEg1.aPrivateMethod();//No Error. (only here)
	}
	
	public static void callProtectedMethod() {
		AccessModifierEg1.aProtectedMethod();//No error
	}
	
	public static void callDefaultMethod() {
		AccessModifierEg1.aDefaultMethod();
	}
}
