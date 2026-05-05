package com.patterns;

public class P1 {

	public static void main(String[] args) {
		System.out.println("hello main method");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
