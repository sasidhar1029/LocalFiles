package com.tgh;

import java.util.Scanner;

public class MatrixTransformation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter length of array:");
		int l = sc.nextInt();
		System.out.println("Enter breadth of array");
		int b = sc.nextInt();
		int[][] arr = new int[l][b];

		System.out.println("Enter array elements:");
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < b; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				int n = arr[i].length - 1;
				for (int j = 0; j < arr.length / 2; j++) {
					int temp = arr[i][j];
					arr[i][j] = arr[i][n];
					arr[i][n] = temp;
					n--;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int k = 0; k < arr[i].length; k++) {
				if (i == k) {
					arr[i][k] = arr[i][k] * arr[i][k];
				} else if (k % 2 != 0 && i == k) {
					arr[i][k] = arr[i][k] * 2;
				}
			}
		}

		for (int i = 0; i < l; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
