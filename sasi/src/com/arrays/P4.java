package com.arrays;

public class P4 {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
//		for (int i = arr.length - 1; i >= 0; i--) {
//			System.out.print(arr[i] + " ");
//		
//             (or)
		int temp = 0;
		int size = arr.length;
		for (int i = 0; i < size / 2; i++) {
			temp = arr[size - i - 1];
			arr[size - i - 1] = arr[i];
			arr[i] = temp;
		} 
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

}
