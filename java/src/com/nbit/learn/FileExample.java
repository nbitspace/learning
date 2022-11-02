package com.nbit.learn;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileExample {
	public static void readFile() throws FileNotFoundException, IOException {
		File f = new File("/home/geeky/geekey/work/eclipse-workspace/learning/java/resources/file-tutorial.txt");
		File f2 = new File("/home/geeky/geekey/work/eclipse-workspace/learning/java/resources/file2.txt");
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String temp = "";
		while((temp = br.readLine()) != null) {
			System.out.println("File: " + temp);
		}
		br.close();
	}
	
	public static void readFileWithScanner() throws FileNotFoundException {
		File f = new File("/home/geeky/geekey/work/eclipse-workspace/learning/java/resources/file2.txt");
		
		Scanner sc = new Scanner(f);
		while(sc.hasNextLine()) {
			String temp = sc.nextLine();
			System.out.println("File: " + temp);
		}
		sc.close();
		
		File f1 = new File("/home/geeky/geekey/work/eclipse-workspace/learning/java/resources/file-tutorial.txt");
		FileInputStream fis = new FileInputStream(f1);
		Scanner scanner = new Scanner(fis);
		while(scanner.hasNext()) {
			System.out.println(scanner.next());
		}
		scanner.close();
	}
}
