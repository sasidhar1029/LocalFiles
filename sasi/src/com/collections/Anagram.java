package com.collections;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        String[] words = { "eat", "tea", "tea", "tan", "ate", "nat", "bat", "ate" };

        // Set for unique words
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));

        // Map for anagram groups
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String word : words) {
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);

            // Add word to the correct anagram group
            if (!anagramMap.containsKey(key)) {
                anagramMap.put(key, new ArrayList<>());
            }
            anagramMap.get(key).add(word);
        }

        // Print results
        System.out.println("Unique words : " + uniqueWords);
        System.out.println("Anagrams : " + anagramMap);
    }
}
