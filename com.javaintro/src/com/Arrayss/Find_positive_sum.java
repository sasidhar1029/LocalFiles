package com.Arrayss;

public class Find_positive_sum {

	public static void main(String[] args) {
		int[] arr = { -3, -2, 0, -7, 25, 12, -11 };
		int sum = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				sum = sum + arr[i];
				count++;
			}
		}
		System.out.println(sum);
		System.out.println(count);

	}

}
