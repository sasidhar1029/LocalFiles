package com.TopQuestions;

public class PrimeNumber {

	public static void main(String[] args) {
		int n = 12345;
		String s = Integer.toString(n);
		String s1 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			s1 += c;
		}
		System.out.println(s1);
	}

}
