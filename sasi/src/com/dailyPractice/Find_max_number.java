package com.dailyPractice;

public class Find_max_number {

	public static void main(String[] args) {

		int[] arr = { 10, 20, -1, 0, -8, 33, 93, -92 };
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("max element in given array:"+max);
	}

}
