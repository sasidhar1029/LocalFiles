package com.arrays;
//find max and min value in a given array
public class P6 {

	public static void main(String[] args) {
		int[] arr = { 9, 8, -4, -3, 33, 19 };
		int min = arr[0];
		int max = arr[0];
		for (int a : arr) {
			if (a > max) {
				max = a;
			} else if (a < min) {
				min = a;
			}
		}
		System.out.println("min value:" + min);
		System.out.println("max value:" + max);
	}

}
