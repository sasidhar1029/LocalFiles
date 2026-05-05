package com.TopQuestions;

public class Remove_duplicates {
//Remove duplicates from sorted array
	public static void main(String[] args) {
		int[] arr = { 21, 35, 35, 47, 47, 56, 68 };
		for (int i = 0; i < arr.length; i++) {
			boolean isDuplicate = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				System.out.print(arr[i]+" ");
			}
		}

	}

}
