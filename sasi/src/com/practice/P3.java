package com.practice;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class P3 {

	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<>();

		s1.add(21);
		s1.add(1);
		s1.add(5);
		s1.add(2);
		s1.add(4);
		s1.add(2);
		s1.add(3);

		Set<Integer> SortedSet = new TreeSet<>(Comparator.reverseOrder());
		SortedSet.addAll(s1);
		System.out.println(SortedSet);

	}

}
