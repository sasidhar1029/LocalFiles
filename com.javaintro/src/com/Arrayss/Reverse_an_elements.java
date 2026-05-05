package com.Arrayss;

public class Reverse_an_elements {

	public static void main(String[] args) {
		int[] arr = { 12034, 8830, 88280, 98380 };
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			int rev = 0;
			while (num > 0) {
				int d = num % 10;
				rev = rev * 10 + d;
				if(num==0)continue;
				num = num / 10;
			
			}
			arr[i] = rev;
		}
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

}
