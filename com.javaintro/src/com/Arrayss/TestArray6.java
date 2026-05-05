package com.Arrayss;

import java.util.Scanner;

public class TestArray6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int a = sc.nextInt();
		int[] arr = new int[a];
		for (int i = 0; i < a; i++) {
			arr[i] = a;
		}
		for (int i = 0; i < a; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}

	}

}
