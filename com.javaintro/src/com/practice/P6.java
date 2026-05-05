package com.practice;

import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println("Given number is even number:" + n);
		} else {
			System.out.println("Given numbers is odd number:" + n);
		}

	}

}
