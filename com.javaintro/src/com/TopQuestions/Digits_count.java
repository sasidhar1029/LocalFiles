package com.TopQuestions;
//25-11-2025
import java.util.Scanner;

public class Digits_count {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		int count = 0;
		while (a != 0) {
			int d = a % 10;
			count++;
			a = a / 10;
		}
		System.out.println(count);
	}

}
