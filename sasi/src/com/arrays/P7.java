package com.arrays;

public class P7 {

	public static void main(String[] args) {
		int[] arr = { 12, 00, 33, 23, -23, 84, -932 };
		int min = arr[0];
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("min value:" + min);
		System.out.println("max value:" + max);
	}

}
