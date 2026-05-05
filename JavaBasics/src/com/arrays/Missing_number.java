package com.arrays;

public class Missing_number {

	public static void main(String[] args) {
		int[] arr = { 1,2,4,5};
		int n = 5;
		int exceptedOutput = n * (n + 1) / 2;
		int actualSum = 0;
		for (int a : arr) {
			actualSum += a;
		}
		System.out.println("Missing number :" + (exceptedOutput - actualSum));

		
	}

}
