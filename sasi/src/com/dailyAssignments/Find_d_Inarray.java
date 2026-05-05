package com.dailyAssignments;

public class Find_d_Inarray {

	public static void main(String[] args) {
		int a[] = { 4, 2, 7, 2, 9, 4, 7, 3 };
//		int count = 0;

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = i; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			if (count ==2) {
				System.out.print(a[i] + " ");
			}
		}
		

	}
}
