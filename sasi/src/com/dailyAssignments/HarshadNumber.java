package com.dailyAssignments;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		int sum = 0;
		int r = 0;
		int temp = a;
		while (temp > 0) {
			r = temp % 10;
			sum += r;
			temp = temp / 10;
		}
		if (a % sum == 0) {
			System.out.println("the given numbers is harshad number");
		} else {
			System.out.println("The given number is not a harshad number");
		}

	}

}
