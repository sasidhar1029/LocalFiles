package com.practice;

import java.util.LinkedList;


public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<>();
		l1.add("sasi");
		l1.add("nagaraju");
		l1.add("surya");
		l1.add("triven");
		l1.add("subbu");
		l1.add("vamsi");
		System.out.println(l1);
		l1.addFirst("naga");
		l1.addLast("arjun");
		l1.add(2, "erripuka");
		System.out.println(l1);
		String s = "arjun";
		if (l1.remove(s)) {
			System.out.println("After removing:" + s + " " + l1);
		} else {
			System.out.println(s + "is not found in the list");
		}
		System.out.println(l1);
	}

}
