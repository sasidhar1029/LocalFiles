package com.Arrayss;

import java.util.HashSet;

//sum of unique elemets in a array
public class Arrays24 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 4, 4, 3, 5, 4, 5, 3 };
//		int sum = 0;
//		for (int i = 0; i < arr.length; i++) {
//			boolean isduplicate = false;
//			for (int j = 0; j < i; j++) {
//				if (arr[i] == arr[j]) {
//					isduplicate = true;
//					break;
//				}
//			}
//			if (!isduplicate) {
//				sum += arr[i];
//			}
//		}
//		System.out.println(sum);
		// (OR)
		HashSet<Integer> set = new HashSet<>();
		int sum = 0;

		for (int num : arr) {
			if (set.add(num)) { // adds only if not present
				sum += num;
			}
		}

		System.out.println("Sum without duplicates: " + sum);
	}
}
