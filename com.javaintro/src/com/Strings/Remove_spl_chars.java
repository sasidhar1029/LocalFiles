package com.Strings;

public class Remove_spl_chars {
//remove special characters
	public static void main(String[] args) {
		String str = "D!iw*a@l!i)";
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= 0 && ch < 9) || (ch == ' ')) {
				result += ch;
			}
		}
		System.out.println(result);

	}

}
