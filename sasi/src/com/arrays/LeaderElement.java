package com.arrays;

public class LeaderElement {

	public static void main(String[] args) {
		int[] a = { 12, 2, 3, 18, 11, 15 };
		for (int i = 0; i < a.length; i++) {
			boolean status = true;
			for (int j = 0; j < i; j++) {
				if (a[i] < a[j]) {
					status = false;

				}
			}
			if (status) {
				System.out.print(a[i] + " ");
			}

		}

	}

}
