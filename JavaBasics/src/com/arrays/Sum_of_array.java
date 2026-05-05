package com.arrays;

public class Sum_of_array {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 40 };
		int sum = 0;
		for (int a : arr) {
			sum += a;
		}
		System.out.println(sum);
	}

}
