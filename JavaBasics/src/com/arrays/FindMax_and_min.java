package com.arrays;

public class FindMax_and_min {

	public static void main(String[] args) {
		int[] arr = { 12, 263, 2363, 53, 62 };
		int max = arr[0];
		int min = arr[0];
		for (int a : arr) {
			if (a > max)
				max = a;
			if (a < min)
				min = a;
		}
		System.out.println("max element:" + max);
		System.out.println("min element:" + min);
	}

}
