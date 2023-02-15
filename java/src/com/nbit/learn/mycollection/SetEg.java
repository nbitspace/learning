package com.nbit.learn.mycollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.nbit.learn.oops.Bike;
import com.nbit.learn.oops.Car;
import com.nbit.learn.oops.SuperBike;
import com.nbit.learn.oops.Vehicle;

public class SetEg {
	public static void hashsetEg() {
		Boolean r;
				
		HashSet<String> hs = new HashSet<>();
		hs.add("akash");
		r = hs.add("harry");
		System.out.println("added harry? " + r);
		hs.add("potter");
		r = hs.add("harry");//duplicate values are not stored in HashSet
		System.out.println("added harry? " + r);
		
		for(String val: hs) {
			System.out.println("HashSet values: " + val);
		}
		Boolean contain = hs.contains("potter");
		System.out.println("HashSet has potter? " + contain);
		r = hs.remove("potter");
		System.out.println("removed potter? " + r);
		System.out.println("HashSet has potter? " + hs.contains("potter"));
		
		r = hs.remove("potter");
		System.out.println("removed potter? " + r);
		
		r = hs.remove("vaishanth");
		System.out.println("removed vaishanth? " + r);

		System.out.println("HashSet has kumar? " + hs.contains("kumar"));
		
		HashSet<Vehicle> vehicles = new HashSet<Vehicle>();
		vehicles.add(new Bike(200, 4590, "Y"));
		vehicles.add(null);
		Car c = new Car("Z", 7654);
		vehicles.add(c);
		for(Vehicle v : vehicles) {
			System.out.println("V HS:" + v);
		}
	}
	
	public static void collectionToSet() {
		ArrayList<Integer> markList = new ArrayList<Integer>() {
				{
					add(35);
					add(98);
					add(74);
				}
			};
			
		HashSet<Integer> markSet = new HashSet(markList);
		markSet.add(100);
		System.out.println("markSet Val: " + markSet);
	}
	
	public static void linkedHSEg() {

		//LinkedHashSet maintains order unlike HashSet
		LinkedHashSet<String> books = new LinkedHashSet<String>();
		books.add("Harry Potter");
		books.add(null);
		books.add("Ponniyin Selvan");
		books.add("Mahabaratham");
		books.add("Harry Potter");
		for(String book: books) {
			System.out.println("Book: " + book);
		}
	}
	
	public static void treeSetEg() {
		//TreeSet follows ascending order
		TreeSet<String> furniture = new TreeSet<String>();
		//Set<String> furniture = Collections.synchronizedSet(furnitureSet);
		furniture.add("A");
		furniture.add("Table");
		furniture.add("Window");
		furniture.add("wardrobe");
		furniture.add("Chair");
		//furniture.add(null);//ERROR: Runtime: Cannot add null to TreeSet
		
		for(String porul: furniture) {
			System.out.println("Book: " + porul);
		}
		
		System.out.println("Low value: " + furniture.first());
		System.out.println("High value: " + furniture.last());
		System.out.println("Poll first value: " + furniture.pollFirst());
		System.out.println("Poll first value: " + furniture.pollFirst());
		System.out.println("Poll last value: " + furniture.pollLast());
		
		furniture.add("Dressing Table");
		furniture.add("Dining Table");
		furniture.add("Stool");
		furniture.add("Sofa");
		System.out.println("Set:" + furniture);
		System.out.println("Descending Set:" + furniture.descendingSet());
		//Ceiling returns the first next element of the parameter if the parameter value is inserted.
		System.out.println("Ceiling Value:" + furniture.ceiling("W"));
		System.out.println("Floor Value:" + furniture.floor("Washer"));
		System.out.println("Head set: " + furniture.headSet("Stool"));
		System.out.println("Head set: " + furniture.headSet("Stool", true));
		System.out.println("Tail set: " + furniture.tailSet("Stool", false));
		System.out.println("Sub set: " + furniture.subSet("Sofa", false, "Table", true));
		
		
		System.out.println("Set:" + furniture);
	}
	
	public static void treeSetObjEg() {
		TreeSet<Vehicle> set = new TreeSet<Vehicle>();
		set.add(new Bike(200, 4590, "Y"));
		set.add(new SuperBike("Big", 300, 9999, "A"));
		Car c = new Car("Z", 7654);
		set.add(c);
		System.out.println("Set val: " + set);
	}
}
