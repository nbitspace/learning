package com.nbit.learn.mycollection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class QueueEg {
	public static void priorityQueueEg() {
		PriorityQueue<String> q = new PriorityQueue<String>();
		q.add("PC");
		q.add("iPhone");
		q.add("Android");
		q.add("Car");
		System.out.println("Peek q: " + q.peek());
		System.out.println("Peek q: " + q.element());
		System.out.println("Q: " + q);
		
		String e = q.remove();
		System.out.println("Removed from queue: " + e);
		e = q.poll();
		System.out.println("Polled from queue: " + e);
		
		for(String val : q) {
			System.out.println("Queue elements: " + val);
		}
		
	}
	
	public static void arrayDequeEg() {
		//Deque - Double ended queue
		ArrayDeque<String> q = new ArrayDeque<String>();
		q.add("Vaishanth");
		q.add("Sathiya");
		q.add("Venkat");
		q.offer("PC");
		q.offerFirst("Fury");
		q.offerLast("Slay");
		
		for(String val : q) {
			System.out.println("Queue elements: " + val);
		}
		System.out.println();
		System.out.println("Peek:" + q.peek());
		System.out.println("Peek first:" + q.peekFirst());
		System.out.println("Peek last:" + q.peekLast());
		System.out.println("Q: " + q);
		System.out.println("Poll:" + q.poll());
		System.out.println("Q: " + q);
		System.out.println("Poll last:" + q.pollLast());
		System.out.println("Q: " + q);
		System.out.println("Poll first:" + q.pollFirst());
		System.out.println("Q: " + q);
	}
}
