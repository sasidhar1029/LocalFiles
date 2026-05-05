package com.strings;

import java.util.HashMap;

public class Non_repeting {

	public static void main(String[] args) {
		String s = "aabbcddee";
		HashMap<Character, Integer> map = new HashMap<>();

		for (char ch : s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		for (char ch : s.toCharArray()) {
			if (map.get(ch) == 1) {
				System.out.println(ch);
				break;
			}
		}
	}

}
