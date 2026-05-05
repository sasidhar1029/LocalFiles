package com.StringHandling;

// removing special characters
public class S39 {

	public static void main(String[] args) {

		String s = "D!iw*a@l!i#";
		String clean = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if ((ch >= 'A' && ch <= 'Z') || ch >= 'a' && ch <= 'z' || ch >= 0 && ch <= 9 || ch == ' ') {
				clean += ch;
			}

		}
		System.out.println(clean);
	}

}
