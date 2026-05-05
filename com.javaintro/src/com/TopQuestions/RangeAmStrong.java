package com.TopQuestions;

public class RangeAmStrong {

	public static void main(String[] args) {
		for (int i = 0; i <= 300; i++) {
			int a = i;
			int temp = a;
			int count = String.valueOf(a).length();
			int sum = 0;
			while (a != 0) {
				int d = a % 10;
				sum += Math.powExact(d, count);
				a = a / 10;
			}
			if (temp == sum) {
				System.out.println("Amstrong numbers are:" + temp);
			}
		}
	}

}
