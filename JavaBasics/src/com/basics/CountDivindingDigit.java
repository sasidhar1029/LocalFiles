package com.basics;
//Day-1
import java.util.Scanner;

public class CountDivindingDigit {
	public static int countDigits(int n) {
		int temp = n;
		int count = 0;
		while (n > 0) {
			int digit = temp % 10;
			if (digit != 0 && n % digit == 0) {
				count++;
			}
			n /= 10;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		System.out.println(countDigits(a));
	}

}
