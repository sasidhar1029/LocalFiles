package com.arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 3, 12 };
		int temp = 0;
		System.out.println("Before Sorting:");
		for (int a : arr) {
			System.out.print(a + " ");
		}
		for (int i = 0; i < arr.length - 1; i++) {
			boolean flag = false;
			for (int j = 0; j < arr.length - 1 ; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}
			}
//			if (!flag) {
//				break;
//			}
		}
		System.out.println();
		System.out.println("After sorting:");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

}
