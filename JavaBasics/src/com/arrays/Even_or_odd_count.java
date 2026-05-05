package com.arrays;

public class Even_or_odd_count {

	public static void main(String[] args) {
		int[] arr = { 0, 293, 73, 2, 33 };
		int even = 0;
		int odd = 0;
		for (int a : arr) {
			if (a % 2 == 0)
				even++;
			else
				odd++;
		}
		System.out.println(even);
		System.out.println(odd);
	}

}
