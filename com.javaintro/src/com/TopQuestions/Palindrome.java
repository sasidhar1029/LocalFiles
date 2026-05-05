package com.TopQuestions;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		int temp = a;
		int sum = 0;
		while (a != 0) {
			int d = a % 10;
			sum = sum * 10 + d;
			a = a / 10;
		}
		if (temp == sum) {
			System.out.println("The given number is a palindrome:" + sum);
		} else {
			System.out.println("The given number is not a  palindrome");
		}
	}

}
