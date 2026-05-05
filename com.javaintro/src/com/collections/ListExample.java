package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(1, 22);// 10 22 20 30 40 50
		l.add(2, 99);// 10 22 99 20 30 40 50
		l.add(0, 19);// 19 10 22 99 20 30 40 50
		l.add(1, 14);// 19 14 10 22 99 20 30 40 50
		l.set(4, 40);// 19 14 10 22 40 20 30 40 50
//		System.out.println(l.get(6));
//		System.out.println(l);
		System.out.println(l.remove(2));
		System.out.println(l.remove(l.indexOf(1)));
//		for (int i = 0; i < l.size(); i++) {
//			System.out.print(l.get(i) + " ");
//		}

	}

}
