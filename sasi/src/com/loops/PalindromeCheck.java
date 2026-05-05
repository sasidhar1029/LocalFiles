package com.loops;

//write a java program to display only palindrome in agiven array
public class PalindromeCheck {

	public static void main(String[] args) {
		int[] arr = { 121, 222, 123 };
		for (int i = 0; i < arr.length; i++) {
			int n = arr[i];
			int m =n;
			int sum = 0;
			while (n != 0) {
				int d = n % 10;
				sum = sum * 10 + d;
				n = n / 10;
			}
			if(sum==m) {
				System.out.println(m+" ");
			}
		}
		

	}
}
