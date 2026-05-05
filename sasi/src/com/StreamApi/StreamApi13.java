package com.StreamApi;

import java.util.Arrays;
import java.util.List;

public class StreamApi13 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(20, 30, 1, 40, 10, 30, 40);
		int max = list.stream().distinct().max(Integer::compare).get();
		int min = list.stream().distinct().min(Integer::compare).get();
		System.out.println("max element:" + max);
		System.out.println("min elemen:" + min);
	}

}
