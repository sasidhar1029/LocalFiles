package com.TopQuestions;

import java.util.Scanner;

public class Abundant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				sum = sum + i;
			}
		}
		if (sum > a) {
			System.out.println("The given number is a abundant:" + a);
		} else {
			System.out.println("The given number is not a abundant:" + a);
		}
	}

}
