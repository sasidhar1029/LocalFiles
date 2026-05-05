package com.TopQuestions;

import java.util.Scanner;

//25-11-2025
public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  a number");
		int a = sc.nextInt();
		int sum = 0;
		for (int i = 1; i < a; i++) {
			if (a % i == 0) {
				sum += i;
			}
		}
		if (sum == a) {
			System.out.println("The given number is perfect number:" + a);
		} else {
			System.out.println("The given number is not a perfect number:" + a);
		}
	}

}
