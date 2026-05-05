package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class C7 {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		l1.add("1");
		l1.add("2");
		l1.add("3");
		l1.add("4");
		List<String> l2 = new ArrayList<>();
		l2.add("a");
		l2.add("b");
		l2.add("c");
		l2.add("d");
		System.out.println(l1);
		Collections.copy(l1, l2);
		System.out.println(l1);
		System.out.println(l2);
	}

}
