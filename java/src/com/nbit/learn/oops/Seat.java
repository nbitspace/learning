package com.nbit.learn.oops;

public interface Seat {
	//ERROR - compile time - you cannot define a method in an interface.
	//All methods are abstract by default.
//	void adjustSeat() {
//		System.out.println("Seat Adjusted");
//	}
	public static String seatColour = "Black";
	public final String seatDesign = "Flower pattern";
	public String seatMaterial = "Leather";
	public final boolean seatCushion = true;
	
	public void adjustSeat();//It's an abstract method by default
	abstract void seatCover();//public by default
}
