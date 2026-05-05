package com.dailyAssignments;
//(22-09-2025)
public class N1 {

	public static void main(String[] args) {
		int n = 5;
		char ch = 'A';
		String s = "DHONI";
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j || i + j == 4) {
					char f = s.charAt(i);
					System.out.print(f + " ");
				} else {
					System.out.print(ch + " ");
					ch++;
				}
			}
			System.out.println();
		}

	}

}
