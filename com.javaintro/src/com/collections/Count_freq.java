package com.collections;

import java.util.HashMap;
///1.count freqency of each element
public class Count_freq {

	public static void main(String[] args) {
		String[] str = { "apple", "banana", "mango", "apple" };
		HashMap<String, Integer> map = new HashMap<>();
		for (String s : str) {
			map.put(s, map.getOrDefault(s, 0) + 1);
		}
		System.out.println(map);
	}

}
