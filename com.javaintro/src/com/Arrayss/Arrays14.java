package com.Arrayss;

public class Arrays14 {
//find the sum of all elements
	public static void main(String[] args) {
		int[] arr = { 3, 2, 0, 7, 25, 12, 11 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);

	}

}
