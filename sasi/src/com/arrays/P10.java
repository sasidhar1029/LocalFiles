package com.arrays;
//2d array
public class P10 {

	public static void main(String[] args) {
		int[][] arr = new int[3][4];
		arr[0][0] = 101;
		arr[0][1] = 102;
		arr[0][2] = 103;
		arr[1][0] = 104;
		arr[1][1] = 105;
		arr[1][2] = 106;
//		System.out.println(arr.length);// 3 -->0 1 2
//		System.out.println(arr[0].length);// 4 --> 0 1 2 3
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

//		(or)
		for (int[] a1 : arr) {
			for (int a : a1) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}

}
