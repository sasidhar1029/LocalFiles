package com.loops;

import java.util.Scanner;

//Check if a number is spy number or not.means sum its digits equals the product of the digits 
//ex:123 =1+2+3=1*2*3
public class SpyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int m = n;
		int sum = 0;
		int prod = 1;
		while (n != 0) {
			int d = n % 10;
			sum += d;
			prod *= d;
			n = n / 10;
		}
		if (sum == prod) {
			System.out.println("The given number is spy number:" + m);
		} else {
			System.out.println("The given number is not  a spy number:" + m);
		}

	}

}
