package com.TopQuestions;

public class RangePalindrome {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			int a = i;
			int temp = a;
			int sum = 0;
			while (a != 0) {
				int d = a % 10;
				sum = sum * 10 + d;
				a = a / 10;
			}
			if (temp == sum) {
				System.out.println(temp);
			}
		}
	}

}
