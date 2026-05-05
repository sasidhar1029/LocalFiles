package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class List1 {

	public static void main(String[] args) {
		List<Integer> l1= new ArrayList<>();
		l1.add(10);
		l1.add(0, 20);
		l1.addAll(l1);
		System.out.println(l1);
//		List<Integer> l2 =new ArrayList<>(l1);
		Set<Integer> l2 = new HashSet<>(l1);
		l2.add(30);
		l2.add(40);
		l2.add(40);
//		l2.add(20);
//		l2.addAll(0, l1);
//		l2.clear();
//		System.out.println(l2.get(2));
//		System.out.println(l2.indexOf(10));
//		System.out.println(l2.lastIndexOf(20));
		System.out.println(l2);
	}

	

}
