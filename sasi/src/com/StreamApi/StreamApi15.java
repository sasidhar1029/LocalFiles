package com.StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamApi15 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 60, 50);
		int nums = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(nums);

	}

}
