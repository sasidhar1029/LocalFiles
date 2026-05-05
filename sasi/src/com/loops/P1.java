package com.loops;

import java.util.Scanner;

//print all digits of a number 268 on different lines
public class P1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int m = n;
		while (n != 0) {
			int d = n % 10;
			System.out.print(d+" ");
			n = n / 10;
		}

	}

}
