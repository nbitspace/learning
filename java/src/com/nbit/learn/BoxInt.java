package com.nbit.learn;

public class BoxInt {
	private int a;
	
	public BoxInt(int val) {
		this.a = val;
	}
	
	public int intValue() {
		return a;
	}
	
	public String toString() {
		return Integer.toString(a);
	}
	
}
