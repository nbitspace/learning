package com.nbit.learn;

//import java.lang; //imported by default

public class Variables {
	
	//boolean
	public static void varBoolean() {
		boolean a = true;
		System.out.println(a);
		System.out.println(false);
		if (!a) {//a value is unaffected;
			System.out.println("Inside if statement");
		} else {
			System.out.println("Inside else statement");	
		}
		System.out.println(a);
	}
	
	//int, Integer datatype
	public static void varInt() {
		// Integer values .... INT_MIN -2, -1, 0 , 1, 2, 3, 4 ....
		//int for; Err: Keywords cannot be given as variable names
		int akash = 20;
		System.out.println("akash=" + akash);
		akash = Integer.MAX_VALUE;
		System.out.println("akash=" + akash);
		akash = Integer.MIN_VALUE;
		System.out.println("akash=" + akash);
		akash = 15;
		
		Integer PC = 15;
		System.out.println("PC=" + PC);
		System.out.println("PC intValue=" + PC.intValue());
		System.out.println("PC binary=" + Integer.toBinaryString(PC));
		
		Integer v = 0x7fffffff;//max value in hexadecimal
		System.out.println("v=" + v.toBinaryString(v));
		
		int iPhone = akash + PC - 30;//integer arithmetic
		System.out.println("iPhone value = " + iPhone);
	
	}
	
	//short datatype
	public static void varShort() {
		int iPhone = 15;
		short n1 = 15;//short is 2 bytes
		System.out.println("n value = " + n1);
		iPhone = n1;
		System.out.println("iPhone value = " + iPhone);
		
		//cast int to short - big int value
		iPhone = Integer.MAX_VALUE  - 10;
		n1 = (short)iPhone;
		System.out.println("iphone= " + iPhone);
		System.out.println("n1 value after typecast= " + n1);
		
		n1 = 0B111111111111111;//max value of short in binary format
		System.out.println("signed n1 value binary format assign = " + n1);
		
		//unsigned short n2;//no unsigned in Java
	}
	
	//byte datatype example
	public static void varByte() {
		byte b = 127;//max value for byte
		//byte value range -128 to 127
		System.out.println("b value = " + b);
	}
	
	public static void varLong() {
		long a;//only declaration, no initialization/assignment
		a = 10;
		System.out.println("a long value:" + a);
		
		Long b;
		b = 10l;
		b = 10L;
		System.out.println("b long value:" + b);
		
		b = Long.MAX_VALUE;
		System.out.println("long b - max value:" + b);
		
		//2^63 - 1 = 63 1s = long max value
		b = 0b111111111111111111111111111111111111111111111111111111111111111L;
		System.out.println("long b - max value with binary:" + b);
	}
	
	public static void varFloatAndDouble() {
		float a = 1.131465321234F;
		System.out.println("float a = " + a);
		
		Float b = 1813.1314f;
		System.out.println("float b = " + b);
		System.out.println("float b MAX_EXPONENT = " + Float.MAX_EXPONENT);
		System.out.println("float b BYTES = " + Float.BYTES);
		System.out.println("float b MAX_VALUE = " + Float.MAX_VALUE);
		System.out.println("float b MIN_VALUE = " + Float.MIN_VALUE);
		System.out.println("float b MIN_NORMAL = " + Float.MIN_NORMAL);
		System.out.println("float b NEGATIVE_INFINITY = " + Float.NEGATIVE_INFINITY);
		
		Float d = 2E-2F;//2 * 10^-2
		System.out.println("float d = " + d);
		
		d = 2e2f;//2 * 10^2
		System.out.println("float d = " + d);
				
		Double c = 1813.1314151699985154;
		System.out.println("Double c = " + c);
		long bits = Double.doubleToLongBits(c);
		System.out.println(Long.toBinaryString(bits));
		
		double e = 12345e-2;
		System.out.println("double e = " + e);

	}
	
	public static void varChar() {
		char a = 'z';//char in single quote
		System.out.println("char a = " + a);
		
		a ='5';//any character
		System.out.println("char a = " + a);
		
		a ='%';//any character symbol
		System.out.println("char a = " + a);
		
		a = '\u0000';//unicode
		System.out.println("char a = " + a);
		a = '\u0001';//unicode
		System.out.println("char a = " + a);
		a = '\u0011';//unicode
		System.out.println("char a = " + a);
		a = '\u0070';//unicode
		System.out.println("char a = " + a);
		a = '\u006F';//unicode is in hexadecimal
		System.out.println("char a = " + a);
		a = '\u006E';//unicode is in hexadecimal
		System.out.println("char a = " + a);
		a = '\u0B8F';//tamil: 0B80 - 0BFF
		System.out.println("char a = " + a);
		a = '\u0B92';//tamil: 0B80 - 0BFF
		System.out.println("char a = " + a);
		a = '\u0BA9';//tamil: 0B80 - 0BFF
		System.out.println("char a = " + a);
		a = '\u1161';//unicode is in hexadecimal
		System.out.println("char a = " + a);
	}
	
	  
}
