package com.TopQuestions;
//25-11-2025
import java.util.Scanner;

public class Find_L_Digit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		long a = sc.nextLong();
		int max = 0;
		while (a != 0) {
			int d = (int) (a % 10);
			if (d > max) {
				max =d;
			}
			a = a / 10;
		}
		System.out.println("max number is:" + max);
	}

}
