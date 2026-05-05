package com.Strings;

import java.util.Scanner;
//find the length of string without length() method
public class Str3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.nextLine();
		int count = 0;

		char[] ch = s.toCharArray();
		for (char c : ch) {
			count++;
		}
		System.out.println(count);
	}

}
