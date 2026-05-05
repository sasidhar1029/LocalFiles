package com.Arrayss;

public class Arrays19 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 40, 40, 30, 50 };
		for (int i = 0; i < arr.length; i++) {
			boolean duplicate = false;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					duplicate = true;
					break;
				}
			}
			if (!duplicate) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
