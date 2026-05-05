package com.strings;

public class Replace_Charcter {

	public static void main(String[] args) {
		String s = "banana";
		char old = 'a';
		char ne = 'o';
		String result = "";
		for (char ch : s.toCharArray()) {
			if ((ch == old))
				result += ne;
			else
				result += ch;
		}
		System.out.println(result);
	}

}
