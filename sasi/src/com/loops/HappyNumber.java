package com.loops;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 0; i <= n; i++) {

			while (n > 0) {
				int d = n % 10;
				int square = d * d;
				sum = sum + square;
				n = n / 10;
			}
		}
		System.out.println(sum);
	}

}
