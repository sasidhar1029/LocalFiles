package com.arrays;

import java.util.HashMap;
import java.util.Map;

public class Frequecy_of_elements {

	public static void main(String[] args) {
		int[] a = { 10, 20, 10, 30, 20, 10 };
		Map<Integer, Integer> freq = new HashMap<>();
		for (int num : a) {
			freq.put(num, freq.getOrDefault(num, 0) + 1);
		}
		for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
			System.out.println(entry.getKey() + " ->" + entry.getValue());
		}
	}

}
