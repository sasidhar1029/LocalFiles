package com.StreamApi;

import java.util.Arrays;
import java.util.List;

public class StreamApi2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 21, 41, 70, 31, 51, 61);
		List<Integer> odd = list.stream().filter(n -> n % 2 != 0).sorted(java.util.Comparator.reverseOrder()).toList();
		System.out.println(odd);

	}

}
