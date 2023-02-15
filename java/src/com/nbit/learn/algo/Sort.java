package com.nbit.learn.algo;

public class Sort {
	public static void selectionSortEg() {
		int arr[] = { 67, 54, 345, 89, 87, 2, 32, 20, 1};
		printArray(arr);
		for(int i = 0; i < arr.length; i++) {
			int minIndex = i;
			for(int j = i+1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		
		System.out.println("Sorted Array:");
		printArray(arr);
	}
	
	private static void printArray(int[] a) {
		for(int val: a) {
			System.out.print(val + ", ");
		}
		System.out.println();
	}
}
