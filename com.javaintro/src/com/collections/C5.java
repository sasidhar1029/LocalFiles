package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class C5 {

	public static void main(String[] args) {
		Collection<String> t20 = new ArrayList<>();
		t20.add("Abhishek");
		t20.add("sky");
		t20.add("Gill");
		t20.add("Tilak");
		t20.add("Dube");
		t20.add("Bhumra");
		Collection<String> test = new ArrayList<>();
		test.add("jaddu");
		test.add("kl rahul");
		test.add("jaishwal");
		Collection<String> cricketers = new ArrayList<>();
		cricketers.addAll(t20);
		cricketers.addAll(test);
		cricketers.removeAll(test);
//		System.out.println(cricketers);
		t20.remove("Tilak");
//		System.out.println(cricketers);
		Iterator<String> itr = cricketers.iterator();
		while (itr.hasNext()) {
			if (itr.next().equals("Gill")) {
				itr.remove();
			}
		}
		System.out.println(cricketers);

	}

}
