package com.StringHandling;

import java.util.Arrays;

public class S26 {

	public static void main(String[] args) {
		String s = "sasidhar reddy";
		char[] c2 = s.toCharArray();
		Arrays.sort(c2);
		for (char c : c2) {
			System.out.print(c + "");
		}

	}
}
