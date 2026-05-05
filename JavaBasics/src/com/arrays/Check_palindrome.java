package com.arrays;

public class Check_palindrome {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 2, 1 };
		boolean flag = true;

		int i = 0, j = a.length - 1;
		while (i < j) {
			if (a[i] != a[j]) {
				flag = false;
				break;
			}
			i++;
			j--;
		}
		System.out.println(flag);

	}

}
