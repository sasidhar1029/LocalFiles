package com.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<>();
		v.add(10);
		v.addFirst(30);
		v.addLast(3);
		v.addLast(20);
		v.addElement(40);
		v.addElement(60);

		Enumeration<Integer> en = v.elements();
		while (en.hasMoreElements()) {
			System.out.print(en.nextElement() + " ");
		}
		System.out.println();
		v.add(0, null);
		System.out.println();
		Iterator<Integer> e = v.iterator();
		while (e.hasNext()) {
			System.out.print(e.next() + " ");
		}
	}

}
