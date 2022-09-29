package com.nbit.learn;

public class ControlStatements {
	public static void simpleIf() {
		int a = 5;
		if (a == 6) {
			System.out.println("A value is 6");
		}
		String b = "PC";
		if (b == "PC") {
			System.out.println("B value is PC");
		}
		
		if (a == 6 || b.equals("PC")) {// and:&& , or:||, not:!
			System.out.println("inside if (a == 6 || b.equals(\"PC\"))");
		}
		
		if (a == 6 && b.equals("PC")) {// and:&& , or:||, not:!
			System.out.println("inside if (a == 6 && b.equals(\"PC\"))");
		}
	}
	
	public static void ifElse() {
		int a = 5;
		if (a >= 6) {
			System.out.println("A value is greater than 5");
		} else {
			System.out.println("A is less than 6");
		}
		String b = "PC";
		if (b != "PC") {
			System.out.println("B value is not PC");
		} else {
			System.out.println("B value is PC");
		}
		
		if (a == 6 || b.equals("PC")) {// and:&& , or:||, not:!
			System.out.println("inside if (a == 6 || b.equals(\"PC\"))");
		} else {
			System.out.println("inside else (a == 6 || b.equals(\"PC\"))");
		}
		
		if (a == 6 && b.equals("PC")) {// and:&& , or:||, not:!
			System.out.println("inside if (a == 6 && b.equals(\"PC\"))");
		} else {
			System.out.println("inside else (a == 6 && b.equals(\"PC\"))");
		}
	}
	
	public static void ifElseIfElse() {
		String a = "n";
		if(a == "a") {
			System.out.println("Vovel 'a'");
		} else if(a == "e") {
			System.out.println("Vovel 'e'");
		} else if (a == "i") {
			System.out.println("Vovel 'i'");
		} else 
			if (a == "o") {
			System.out.println("Vovel 'o'");
		} else if (a == "u") {
			System.out.println("Vovel 'u'");
		} else {
			System.out.println("Consonant '" + a + "'");
		}
		
		if(a == "a" || a == "e" || a == "i" || a == "o" || a=="u") {
			System.out.println("Vovel '" + a + "'");
		} else {
			System.out.println("Consonant '" + a + "'");
		}
	}
	
	public static void nestedIf() {
		String names = "Vaishanth,Vetri,Anitha";
		if (names.contains("PC")) {
			System.out.println("names has PC");
		} else {
			System.out.println("first else");
			if (names.contains("Fury")) {
				System.out.println("names has Fury, no PC");
			} else {
				System.out.println("names does not have Fury & PC");
			}
		}
	}
	
	public static void switchCase() {
		String letter = "e";
		System.out.println("First switch block without break");
		switch(letter) {
		case "a":
			System.out.println("Vovel a");
		case "e":
			System.out.println("Vovel e");
		case "i":
			System.out.println("Vovel i");
		case "o":
			System.out.println("Vovel o");	
		case "u":
			System.out.println("Vovel u");
		default:
			System.out.println("Consonant '" + letter + "'");
			
		}
		
		System.out.println("Second switch block with break");
		switch(letter) {
		case "a":
			System.out.println("Vovel a");
			break;
		case "e":
			System.out.println("Vovel e");
			break;
		case "i":
			System.out.println("Vovel i");
			break;
		case "o":
			System.out.println("Vovel o");
			break;
		case "u":
			System.out.println("Vovel u");
			break;
		default:
			System.out.println("Consonant '" + letter + "'");
		}
		
		System.out.println("Third switch block without break");
		switch(letter) {
		case "a":
		case "e":
		case "i":
		case "o":	
		case "u":
			System.out.println("Vovel '" + letter + "'");
			break;
		default:
			System.out.println("Consonant '" + letter + "'");
			
		}
	}
}
