package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class C1 {

	public static void main(String[] args) {
		Collection<Character> c = new ArrayList<>();
		c.add('c');
		c.add('l');
		c.add('a');
		c.add('s');
		c.add('s');
		Collection<Character> c1 = new ArrayList<>();
		c1.add('r');
		c1.add('o');
		c1.add('o');
		c1.add('m');
		c1.add('c');

		Collection<Character> c2 = new ArrayList<>();
		c.clear();
		c2.addAll(c);
		c2.addAll(c1);
		c.clear();
		c.add('l');

//		System.out.println(c);
//		System.out.println(c1);
//	
//		System.out.println(c2 + " ");

	}

}
