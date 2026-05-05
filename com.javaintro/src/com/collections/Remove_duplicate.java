package com.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_duplicate {
	// remove duplicate(set)
	public static void main(String[] args) {
		int[] arr = { 10, 20, 20, 30, 40, 40 };
		Set<Integer> set = new LinkedHashSet<>();
		for (int a : arr) {
			set.add(a);
		}
		System.out.println(set);
	}

}
