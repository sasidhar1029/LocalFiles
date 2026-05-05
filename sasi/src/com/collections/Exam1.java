package com.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exam1 {

	public static void main(String[] args) {
//		Collection<Object> c = new HashSet<>();
//		c.add('a');
//		c.add(78);
//		c.add(78);
//		c.add("Vcube");
//		System.out.println(c);
//		
//		Set<Integer> m1 = new HashSet<>();
//		m1.add(90);
//		Set<Integer> m2 = new HashSet<>();
//		m2.add(90);
//		System.out.println(m1+m2);//error

//		

		String[] array = { "apple", "banana", "orange", "apple", "banana" };
		Set<String> set = new HashSet<>(Arrays.asList(array));
		System.out.println(set);
	}

}
