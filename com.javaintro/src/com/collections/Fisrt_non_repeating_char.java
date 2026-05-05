package com.collections;

import java.util.LinkedHashMap;
//2.find first non-repeating character
public class Fisrt_non_repeating_char {

	public static void main(String[] args) {
		String s = "aabecbcbd";
		//LinkedHashMap will follow insertion order
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for (char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		for (var e : map.entrySet()) {
			if (e.getValue() == 1) {
				System.out.println(e.getKey());
				break;
			}
		}
	}

}
