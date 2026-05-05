package com.dailyAssignments;

public class D1 {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2 }, { 3, 4 } };
		int rows = matrix.length;
		int cols = matrix[1].length;

		int[][] t = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				t[j][i] = matrix[i][j];
			}
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(t[i][j] + " ");
			}
			System.out.println();
		}
	}
}
