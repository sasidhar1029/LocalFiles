package com.dailyAssignments;

//(Find the subarry with a given sum 
//Example:
//- Input: arr = [1, 4, 20, 3, 10, 5]
//- targetSum = 33
//- Output: Subarray with sum 33: [20, 3, 10] )
import java.util.Scanner;

public class Target_subArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter target number:");
		int c = sc.nextInt();

		int[] arr = { 1, 2, 3, 7, 6, 5 };
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;

			for (int j = i; j < arr.length; j++) {
				sum += arr[j];

				if (sum == c) {

					for (int k = i; k <= j; k++) {
						System.out.print(arr[k] + " ");
					}
					System.out.println();
				}

				if (sum > c) {
					break;
				}

			}
			
		}

	}

}
