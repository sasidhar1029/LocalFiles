package com.Arrayss;

public class Arrays8 {

	public static void main(String[] args) {
		int[][] arr = new int[3][4];

		System.out.println(arr.length);// 3
		System.out.println(arr[0].length);// 4
		for (int i = 0; i < arr.length; i++) {
		    for (int j = 0; j < arr[i].length ; j++) {
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
		}

	}

}
