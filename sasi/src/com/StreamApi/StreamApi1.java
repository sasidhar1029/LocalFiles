package com.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(1);
		list.add(34);
		list.add(20);
		list.add(22);
		list.add(64);
		list.add(57);
//		List<Integer> even = list.stream().filter(n -> n % 2 == 0).sorted().collect(Collectors.toList());//for asceding order
		List<Integer> even = list.stream().filter(n -> n % 2 == 0).sorted(java.util.Comparator.reverseOrder())//for desceding order
				.collect(Collectors.toList());
		System.out.println(even);
	}
}
