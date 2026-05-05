package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//finf the intersection elements
public class Intesection_elements {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		List<Integer> l2 = new ArrayList<>(Arrays.asList(3, 4, 5));
		l2.retainAll(l1);
		System.out.println(l2);
	}

}
