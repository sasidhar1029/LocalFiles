package com.TopQuestions;

import java.util.HashMap;
import java.util.Map;

public class Count_Freq {

	public static void main(String[] args) {
		String s = "java is easy java";
		s = s.replace(" ", "").toLowerCase();
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		for (Map.Entry<Character, Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + " - " + e.getValue());
		}
//		System.out.println(map);
	}

}
