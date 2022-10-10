package com.nbit.learn.algo;

public class ArrayAlgo {
	public static void greatestNumInArray() {
		int[] arr = { 3, 23, 54, 67, 22, 14, 23, 79, 66};
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			if (temp > max) {
				max = temp;
			}
		}
		System.out.println("Greatest element in array: " + max);
	}
}
