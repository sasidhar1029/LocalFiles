package com.strings;

public class Each_word_revserse_in_a_sentence {

	public static void main(String[] args) {
		String s = "hello madam";
		String[] words = s.split(" ");
		String result = "";
		for (String w : words) {
			String rev = "";
			for (int i = w.length() - 1; i >= 0; i--) {
				rev += w.charAt(i);
			}
			result += rev+" ";
		}
		System.out.println(result.trim());

	}

}
