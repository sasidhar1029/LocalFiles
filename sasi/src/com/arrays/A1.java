package com.arrays;

//12,13,120,56 output will be 21,31,021,65
public class A1 {

	public static void main(String[] args) {
		int[] arr = { 12, 103, 120, 560 };

		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");

		}
		System.out.println(" ");
		for (int i = 0; i < arr.length; i++) {

			int n = arr[i];
			int temp = 0;
			String name = "";

			while (n != 0) {
				int d = n % 10;
				name += d;
				n = n / 10;
			}
			System.out.print(name + " ");

		}
	}

}
