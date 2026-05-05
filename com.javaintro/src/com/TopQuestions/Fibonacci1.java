package com.TopQuestions;
//25-11-2025
import java.util.Scanner;

public class Fibonacci1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int s = sc.nextInt();
		int n1 = 0;
		int n2 = 1;
		for (int i = 0; i < s; i++) {
			int n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;

		}
	}

}
