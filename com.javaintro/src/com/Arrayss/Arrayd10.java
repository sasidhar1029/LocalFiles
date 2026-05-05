package com.Arrayss;

public class Arrayd10 {
//WAP program to read the elements for 2D array
	public static void main(String[] args) {
		int[][] n = { { 10, 20, 30 }, { 40, 50 }, { 50, 60, 70, 80, 90 }, { 1, 2, 3 }, { 4 } };

//		for (int i = 0; i < n.length; i++) {
//			for (int j = 0; j < n[i].length; j++) {
//				System.out.print(n[i][j] + " ");
//			}
//			System.out.println();
//		}
		for (int[] n1 : n) {
			for (int n2 : n1) {
				System.out.print(n2 + " ");
			}
			System.out.println();
		}
	}

}
