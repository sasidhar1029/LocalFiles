package com.Strings;

import java.util.Scanner;

//convert the given String into toggle case(with pre-defined) methods.
public class Str5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.nextLine();
		String result = "";
//		for (int i = 0; i < s.length(); i++) {
//			char ch = s.charAt(i);
//			if (Character.isLowerCase(ch)) {
//				result += Character.toUpperCase(ch);
//			} else if (Character.isUpperCase(ch)) {
//				result += Character.toLowerCase(ch);
//			} else {
//				result += ch;
//			}
//
//		}
//		(OR)
		//with out predefined methods
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				result += (char) (ch - 32);
			} else if (ch >= 'A' && ch <= 'Z') {
				result += (char) (ch + 32);
			} else {
				result += ch;
			}
		}
		System.out.println(result);
	}

}
