package com.nbit.learn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {
	public static void stringInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Name:");
		String input = scanner.nextLine();
		System.out.println("Enter your Pincode:");
		String input2 = scanner.nextLine();
		System.out.println("Your Name is " + input + " and your pincode is " + input2);
		while(true) {
			String tempInput = scanner.nextLine();
			if(tempInput.equals("x")) {
				break;
			}
			System.out.print("You have given: " + tempInput);
		}
		
		System.out.println("Enter something:");
		String test = scanner.next();
		System.out.println("test: You have given: " + test);
		
		String test1 = scanner.next();
		String test2 = scanner.nextLine();
		String test3 = scanner.next();
		String test4 = scanner.next();
		System.out.println("test1: You have given: " + test1);
		System.out.println("test2: You have given: " + test2);
		System.out.println("test3: You have given: " + test3);
		System.out.println("test4: You have given: " + test4);
		scanner.close();
	}
	
	public static void intInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your birth year:");
		int input = sc.nextInt();
		System.out.println("Your age is: " + (2022 - input));
		

		System.out.println("Enter something:");
		int i2 = sc.nextInt();
		int i3 = sc.nextInt();
		System.out.println("i2: You have given: " + i2);
		System.out.println("i3: You have given: " + i3);
		sc.close();
	}
	
	public static void inputWithBR() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter something:");
		String something = br.readLine();
		System.out.println("You entered: " + something);
		int sth = Integer.parseInt(br.readLine());//Integer.parseInt converts string to integer
		System.out.println("Integer you entered is: " +sth);
		br.close();
	}
}
