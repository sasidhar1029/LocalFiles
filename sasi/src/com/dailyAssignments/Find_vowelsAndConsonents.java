package com.dailyAssignments;

import java.util.Scanner;

public class Find_vowelsAndConsonents {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine().toLowerCase();
		char[] s = str.toCharArray();
		int vCount = 0;
		int cCount = 0;
		for (char c : s) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vCount++;
			} else {
				cCount++;
			}
		}
		System.out.println(vCount);
		System.out.println(cCount);
	}

}
