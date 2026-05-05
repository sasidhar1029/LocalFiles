package com.loops;

import java.util.Scanner;

//find the given number is abundant Number or not .Here sum of factor is greater than  the number
//itselft ex: 12 factors 1,2,3,4,6 =16>12
public class AbundantNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (sum >n) {
			System.out.println("The given number is a Abundant Number:" + n);
		} else {
			System.out.println("The given number not  is a Abundant Number: " + n);
		}

	}


}
