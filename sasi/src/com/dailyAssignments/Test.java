package com.dailyAssignments;

import java.util.Scanner;

//(9-18-2025)
public class Test {

	public static void main(String[] args) {
		int n = 0;
		int m = 0;
		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <= 4; k++) {
				n++;
				System.out.print(n);
			}
			System.out.println();
		}
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				m++;
				System.out.print(m);
			}
			System.out.println();
		}

	}

}
