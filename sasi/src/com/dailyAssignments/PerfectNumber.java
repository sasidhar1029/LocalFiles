package com.dailyAssignments;

public class PerfectNumber {
	public static void main(String[] args) {
		int perfectCount = 0;
		int perfectNum = 0;
		for (int num = 1; num <= 100; num++) {
			int sum = 0;
			for (int i = 1; i < num; i++) {
				if (num % 2 == 0) {
					sum += i;
				}
			}
			if (num == sum) {
				perfectCount++;
				if (perfectCount == 2) {
					perfectNum = num;
				
				}
			}
		}
		long factorial = 1;
		for (int i = 1; i <= perfectNum; i++) {
			factorial *= i;
		}
		System.out.println("second perfect number:" + perfectNum);
		System.out.println("factorial:" + factorial);
	}

}