package com.collections;

import java.util.ArrayList;
import java.util.Collection;

//hashcodes,equals
public class C3 {

	public static void main(String[] args) {
		Collection <Integer> s =new ArrayList<>();
		s.add(10);
		Collection <Integer> s1=new ArrayList<>();
		s1.add(20);
		s1.add(10);
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s.equals(s1));
		
	}

}
