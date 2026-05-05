package com.Arrayss;

public class Arrays20 {

	public static void main(String[] args) {
		int[] a1 = { 10, 20, 30, 40 };
		int[] b1 = { 30, 40, 50, 60 };
		for (int a : a1) {
			for (int b : b1) {
				if (a == b) {
					System.out.print(a + " ");
				}
			}
		}

	}

}
