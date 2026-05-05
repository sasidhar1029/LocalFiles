package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C10 {

	public static void main(String[] args) {
		List<Integer> all = new ArrayList<>();
		all.add(10);
		all.add(20);
		all.add(30);
		all.add(40);
		all.add(50);
//		System.out.println(all);
//		Iterator<Integer> itr = all.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		ListIterator<Integer> litr = all.listIterator();
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}
		while (litr.hasPrevious()) {
			System.out.println(litr.previous());// it is give nothing before cursor there is nothing
		}
	}

}
