package com.arrays;
//read the elements from console.
import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int size = sc.nextInt();
		int[] arr = new int[size];


		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
