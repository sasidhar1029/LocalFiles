package com.patterns;

import java.util.Scanner;

//1 
//01 
//001 
//0001 
//00001 
public class P15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = sc.nextInt();

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				if (i == j) {
					System.out.print(1);
				} else {
					System.out.print(0);
				}
			}
			System.out.println();
		}

	}

}
