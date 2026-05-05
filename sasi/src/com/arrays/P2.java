package com.arrays;

public class P2 {

	public static void main(String[] args) {
		int[] marks = { 10, 20, 30, 40, 50, 60 };
		int size = marks.length;
		int sum = 0;
		int avg = 0;
		for (int m : marks) {
			sum = sum + m;
		}
		System.out.println(sum);
		avg = sum / size;
		System.out.println(avg);
	}

}
