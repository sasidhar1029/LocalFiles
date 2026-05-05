package com.Arrayss;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 40, 10, 20, 30, 5, 2 };
		int temp = 0;
		System.out.println("Befor sorting:");
		for (int a : arr) {
			System.out.print(a + " ");
		}
		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;
			for (int j = 0; j < arr.length -i- 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}
			}
			if (!flag) {
				break;
			}
		}
		System.out.println();
		System.out.println("After sorting");
		for (int a1 : arr) {
			System.out.print(a1 + " ");
		}
	}

}
