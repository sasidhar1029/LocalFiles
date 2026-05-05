package com.Strings;

public class Max_Occurance_char {

	public static void main(String[] args) {
		String str = "banana";
		int max = 0;
		char maxChar = ' ';
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == ch) {
					count++;
				}
			}
			if (count > max) {
				max = count;
				maxChar = ch;
			}
		}
		System.out.println("max Occruring Character:" + maxChar);
		System.out.println("count:" + max);
	}

}
