package com.StringHandling;

public class S33 {

	public static void main(String[] args) {
		String str = "Java is simple in vcube";
		String s = "srikanth";
		char[] ch = s.toCharArray();
		for (char c : ch) {
			System.out.print(c+ " ");
		}
		System.out.println();
		System.out.println(s.substring(3));
		System.out.println(str.substring(2, 9));
		System.out.println(str.subSequence(1, 4));
	}

}
