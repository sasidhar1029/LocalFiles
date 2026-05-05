package com.StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test7 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 2, 30, 4, 90);
		List<Integer> num = list.stream().map(n -> n * n).sorted(Comparator.reverseOrder()).toList();
		System.out.println(num);
	}

}
