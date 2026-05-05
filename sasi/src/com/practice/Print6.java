package com.practice;

import java.util.Scanner;

//Print the reverse of a number (e.g., 123 → 321)
public class Print6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		int r = 0;
		int rev = 0;
		while (a > 0) {
			r = a % 10;
			rev = rev * 10 + r;
			a = a / 10;
		}
		System.out.println(rev);
	}

}
