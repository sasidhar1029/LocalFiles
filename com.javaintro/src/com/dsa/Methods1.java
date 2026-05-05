package com.dsa;

//08-09-2025
public class Methods1 {

	static void fun(String s, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(s + " ");
		}
	}

	public static void main(String[] args) {
		fun("sasi", 4);
		System.out.println();
		fun("arjun", 43);
		System.out.println();
		fun("naga", 13);
	}

}
