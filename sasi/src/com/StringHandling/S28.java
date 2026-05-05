package com.StringHandling;

//input:sasi
//output :sai
public class S28 {

	public static void main(String[] args) {
		String s = "sasi";
		int feq[] = new int[26];

		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			feq[ch[i] - 'a']++;

		}
		for (int i = 0; i < 26; i++) {
			if (feq[i] > 0) {
				System.out.println((char) (i + 'a') + " " + feq[i]);
			}
		}
	}
}
