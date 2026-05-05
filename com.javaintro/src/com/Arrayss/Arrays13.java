package com.Arrayss;

public class Arrays13 {
//find smallest element
	public static void main(String[] args) {
		int[] arr = { 3, 2, 1, 7, 25, 12, 11 };
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("smallest element:" + min);

	}

}
