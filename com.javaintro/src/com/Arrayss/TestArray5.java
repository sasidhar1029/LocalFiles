package com.Arrayss;

public class TestArray5 {

	public static void main(String[] args) {
		int[] arr = { 10, 22, 8, 25,1, 4, 7, 2 };
		int max = arr[0];
		int min = arr[0];
//		for (int a : arr) {
//			if (a > max) {
//				max = a;
//			} else if (a < min) {
//				min = a;
//			}
//		}
//		(or)
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("maximum element:" + max);
		System.out.println("Minumum element:" + min);

	}

}
