package com.arrays;

//write a program two array in one array
public class P9 {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30 };
		int alen = a.length;// 3 --> 0 1 2
		int b[] = { 40, 50, 60 };
		int blen = b.length;// 3 -->0 1 2
		int[] c = new int[alen + blen];// 6 -->0 1 2 3 4 5
		for (int i = 0; i < alen; i++) {
			c[i] = a[i];// a[i] will store in c[i]//as 10 20 30 0 0 0
		}
		for (int j = 0; j < blen; j++) {
			c[alen + j] = b[j];// here b[j] will store in c[alen+j] coz if store
			// just b[j] in c[j] then update the array like this 40 50 60 0 0 0 so we store
			// in
			// c[alen+j] then the array will be 10 20 30 40 50 60

		}
		System.out.println("Before reverse the array");
		for (int c1 : c) {

			System.out.print(c1 + " ");
		}
		System.out.println();
		System.out.println("Reverse the array");
		for (int k = c.length - 1; k >= 0; k--) {

			System.out.print(c[k] + " ");
			// here i do reverse the array 60 50 40 30 20 10
		}

	}

}
