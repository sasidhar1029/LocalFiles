package com.TopQuestions;

import java.util.Scanner;

public class Spy_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		int temp = a;
		int sum = 0;
		int prod = 1;
		while (a != 0) {
			int d = a % 10;
			sum = sum + d;
			prod = prod * d;
			a = a / 10;
		}
		if (sum == prod) {
			System.out.println("The given number is spy number:" + temp);
		} else {
			System.out.println("The given number is not a spy number:" + temp);
		}

	}

}
