package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Collection1 {

	public static void main(String[] args) {
		Collection<Integer> c1 = new ArrayList<>();
		c1.add(10);
		c1.add(20);
		c1.add(30);
		c1.addAll(c1);
		System.out.println(c1);
		System.out.println(c1.hashCode());
		System.out.println(c1.isEmpty());
		Collection<Integer> c2 = new ArrayList<>();
		c2.add(10);
		c2.add(20);
		c2.add(40);
		c2.add(30);
//		System.out.println(c1.containsAll(c1));
		System.out.println(c1.equals(c2));
//		System.out.println(c1.removeAll(c1));
//		System.out.println(c1);
		System.out.println(c1.size());
		System.out.println(c2.size());
	}

}
