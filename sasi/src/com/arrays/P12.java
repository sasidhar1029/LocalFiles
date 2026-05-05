package com.arrays;

import java.util.Scanner;

public class P12 {

	public static void main(String[] args) {

		int[][] n = { { 1, 2, 3, 4 }, { 4, 5, 6 }, { 7, 8, 9 }, { 0 }, { 1, 9 } };

		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				System.out.print(n[i][j]+" ");
			}
			System.out.println();
		}
//		for (int[] n1 : n) {
//			for (int n3 : n1) {
//				System.out.print(n3 + " ");
//			}
//			System.out.println();
//		}

	}
}