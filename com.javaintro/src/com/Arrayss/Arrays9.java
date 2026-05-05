package com.Arrayss;

import java.util.Scanner;
//WAP read the elements from console an array and find the prime numbers from given array
public class Arrays9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of an array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < size; i++) {
			boolean status = true;

			if (arr[i] <= 1) {
				status = false;
			} else {
				for (int j = 2; j <= arr[i] / 2; j++) {
					if (arr[i] % j == 0) {
						status = false;
						break;
					}
				}
			}
			if(status) {
				System.out.print(arr[i]+" ");
			}
		}
		

	}

}
