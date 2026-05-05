package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set1 {

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<>();
		s.add(4);
		s.add(10);
		s.add(36);
		s.add(52);
		s.add(68);
		s.add(84);
		s.add(100);
		s.add(116);
		s.add(132);
		s.add(20);
		s.add(30);
		s.add(40);
		System.out.println(s);
		Set<Integer> s1 = new LinkedHashSet<>();
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(40);
		System.out.println(s1);

	}

}
