package com.dailyAssignments;

import java.util.Arrays;
import java.util.Scanner;

public class Sep24 {
	void method(String s, String s1) {
		if (s.length() == s1.length()) {
			char c[] = s.toCharArray();// To converting String into character
			char[] c1 = s1.toCharArray();// To converting String into character
			Arrays.sort(c);// it will sort the characters.
			Arrays.sort(c1);// it will sort the characters.
			Arrays.equals(c, c1);// it's check the two characters are equal or not
			System.out.println("The given string is anagram");
		} else {
			System.out.println("Given strings length is not match");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string 1");
		String s = sc.nextLine();
		System.out.println("Enter String 2");
		String s1 = sc.nextLine();
		Sep24 sp = new Sep24();
		sp.method(s, s1);

	}
}
