package com.arrays;

public class Remove_duplicates {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 30, 30, 63, 47 };
		for (int i = 0; i < arr.length; i++) {
			boolean Duplicate = false;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					Duplicate = true;
					break;
				}
			}
			if (!Duplicate) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
