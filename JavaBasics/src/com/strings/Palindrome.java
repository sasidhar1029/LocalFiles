package com.strings;

public class Palindrome {

	public static void main(String[] args) {
		String s = "madam";
		String res = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			res += s.charAt(i);
		}
		if (s.equals(res)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}

}
