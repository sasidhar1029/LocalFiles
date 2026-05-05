package com.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

//Today's Assignment
//Java:
//1. Frequency Counter 
//
//Given a list of words, use a Set and a Map together to print each unique word and its frequency.
//
// Approach :-
//
//Use a Map<String, Integer> (e.g., HashMap) to store word → frequency pairs.
//
//Use a Set<String> (e.g., HashSet) to store unique words.
//
//Iterate through the word list:
//
//If the word already exists in the map, increment its count.
//
//Otherwise, add it to the map with a count of 1 and to the set of unique words.
//
//Print all unique words and their frequencies.
//
//Input :-[ apple, banana, apple, orange ]
//
//Output:-
//
//Unique Words: [orange, banana, apple, grape]
//
//Word Frequencies:
//orange → 
//banana → 2
//apple → 3
//grape → 1
public class Map2 {

	public static void main(String[] args) {

		Map<Character, Integer> l1 = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.next();
		char[] ch = s.toCharArray();
		for (char c : ch) {
			if (l1.containsKey(c)) {
				l1.put(c, l1.get(c) + 1);
			} else {
				l1.put(c, 1);
			}
		}
//		System.out.println(l1);

		Set<Entry<Character, Integer>> entries = l1.entrySet();
		for (Entry<Character, Integer> c : entries) {
			System.out.println(c);
		}

	}

}
