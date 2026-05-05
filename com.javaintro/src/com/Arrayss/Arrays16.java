package com.Arrayss;

public class Arrays16 {

	public static void main(String[] args) {
		int[] arr = { 3, 2, 0, 7, 25, 12, 11 };
		int key = 12;
		boolean status = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				status = true;
				break;
			}
		}
		if (status) {
			System.out.println(key + ":element found in array");
		} else {
			System.out.println(key + ":element found in array");
		}

	}

}
