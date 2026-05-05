package com.Arrayss;

public class Arrays15 {
//count even numbers and odd numbers
	public static void main(String[] args) {
		int[] arr = { 3, 2, 0, 7, 25, 12, 11 };
		int even = 0;
		int odd = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("Even numbers:" + even);
		System.out.println("Odd numbers:" + odd);

	}

}
