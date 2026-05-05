package com.projects;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Example :2+3-1 =4
		// Read the numbers of values from user
		System.out.print("Enter number of values: ");
		int n = sc.nextInt();
		// if n is less than numbers it won't execute the operations
		if (n <= 1) {
			System.err.println("you need atleast two numbers");
			sc.close();
			return;
		}
		System.out.print("Enter number 1: ");
		// Read first number
		double result = sc.nextDouble();
		// Loop through remaining numbers and apply operations
		for (int i = 2; i <= n; i++) {
			char op;
			while (true) {
				System.out.print("Enter operator (+, -, *, /, %): ");
				op = sc.next().charAt(0);
				if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
					break;
				} else {
					System.err.println("Invalid operator try again");
				}
			}
			System.out.print("Enter number " + i + ": ");
			double num = sc.nextDouble();

			switch (op) {
			case '+' -> {
				result += num;

			}
			case '-' -> {
				result -= num;

			}
			case '*' -> {
				result *= num;

			}
			case '/' -> {
				if (num != 0)
					result /= num;
				else
					System.out.println("Cannot divide by zero!");

			}
			case '%' -> {
				if (num != 0)
					result %= num;
				else
					System.out.println("Cannot take modulo by zero!");

			}
			default -> System.err.println("Invalid operator: " + op);
			}
		}

		System.out.println("Final Result = " + result);
		sc.close();
	}
}
