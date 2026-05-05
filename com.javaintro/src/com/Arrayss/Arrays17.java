package com.Arrayss;

import java.util.Arrays;
import java.util.Collections;

public class Arrays17 {

	public static void main(String[] args) {
//		int[] arr = { 3, 2, 0, 7, 25, 12, 11 };
//		System.out.println("Before sorting");
//		for (int y : arr) {
//			System.out.print(y + " ");
//		}
//		System.out.println();
//		int start = 0;
//		int end = arr.length - 1;
//		for (int i = 0; i < arr.length; i++) {
//			if (start < end) {
//				int temp = arr[start];
//				arr[start] = arr[end];
//				arr[end] = temp;
//				start++;
//				end--;
//			}
//		}
//		System.out.println("After sorting");
//		for (int x : arr) {
//			System.out.print(x + " ");
//		}
//		(OR)
//		int[] arr = { 3, 2, 0, 7, 25, 12, 11 };
//		for (int i = arr.length - 1; i >= 0; i--) {
//			System.out.print(arr[i] + " ");
//		}
//		(OR)
		Integer[] arr = { 3, 2, 0, 7, 25, 12, 11 };
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
	}

}
