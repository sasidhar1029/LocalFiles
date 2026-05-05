package com.Arrayss;

//find the avg and sum of marks
public class TestArray2 {

	public static void main(String[] args) {
		int[] marks = { 89, 26, 23, 84, 95, 85 };
		int sum = 0;
		int avg = 0;
		int size = marks.length;
		for (int a : marks) {
			sum = sum + a;
		}
		avg = sum / size;

		System.out.println("sum of marks:" + sum);
		System.out.println("Avg of marks:" + avg);

	}

}
