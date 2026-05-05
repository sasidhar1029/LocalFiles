package com.StringHandling;

import java.util.Scanner;

public class S5 {

	public static void main(String[] args) {
		System.out.println("main method stared");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.next();
		String rstr = revstr("123");
		System.out.println(rstr);
		if (str.equalsIgnoreCase(rstr)) {
			System.out.println("The given string is palindrome");
		} else {
			System.out.println("The given string is not a palindrome");
		}
	}

	static String revstr(String str) {
		String str1 = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			str1 = c + str1;
		}
		return str1;

	}

}
