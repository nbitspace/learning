package com.nbit.learn.mycollection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

import com.nbit.learn.oops.Bike;
import com.nbit.learn.oops.Car;
import com.nbit.learn.oops.Vehicle;

class Sorter implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		if(o1.length() > o2.length()) return 1;
		if(o1.length() < o2.length()) return -1;
		return 0;
	}
}


public class ListEg {
	static ArrayList<String> maligaiList = new ArrayList<String>();
	
	public static void arrayListExample() {
		//ArrayList<String> maligai = new ArrayList<String>();
		List<String> maligai = new ArrayList<String>();
		maligai.add("Sakarai");
		maligai.add("Uppu");
		maligai.add("Paruppu");
		
		System.out.println("Third in list: " + maligai.get(2));
		
		maligai.add("vathal");
		maligai.add("appalam");
		System.out.println("Fourth in list: " + maligai.get(3));
		
		maligai.add(3, "paste");
		
		//iterating with normal for loop
		for(int i=0; i < maligai.size(); i++) {
			System.out.println( i + "th value= " + maligai.get(i));
		}
		
		maligai.set(5, "brush");
		
		//iterating with Iterator
		Iterator iter = maligai.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		maligai.add("soap");
		maligai.remove(0);
		maligai.remove("Uppu");
		
		//Iterating with for-each
		System.out.println("\nChanged list:");
		for(String maligaiSaman: maligai) {
			System.out.println(maligaiSaman);
		}
		
		maligai.add("chips");
		//Iterating with forEach() method
		System.out.println("\nLoop with forEach() method:");
		maligai.forEach(maligaiSaman -> {
			maligaiSaman = maligaiSaman.toUpperCase();
			System.out.println(maligaiSaman);
		});
		
		maligai.add("chips");//We can add same value multiple times in ArrayList
		//Iterating with Iterator.forEachRemaining() method
		System.out.println("\nLoop with Iterator.forEachRemaining() method:");
		Iterator<String> i = maligai.iterator();
		i.forEachRemaining(maligaiSaman -> {
			maligaiSaman = maligaiSaman.toLowerCase();
			System.out.println(maligaiSaman);
		});
		
		
		//Array list contains mixed type of elements
		ArrayList mixedList = new ArrayList(20);
		System.out.println("Size of mixedList: " + mixedList.size());
		mixedList.add(123);
		mixedList.add("Str");
		Vehicle bike = new Bike();
		mixedList.add(bike);
		Iterator it = mixedList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//ArrayList contains class objects as list
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(bike);
		vehicles.add(new Car("Black", "X", 6574));
		
	}
	
	public static void arrayToArrayList() {
		
		//Array to Array List
		String[] arr = {"Revi", "Pradeep", "Rangan", "Kumar"};
		System.out.println("Array values: " + Arrays.toString(arr));
		List<String> l1 = new ArrayList<String>();
		for(String val: arr) {
			l1.add(val);
		}
		System.out.println("List1 values: " + l1);
		
		List<String> l2 = Arrays.asList(arr);
		System.out.println("List2 values: " + l2);
		
		//Array List to Array
		List<String> l3 = new ArrayList<String>(List.of("Vaishanth", "Akash", "Vaishanth"));
		String[] arr3 = l3.toArray(new String[l3.size()]);
		System.out.println("arr3 values: " + Arrays.toString(arr3));
	}
	
	public static void arraylistSortingEg() {
		addToMaligaiList();
		// Sorting list
		System.out.println("\nPrinting sorted list:");
		Collections.sort(maligaiList);
		for(String v: maligaiList) System.out.println(v);
		
		System.out.println("\nPrinting sorted list reverse:");
		Collections.sort(maligaiList, Collections.reverseOrder());
		for(String v: maligaiList) System.out.println(v);
		
		System.out.println("\nPrinting sorted list case insensitive:");
		Collections.sort(maligaiList, String.CASE_INSENSITIVE_ORDER);
		for(String v: maligaiList) System.out.println(v);
		
		System.out.println("\nPrinting sorted list with letter count:");
		Collections.sort(maligaiList, new Sorter());
		for(String v: maligaiList) System.out.println(v);
		
		Comparator<Vehicle> c = Comparator.comparing(Vehicle::getReg);//Java8
		//Collections.sort(vehicleList, c);
	}
	
	public static void serializationEg() {
		addToMaligaiList();
		FileOutputStream fos;
		try {
			//Serialization
			fos = new FileOutputStream("ALSerial");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(maligaiList);
			System.out.println("Serialized maligaiList successfully");
			fos.close();
			oos.close();
			
			//Deserialization
			FileInputStream fis = new FileInputStream("ALSerial");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList iGotThis = (ArrayList)ois.readObject();
			System.out.println(iGotThis);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void addToMaligaiList() {
		maligaiList.add("Sakarai");
		maligaiList.add("Uppu");
		maligaiList.add("Paruppu");
		maligaiList.add("vathal");
		maligaiList.add("appalam");
		maligaiList.add("paste");
		maligaiList.add("CHips");
		maligaiList.add("chips");
	}
	
	public static void linkedListEg() {
		LinkedList<Integer> marks = new LinkedList<Integer>();
		marks.add(98);
		marks.add(88);
		marks.add(9);
		marks.add(89);
		marks.add(69);
		marks.add(2, 0);
		marks.addFirst(100);
		marks.addLast(1);
		marks.remove(2);
		
		for(Integer mark: marks) {
			System.out.println("Mark: " + mark);
		}
		
		Iterator i = marks.descendingIterator();
		while(i.hasNext()) {
			System.out.println("Marks descending: " + i.next());
		}
		
		//Find Max in a list
		int max = Collections.max(marks);
		System.out.println("Max mark in list: " + max);
		
		//Add array to a list
		Integer[] newMarks = { 70, 69, 68};
		Collections.addAll(marks, newMarks);
		System.out.println("Marks: " + marks);
		
	}
	
	public static void vectorEg() {
		//AbstractList<Long> val = new Vector<Long>();
		Vector<Long> val = new Vector<Long>();
		val.add(6543234543L);
		val.add(654L);
		val.add(25L);
		val.addElement(7654l);
		
		Iterator i = val.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	
	public static void stackEg() {
		Stack<String> st = new Stack<>();
		st.add("Nimba");
		st.add("simba");
		st.add("Kimba");
		String lastVal = st.pop();
		System.out.println("Last popped val in stack: " + lastVal);
		
		for(String val: st) {
			System.out.println("Stack val:" + val);
		}
		
		st.push("Bimba");
		System.out.println("Stack Print: ");
		for(String val: st) {
			System.out.println("Stack val:" + val);
		}
	}
}
