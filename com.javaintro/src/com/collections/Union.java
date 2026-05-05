package com.collections;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Union {

	public static void main(String[] args) {
		//set is used for removing duplicates
		Set<Integer> l1 = new LinkedHashSet<>();
		
		l1.addAll(Arrays.asList(1, 2, 3, 4));
		l1.addAll(Arrays.asList(3, 4, 5));
		System.out.println(l1);
	}

}
