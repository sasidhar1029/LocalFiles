package com.arrays;

public class Find_Largest_Smallest {

	public static void main(String[] args) {
		int arr[] = { 13, 30, 2, 15, 33 };
		int min = arr[0];
		int max = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Max Element:" + max);
		System.out.println("Min Element:" + min);
	}

}
