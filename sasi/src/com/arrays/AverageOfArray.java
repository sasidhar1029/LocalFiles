package com.arrays;

public class AverageOfArray {

	public static void main(String[] args) {
		int[] numbers = { 20, 30, 25, 3274, 35, -16, 60, -100 };
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		double avg = sum / numbers.length;
		System.out.println("Average of array Elements:"+avg);
	}

}
