package com.Strings;

import java.util.HashMap;

public class Str6 {
//freqnecy of characters in string using HashMap
	public static void main(String[] args) {
		String s = "sasidhar reddy";
		 s=s.replaceAll(" ", "");
		HashMap<Character, Integer> m = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (m.containsKey(ch)) {
				m.put(ch, m.get(ch) + 1);
			} else {
				m.put(ch, 1);
			}
		}
		System.out.println(m);
	}

}
