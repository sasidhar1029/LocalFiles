package com.collections;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 4, 7, 5 };
		Set<Integer> set = new HashSet<>();
		for (int a : arr) {
			//if we put !(not) here it will be as give me which are duplicate elements if dont put
			//that ! symbol it will remove the duplicate elements and give remaining elements
			if (!set.add(a)) {
				System.out.print(a + " ");
			}
		}

	}

}
