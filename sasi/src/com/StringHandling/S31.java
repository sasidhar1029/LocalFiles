package com.StringHandling;

public class S31 {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || i == 5 || i == 1 || i == 2 || i == 3) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
