package com.practice;

import java.util.Scanner;

//Print squares of numbers from 1 to N
public class Print8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int squ = (int) Math.pow(n,i);
//			int squ =i*i;
			System.out.println("square:" + squ);
		}

	}

}
