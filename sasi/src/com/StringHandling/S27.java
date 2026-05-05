package com.StringHandling;

public class S27 {

	public static void main(String[] args) {
		String str = "hello world";
		String s1 = "";
		String s2 = "";

		// for removing spaces
		String sr = str.replace(" ", "");

		for (int i = 0; i < sr.length(); ) {

			for (int j = 0; j < 2 && i < sr.length(); j++, i++) {
				s1 += sr.charAt(i);
			}
			for (int k = 0; k < 2 && i < sr.length(); k++, i++) {
				s2 += sr.charAt(i);
			}

		}

		System.out.println("s1:" + s1);
		System.out.println("s2:" + s2);

	}

}
