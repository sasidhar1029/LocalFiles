package com.StreamApi;

import java.util.Arrays;
import java.util.List;

public class StreamApi12 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,8,9,9);
		List<Integer> nums = list.stream()
							.distinct().toList();
		System.out.println(nums);
	}

}
