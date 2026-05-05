package com.projects;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many numbers do you want to calculate? ");
		System.out.println();
		int n = sc.nextInt();
		double[] nums = new double[n];
		System.out.println("Enter " + n + " numbers:");
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextDouble();
		}

		boolean valid = false;
		while (!valid) {
			System.out.println("choose one operator:*,+,-,/,%");
			char op = sc.next().charAt(0);
			double result = 0;
			switch (op) {
			case '+' -> {
				for (int i = 0; i < n; i++)
					result += nums[i];
				System.out.println("Result:" + result);
				valid = true;
			}
			case '*' -> {
				for (int i = 0; i < n; i++)
					result *= nums[i];

				System.out.println("Result:" + result);
				valid = true;
			}
			case '-' -> {
				for (int i = 0; i < n; i++)
					result -= nums[i];
				System.out.println("Result:" + result);
				valid = true;
			}
			case '/' -> {
				for (int i = 0; i < n; i++)
					result /= nums[i];

				System.out.println("Result:" + result);
				valid = true;
			}
			case '%' -> {
				for (int i = 0; i < n; i++)
					result %= nums[i];
				System.out.println("Result:" + result);
				valid = true;
			}
			default -> System.err.println("Invalid operator please try again");
			}
		}
		sc.close();
	}
}
