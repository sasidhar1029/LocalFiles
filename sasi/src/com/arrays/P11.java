package com.arrays;

import java.util.Scanner;

public class P11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		int[] numbers = new int[size];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();

		}
		System.out.println("Prime numbers are given array:");
		for (int i = 0; i < size; i++) {
			boolean status = true;
			if (numbers[i] == 0 || numbers[i] == 1) {
				status = false;
			}
			for (int j = 2; i < numbers[i]; j++) {
				if (numbers[i] % j == 0) {
					status = false;
					break;
				}
			}
			if (status) {
				System.out.println(numbers[i]);

			}
		}

	}

}
