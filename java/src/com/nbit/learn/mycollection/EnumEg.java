package com.nbit.learn.mycollection;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EnumEg {
	public static void enumEg() {
		Days myDay = Days.friday;
		Days today = Days.holiday;
		System.out.println("myDay: " + myDay);
	}
	
	public static void enumSet() {
		Set<Days> s = EnumSet.of(Days.saturday, Days.sunday);
		System.out.println("Enum Set: " + s);
		
		Set<Days> s1 = new HashSet<Days>();
		s1.add(Days.saturday);
		s1.add(Days.sunday);
		System.out.println("Hashset Enum: " + s1);
		
		Set<Days> s2 = EnumSet.allOf(Days.class);
		System.out.println("s2 values: " + s2);
	}
	
	public static void enumMap() {
		EnumMap<Days, Integer> em = new EnumMap<Days, Integer>(Days.class);
		em.put(Days.sunday, 1);
		em.put(Days.monday, 2);
		em.put(Days.tuesday, 3);
		
		for(Map.Entry e : em.entrySet()) {
			System.out.println(e.getKey() + " = " + e.getValue());
		}
	}
}
