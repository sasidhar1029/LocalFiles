package com.loops;

public class TestDemo1 {

	public static void main(String[] args) {
		int[] a = { 122, 123, 256, 342 };
		int count = 0;

		for (int i = 0; i <= a.length-1; i++) {
			int n = a[i];
			while (n != 0) {
				int d = n % 10;

				if (d == 2) {
					count++;
				}

				n = n / 10;
			}
		}
		System.out.println(count);
	}

}
