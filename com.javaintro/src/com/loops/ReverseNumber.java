package com.loops;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		try {
			int sum = 0;
			while (a != 0) {
				int d = a % 10;
				sum = sum * 10 + d;
				a = a / 10;
			}
			System.out.println(sum);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
