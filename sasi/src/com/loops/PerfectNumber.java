package com.loops;

import java.util.Scanner;

//find the given number is perfect or not .A perfect Number is equal to sum of its divisors
//of factors except itself 
//ex:6=> 1+2+3;
public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n/2; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == n) {
			System.out.println("The given number is a perfect Number:" + n);
		} else {
			System.out.println("The given number not  is a perfect Number: " + n);
		}

	}

}
