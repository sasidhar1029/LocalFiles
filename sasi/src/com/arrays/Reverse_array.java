package com.arrays;

public class Reverse_array {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i * j % 2 == 0) {
					System.out.print(a[i] * a[j]);
				}
			}
			System.out.println();
		}
	}
}
