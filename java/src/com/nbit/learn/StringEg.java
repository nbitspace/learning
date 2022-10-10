package com.nbit.learn;


//POJO - Plain Old Java Object - Simple Class
public class StringEg {
	public static void aboutString() {
		String str = "hello string";
		System.out.println(str);
		
		char[] a = {'h', 'e', 'l', 'l', 'o', 'c'};
		String a1 = new String(a);
		System.out.println(a);
		System.out.println(a1);
		
		String str1 = "hello string";
		System.out.println(str1);
		
		String s1 = "abcd";
		String s2 = s1;
		s2 = "bbcd";
		System.out.println("s1" + s1);
		System.out.println("s2" + s2);
		
		System.out.println("Length of string:" + str.length());
		System.out.println("Char at 4: " + str.charAt(4));
		String subStr = str.substring(6);
		System.out.println("Substring: " + subStr);
		System.out.println("Str after Substring: " + str);
		System.out.println("Substring: " + str.substring(6, 9));
	}
	
	public static void methods1() {
		
		//equals
		String a = "hello";
		String b = "hello";
		String c = new String("hello");
		Integer d = 10;
		String e = "yellow";
		
		boolean bool = (a == b);
		System.out.println("a==b = " + bool);
		System.out.println("a.equals(c) = " + a.equals(c));
		System.out.println("d=='10' = " + "10".equals(d));
		System.out.println("10==b = " + "10".equals(b));
		System.out.println("d=='10' = " + "10".equals(d.toString()));
		System.out.println("caps==small = " + a.equals("HELLO"));
		System.out.println("check = " + a.equals("HELLO".toLowerCase()));
		
		System.out.println("\ncompareTo():");
		System.out.println("Compare equal1: " + a.compareTo(b));
		int comp = a.compareTo("Hello");//h - H = 104 - 72 = 32
		System.out.println("Compare 2: " + comp);
		System.out.println("Compare 3: " + a.compareTo("jello"));//h - j = 104 - 106 = -2
		System.out.println("Compare 2: " + String.valueOf(a.compareTo("hillo")));//e - i = 101 - 105 = -4
		

		System.out.println("\nconcatenation - appending - join:");
		String temp = a + e;
		System.out.println("Concat1: " + temp);
		temp = a + " " + e;
		System.out.println("Concat2: " + temp);
		temp = 10 + 10 + 1 + temp + 30 + 2 +  " " + 30 + (2 + 1);
		System.out.println("Concat3: " + temp);
		
		//concatenation - StringBuilder
		StringBuilder sb = new StringBuilder();
		sb.append("My");
		System.out.println("Adding to StringBuilder");
		sb.append(" ");
		sb.append(bool);
		sb.append(" value ");
		sb.append("is ");
		System.out.println("Appending more values to SB");
		sb.append(comp);
		temp = sb.toString();
		System.out.println("SB result: " + temp);
		
		temp = String.format("%s all! My %b value is %d. %%s. %%. Hey percentage: %%", a, bool, comp);
		System.out.println("String.format: " + temp);
		
		System.out.println("String Join Eg: " + String.join(" | ", a, e, b, c));
	}
}
