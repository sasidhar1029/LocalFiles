package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable2 {

	public static void main(String[] args) {
		Comparable1 c1 = new Comparable1(2, "sasi", 21, "Ece");
		Comparable1 c2 = new Comparable1(3, "arjun", 20, "cse");
		Comparable1 c3 = new Comparable1(4, "reddy", 19, "Mech");
		Comparable1 c4 = new Comparable1(1, "subbu", 23, "Civil");
		List<Comparable1> l1 = new ArrayList<>();
		l1.add(c1);
		l1.add(c2);
		l1.add(c3);
		l1.add(c4);
		Collections.sort(l1);
		for(Comparable1 d1:l1) {
			System.out.println(d1);
		}
	}

}
