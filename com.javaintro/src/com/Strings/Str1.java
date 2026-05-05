package com.Strings;

public class Str1 {
//palindrome or not
	public static void main(String[] args) {
		String str = "mam";
		String rstr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rstr = rstr + str.charAt(i);
		}
		System.out.println("original String:" + str);
		System.out.println("updated String:" + rstr);
		if (str.equals(rstr)) {
			System.out.println("The given String is palindrome:" + str);
		} else {
			System.out.println("The given is not a palindrome");
		}

	}

}
