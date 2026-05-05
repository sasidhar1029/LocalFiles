package com.collections;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent";
		char[] ch = s1.toCharArray();
		char[] ch1 = s2.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		System.out.println(Arrays.equals(ch, ch1));
	}

}
