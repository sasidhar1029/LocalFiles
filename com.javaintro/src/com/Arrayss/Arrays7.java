package com.Arrayss;

public class Arrays7 {
//Wap to mix to two arrays in single array
	public static void main(String[] args) {
		int a[] = { 10, 20, 30 };
		int alen = a.length;
		int b[] = { 40, 50, 60 };
		int blen = b.length;
		int c[] = new int[alen + blen];
		for (int i = 0; i < alen; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < blen; i++) {
			c[alen + i] = b[i];
		}
		for (int ch : c) {
			System.out.print(ch + " ");
		}

	}

}
