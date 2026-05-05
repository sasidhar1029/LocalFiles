package com.arrays;

public class Check_array_is_sorted {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 49, 93, 933, 23 };
		boolean sorted = true;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < arr[i + 1]) {
				sorted = false;
				break;
			}
		}
		System.out.println(sorted);
	}

}
