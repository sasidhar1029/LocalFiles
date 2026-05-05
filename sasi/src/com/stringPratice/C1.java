package com.stringPratice;

public class C1 {

	public static void main(String[] args) {
		String s = "sasi";
		String s2 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char reverse = s.charAt(i);
			s2 = s2 + reverse;
		}
		System.out.println(s2);
//		if(s.equals(s2)) {
//			System.out.println("The given string is palindrome");
//		}
//		else {
//			System.out.println("The given String not a palindrome");
//		}
	}

}
