package com.Strings;

import java.util.Scanner;

public class Str2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String name = sc.nextLine().toLowerCase();
		int vowels = 0;
		int consonets = 0;
		for (int i = name.length() - 1; i >= 0; i--) {
			char ch = name.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels++;
				} else {
					consonets++;
				}
			}
		}
		System.out.println("Vowels count:" + vowels);
		System.out.println("Consonents count:" + consonets);
	}

}
