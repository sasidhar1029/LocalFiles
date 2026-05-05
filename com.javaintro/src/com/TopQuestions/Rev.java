package com.TopQuestions;

import java.util.Scanner;

public class Rev {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
	
		int sum =0;
		while (a != 0) {
			int d = a % 10;
			sum = sum * 10 + d;
			a = a / 10;
		}
		System.out.println(sum);
		sc.close();

	}

}
