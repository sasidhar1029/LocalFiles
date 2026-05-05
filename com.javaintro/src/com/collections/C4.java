package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class C4 {

	public static void main(String[] args) {
		Collection<Double> c = new ArrayList<>();
		c.add(1000.00);
		c.add(200.89);
		c.add(9932.00);
		c.add(533.93);
		c.add(37642.83);
		c.add(3322.93);
		System.out.println(c.size());// 6
//		System.out.println(c);
//
//		for (double a : c) {
//			System.out.print(a + " ");
//		}

		Iterator<Double> itr = c.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}

}
