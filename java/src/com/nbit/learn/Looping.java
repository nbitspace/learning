package com.nbit.learn;

public class Looping {
	public static void whileloop() {
		int i = 0;
		while (i < 10) {//while block gets executed until the condition becomes false
			System.out.println(i);
			i++;
		}
		System.out.println("i value after looping = " + i);
	}
	
	public static void dowhile() {
		int i = 10;
		
		while(i < 10) {
			System.out.println(i);
			i++;
		}
		
		do {
			System.out.println(i);
			i++;
		} while (i < 10);
		System.out.println("i value after do while = " + i);
		
		i = 0;
		do {
			System.out.println(i);
			i++;
		} while (i < 10);
		System.out.println("i value after do while = " + i);
	}
	
	public static void forloop() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			System.out.println("Hello");
		}
		System.out.println("\nSecond for:");
		for(int i = 0; i < 10; i = i + 2) {
			System.out.println(i);
			System.out.println("Hello");
		}
		System.out.println("\nThird for:");
		for(int i = 0; i < 10; i++) {
			if ((i % 2) == 0) {
				System.out.println(i);
				System.out.println("Hello");
			}
			System.out.println("Hello2");
		}
	}
	
	public static void breakAndContinue() {
		//break
		for(int i = 0 ; i < 20; i++) {
			if (i == 13) {
				break;
			}
			System.out.println(i);
			
		}
		
		System.out.println("\nBreak2:");
		for1://label
		for(int i =0; i < 10; i++) {
			System.out.println("i=" + i);
			for2:
			for(int var =0; var <3; var++) {
				if (i == 7)
					break for1;
				if (i % 3 != 0)
					break for2;
				System.out.println("  var=" + var);
			}
			System.out.println("  ;");
		}

		System.out.println("\nContinue:");
		for(int i = 0; i < 20; i++) {

			if(i%2 == 0) {
				continue;
			}
			if (i == 14) {
				break;
			}
			System.out.println(i);
		}
	}
	
	
}
