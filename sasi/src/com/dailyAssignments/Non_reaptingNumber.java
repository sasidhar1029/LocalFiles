package com.dailyAssignments;

import java.util.Scanner;

public class Non_reaptingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		String numStr = String.valueOf(n);
		int len = numStr.length();
		for (int i = len; i >= 0; i--) {
			char currentDigit = numStr.charAt(i);
			int count = 0;
			for (int j = 0; j < len; j++) {
				if (numStr.charAt(j) == currentDigit) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println("First non-repeating number is:" + currentDigit);
				return;
			}

		}
		System.out.println("non-repeating digit is found");
	}
}
