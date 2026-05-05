package com.Arrayss;

public class Arrays22 {

	public static void main(String[] args) {

		int[] arr = { 2, 2, 1, 2, 3, 2, 2 };
		int n = arr.length;
		int count = 0;
		int candidate = -1;
		for (int num : arr) {
			if (count == 0) {
				candidate = num;
			}
			count += (num == candidate) ? 1 : -1;
		}
		count = 0;
		for (int num : arr) {
			if (num == candidate)
				count++;
		}
		if (count > n / 2) {
			System.out.println("number occring more than n2 times:" + candidate);
		} else {
			System.out.println("NO element found that occurs more than n/2 times");
		}
	}

}
