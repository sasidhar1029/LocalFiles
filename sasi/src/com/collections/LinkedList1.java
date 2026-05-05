package com.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {

	public static void main(String[] args) {
		List<Integer> l2 = new LinkedList<>();
		l2.add(10);
		l2.add(20);
		l2.add(30);
		System.out.println(l2);
		l2.addLast(50);
		l2.addFirst(0);
		System.out.println(l2);
		System.out.println(l2.getLast());
		System.out.println(l2.getFirst());
		
	}

}
