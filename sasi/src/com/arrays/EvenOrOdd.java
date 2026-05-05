package com.arrays;

public class EvenOrOdd {

	public static void main(String[] args) {
		int[] a = { 12, 2, 3, 18, 11, 15 };
		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {
				a[i] = a[i] * 2;
			} else {
				a[i] = a[i] * 3;
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
