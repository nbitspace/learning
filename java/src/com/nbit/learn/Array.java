package com.nbit.learn;

import java.util.Random;

public class Array {
	public static void arrayIntExamples() {
		//Normal integer
		int b;//declaration
		b = 5;//initialization
		System.out.println(b);
		
		//integer array
		int[] a;//declaration
		a = new int[8];//instantiation - assigning size
		a[0] = 54;//initialization
		a[2] = 32;
		a[3] = 4;
		a[4] = 89;
		a[5] = 65;
		a[6] = 12;
		print(a);
		
		int[] c = {25, 30, 3, 2, 0, 1};
		print(c);
		System.out.println("For-Each Print array:");
		for(int item: c) {
			System.out.println(item);
		}
		
		int[] d = new int[] {31, 43, 50, 60};//another way of initialization
		print(d);
		print(new int[] {3, 2, 5, 7});//anonymous array
		
		int[] e = giveMeNewArray();
		print(e);
	}
	
	public static int[] giveMeNewArray() {//function return example
		int[] temp;
		temp = new int[] {43, 42, 41, 44, 45};
		return temp;
	}
	
	public static void print(int[] arr) {

		System.out.println("Length of array = " + arr.length);
		System.out.println("Printing array elements:");
		for(int i =0; i < arr.length; i++) {
			System.out.println(i + " = " + arr[i]);
		}
	}
	
	public static void stringArr1d() {
		String[] a = {"Vai", "Kai", "Hie", "Bye"};
		System.out.println("String[] print:");
		for(String item: a) {
			System.out.println(item);
		}
		

		String[] b = new String[] {"Kai", "Hie", "Bye"};
		System.out.println("String[] print:");
		for(int i = 0 ; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		char[] c = {'a', '1', '#'};
		System.out.println("char[] print:");
		for(char item: c) {
			System.out.println(item);
		}
	}
	
	public static void array2d() {
		int[][] a = new int[3][3];
		a[0][0] = 3;
		a[0][1] = 5;
		a[0][2] = 6;
		
		a[1][0] = 1;
		a[1][1] = 6;
		a[1][2] = 6;
		
		a[2][0] = 9;
		a[2][1] = 7;
		a[2][2] = 2;

		System.out.println("Length of array = " + a.length);
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("a[" + i + "][" + j + "] = " + a[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("Another 2-Dimensional array");
		//4x4
		//b[4][4]
		int[][] b = {
				{0, 1, 22, 3},
				{4, 532, 6},
				{8, 9, 821, 7},
				{64, 5, 4, 3}
				};
		print2D(a);
		print2D(b);
		
		//Random value generator
		Random x = new Random();
		int temp = x.nextInt(100);
		System.out.println("Random value:" + temp);

		System.out.println("Random 2-Dimensional array");
		int[][] c = new int[15][15];
		for(int i = 0; i < c.length; i++) {
			for(int j=0; j < c[i].length; j++) {
				c[i][j] = x.nextInt(100);//random value 0 - 100
			}
		}
		print2D(c);		
	}
	
	public static void className() {
		System.out.println("This class Name : " + Array.class);
		Array a = new Array();
		System.out.println("This class Name : " + a.getClass());
		System.out.println("This class Name : " + a.getClass().getName());
		int[] b = new int[3];
		System.out.println("B class Name : " + b.getClass());
		System.out.println("B class Name : " + b.getClass().getName());
		int[][] c = new int[3][3];
		System.out.println("C class Name : " + c.getClass());
		System.out.println("C class Name : " + c.getClass().getName());
		int[][][] d = new int[3][3][1];
		System.out.println("D class Name : " + d.getClass());
		System.out.println("D class Name : " + d.getClass().getName());
		
	}
	
	//Util
	public static void print2D(int[][] arr) {
		System.out.println("Printing 2-Dimensional array");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print( arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	

}
