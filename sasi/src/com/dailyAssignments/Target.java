package com.dailyAssignments;
//(16-09-2025)
import java.util.Scanner;

public class Target {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter target number:");
		int c = sc.nextInt();
		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == c) {
					System.out.print(arr[i] + " " + arr[j]);
				}
			}
			System.out.println();
		}
	}

}
