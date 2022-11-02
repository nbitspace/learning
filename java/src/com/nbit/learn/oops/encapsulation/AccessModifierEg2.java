package com.nbit.learn.oops.encapsulation;

public class AccessModifierEg2 {
	private String name = "My Name";
	private String data = "Something";
	private static int changeCount = 0;
	private static int accessCount = 0;
	
	public static void callPrivateMethod() {
		//aPrivateMethod() can be called only within this class because it's private.
		//Private method cannot be used outside it's class.
		//AccessModifierEg1.aPrivateMethod();
	}
	
	public static void callProtectedMethod() {
		//Protected method of another class in same package can be called
		AccessModifierEg1.aProtectedMethod();//No error
	}
	
	public static void callPublicMethod() {
		AccessModifierEg1.aPublicMethod();
	}
	
	public static void callDefaultMethod() {
		AccessModifierEg1.aDefaultMethod();
	}
	
	public void setData(String data) {//Setter
		changeCount++;
		this.data = data;
	}
	
	public String getData() {
		accessCount++;
		return this.data;
	}
	
	public void setName(String name) {
		changeCount++;
		this.name = name;
	}
	
	public String getName() {
		accessCount++;
		return this.name;
	}
	
	public int getAccessCount() {
		accessCount++;
		return accessCount;
	}
}
