package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylist1 {

	public static void main(String[] args) {
		List<Integer> a1 = new ArrayList<>();
		a1.add(10);
		a1.add(30);
		a1.add(20);
		a1.add(40);
		a1.add(60);
		a1.add(50);
		System.out.println(a1);
		a1.remove(1);
		a1.set(1, 2);
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println(a1);
		Collections.sort(a1.reversed());
		System.out.println(a1);
		int max = Collections.max(a1);
		int min = Collections.min(a1);
		System.out.println(max);
		System.out.println(min);

	}

}
