package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class C2 {

	public static void main(String[] args) {
		Collection<Integer> s = new ArrayList<>();
		s.add(10);
//		s.add(20);
//		System.out.println(s.hashCode());
		Collection<Integer> s1 = new ArrayList<>();
		s1.add(110);
//		s1.add(20);
//	 
		System.out.println(s.equals(s1));

	}

}
