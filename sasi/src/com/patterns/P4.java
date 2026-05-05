package com.patterns;

import java.util.Scanner;

public class P4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a rows:");
		int r = sc.nextInt();
		System.out.println("Enter b columns");
		int c = sc.nextInt();
		for(int a=1;a<=c;a++) {
			System.out.print(" __");
		}
		System.out.println();
		for (int i = 1; i <= r; i++) {
		
			for (int j = 1; j <= c; j++) {
				
				System.out.print("|__");
			}
			System.out.println("|");

		}
	}
}
