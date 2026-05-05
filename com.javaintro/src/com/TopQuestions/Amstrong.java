package com.TopQuestions;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		int temp = a;
		int count = String.valueOf(a).length();
		int sum = 0;
		while (a != 0) {
			int d = a % 10;
			sum += Math.powExact(d, count);
			a = a / 10;
		}
		if (temp == sum) {
			System.out.println("The given number is amstrong number:" + temp);
		} else {
			System.out.println("The given number is not a amstrong number:" + temp);
		}
	}

}
