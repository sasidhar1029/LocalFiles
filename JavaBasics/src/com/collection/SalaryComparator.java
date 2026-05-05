package com.collection;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Comparable1> {

	@Override
	public int compare(Comparable1 o1, Comparable1 o2) {
		if (o1.rank < o2.rank) {
			return -1;
		} else if (o1.rank > o2.rank) {
			return 1;
		} else {
			return 0;
		}
	}
}
