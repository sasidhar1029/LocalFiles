package com.Arrayss;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 50, 40, 20, 30, 6, 10 };
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

}
