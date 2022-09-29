package com.nbit.learn;

public class Operators {
	public static void unary() {
		int a = 10;
		System.out.println(a++);//post increment // a , a + 1
		System.out.println(a);
		a = 10;
		System.out.println(++a);//pre increment
		a = 10;
		System.out.println(++a + a++); //11 + 11
		System.out.println(a);//12
		System.out.println(a++ + ++a); // 13 + 13 = 26// right to left evaluation
		//14
		
		a=10;
		System.out.println("Pre decrement:" + --a);//pre decrement// a = a - 1;
		System.out.println("a=" + a);
		a = 10;
		System.out.println("Post decrement:" + a--);// post decrement// a =a; a = a - 1;
		System.out.println("a=" + a);
	}
	
	public static void unary2() {
		boolean a = true;
		//unary not
		System.out.println(!a);
		System.out.println(a);
		System.out.println(!!a);
		//! operator changes true to false
		//! operator changes false to true
		System.out.println(!!!a);
		
		int b = 2;
		System.out.println(b);
		System.out.println(~b);//~ reverses all the bits
		b = 21;
		System.out.println(b);
		System.out.println(~b);
	}
	
	public static void arithmetic() {
		int a = 10, b = 10;
		int c;
		c = a + b;
		System.out.println("a(" + a + ") + b(" + b + ") = c(" + c + ")");
		c = a - b;
		System.out.println("a-b=" + c);
		c = a * b;
		System.out.println("a*b=" + c);
		c = 12 / 10;
		System.out.println("a/b=" + c);
		c = 12 % 10;//modulus operator; reminder of division
		System.out.println("a%b=" + c);
	}
	
	public static void shift() {
		//left shift
		int a = 10;
		int b = a << 2;//left shifts all bits 2 times, so 2 bits with 0 values are added in the end.
		System.out.println(b);
		a = 1;
		b = a << 3;
		System.out.println("1 << 3 = " + b);
		
		//right shift
		a = -2;
		b = a >> 1;//adds bits preserving MSB
		System.out.println("2 >> 1 = " + b);
		
		a = -2;
		b = a >>> 1;//adds leading zeros
		System.out.println("2 >>> 1 = " + b);
	}
	
	public static void bitOperations() {
		int a = 10;
		int b = 3;
		int c = a | b;//1 if any one bit is 1
		System.out.println("a|b = " + c);
		c = a & b;//1 if both bits are 1
		System.out.println("a&b = " + c);
		c = ~c;
		System.out.println("~c = " + c);
		c = a ^ b;
		System.out.println("a ^ b = " + c);
		c = a | b | 4;
		System.out.println(" a | b | 4 = " + c);
		c = a & b & 4;
		System.out.println(" a & b & 4 = " + c);
	}
	
	public static void conditional() {
		int a = 10, b = 3;
		boolean c = a > b;
		System.out.println("a > b = " + c);
		System.out.println("a < b = " + (a < b));
		System.out.println("a <= b = " + (10 <= 10));
		System.out.println("a <= b = " + (9 <= 10));
		System.out.println("a >= b = " + (a >= 14));
		System.out.println("a >= b = " + (a >= 10));
		System.out.println("a >= b = " + (a == 10));
		System.out.println("a >= b = " + (9 == 10));
		

		System.out.println("((a >= b) | (b >= a)) " + ((a >= b) | (b >= a)));//always true

		System.out.println("((a >= b) & (b > a)) " + ((a >= b) & (b > a)));//always false
	}
	
	public static void logical() {
		int a = 10; int b = 5;
		System.out.println(" true || false" +  (true || false));
		System.out.println(" true || false" +  (true && false));
		
		System.out.println("((a >= b) || (b >= a)) " + ((a >= b) || (b >= a)));//always true

		System.out.println("((a >= b) && (b > a)) " + ((a >= b) && (b > a)));//always false
	}
	
	public static void assignment() {
		int a = 5;
		int b = 7;
		b += a;//b = b + a;
		System.out.println("b value = " + b);
		b -= a;//b = b - a;//b = 12 - 5;
		System.out.println("b value = " + b);
		b /= a;//b = b / a; b = 7/5 = 1;
		System.out.println("b value = " + b);
		b += 5;//b = b + 5;
		System.out.println("b value = " + b);
		b %= 5;//b = b % 5; b = 6 % 5 = 1 //modulus operator
		System.out.println("b value = " + b);
		
	}

}
