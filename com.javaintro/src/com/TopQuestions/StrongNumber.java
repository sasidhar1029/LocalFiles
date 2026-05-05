package com.TopQuestions;

import java.util.Scanner;

//25-11-2025
public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int a = sc.nextInt();
		int temp = a;
		int sum = 0;
		while (a > 0) {
			int d = a % 10;
			int fact = 1;
			for (int i = 1; i <= d; i++) {
				fact *= i;
			}
			sum += fact;
			a /= 10;
		}
		if (sum == temp) {
			System.out.println("the given number is Strong number:" + temp);
		} else {
			System.out.println("The given number is not a Strong number :" + temp);
		}
	}

}
