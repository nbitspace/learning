package com.nbit.learn;

public class Misc {
	public static void misc() {
		//Math Example:
				Double a = 56D;
				double b = 16;
				double c;
				c = Math.max(a, b);
				System.out.println("Max of numbers: " + c);
				c = Math.sqrt(b);
				System.out.println("Square root of b: " + c);
				c = Math.pow(b, 3);
				System.out.println("b power 3: " + c);
				b = 16.2;
				c = Math.ceil(b);
				System.out.println("ceil b: " + c);
				c = Math.floor(b);
				System.out.println("floor b: " + c);
				c = Math.round(b);
				System.out.println("rounding off b: " + c);
				b = 16.5;
				c = Math.round(b);
				System.out.println("rounding off b: " + c);
				c = Math.abs(b);
				System.out.println("absolute b: " + c);
				b = -b;
				System.out.println("b value: " + b);
				c = Math.abs(b);
				System.out.println("absolute b: " + c);
				
				//Wrapper class:
				int d = 105;
				Integer e = 679;//boxing
				String f = e.toString();
				long g = 365245;
				Long h = 543256L;//boxing
				h.longValue();
				Long i = new Long(43664);//deprecated
				Integer j = new Integer(679);
				BoxInt k = new BoxInt(105);
				int l = k.intValue();
				f = k.toString();
	}
}
