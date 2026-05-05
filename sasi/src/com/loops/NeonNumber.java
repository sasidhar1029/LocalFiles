package com.loops;

import java.util.Scanner;

//check if a number is neon number or not where sum of digits of square of the number is
//equal to the number is equal to the number.
//9,9*9=81,9 =8+1;
public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int m = n;
		int sum = 0;
		n = n * n;
		while (n != 0) {
			int d = n % 10;
			sum += d;
			n = n / 10;
		}
		if (sum == m) {
			System.out.println("The given number is neon number:" + m);
		} else {
			System.out.println("The given number is not a neon number: " + m);
		}
	}

}
