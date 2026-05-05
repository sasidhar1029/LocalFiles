package com.dsa;

//08-09-2025
public class Method3 {

	static int[] fun() {
		int arr[] = { 1, 2, 4, 9 };
		return arr;
	}

	public static void main(String[] args) {
		int[] sasi = fun();
		for (int i = 0; i < sasi.length; i++) {
			System.out.print(sasi[i]+" ");

		}
	}

}
