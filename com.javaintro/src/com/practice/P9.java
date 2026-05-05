package com.practice;

import java.util.Scanner;

public class P9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		int sum = 0;
		int temp = a;
		for (int i = 0; i < a; i++) {
			int d = temp % 10;
			sum += d;
			temp = temp / 10;
		}
		System.out.println(sum);

	}

}
