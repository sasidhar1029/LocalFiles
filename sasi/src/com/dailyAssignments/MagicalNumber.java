package com.dailyAssignments;

import java.util.Scanner;

public class MagicalNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int num = sc.nextInt();
		int result = isMagical(num);

	}

	static int isMagical(int n) {
		int sum =0;
		while (n > 9) {
			int sum1 = 0;
		}
		while (n > 0) {
			sum += n % 10;
			n = n / 10;
		}
		n = sum;
		return n;
	}

}
