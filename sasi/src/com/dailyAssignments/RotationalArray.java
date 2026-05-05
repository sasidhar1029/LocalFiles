package com.dailyAssignments;

import java.util.Scanner;

//(10-09-2025)
public class RotationalArray {

	static void rotationArray(int[] arr, int n) {
		int s = 0;
		int e = arr.length;
		int r = 0;
		reverseArray(arr, s, r);

		reverseArray(arr, r, e);
	}

	static void reverseArray(int[] arr, int start, int end) {
		int temp = 0;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("Enter size of array to rotate");
		int n = sc.nextInt();
		System.out.println("Aftre rotation");
		for (int a : arr) {
			System.out.print(a + " ");
		}
		rotationArray(arr, 3);
	}

}
