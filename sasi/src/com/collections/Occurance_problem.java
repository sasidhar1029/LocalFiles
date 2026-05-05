package com.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Occurance_problem {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "apple", "banana", "orange", "graphes", "apple");
		Map<String, Integer> wordCount = new HashMap<>();
		for (String word : words) {
			if (wordCount.containsKey(word)) {
				wordCount.put(word, wordCount.get(word) + 1);
			} else {
				wordCount.put(word, 1);
			}
		}

		Set<Entry<String, Integer>> Entries = wordCount.entrySet();
		for (Entry<String, Integer> E : Entries) {
			System.out.println(E.getKey() + "->" + E.getValue());
		}
	}

}
