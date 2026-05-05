package com.StreamApi;

import java.util.Arrays;
import java.util.List;

public class StreamApi9 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("sasi","subbu","surya","arjun","triven","vamsi","raju");
		long  nums = list.stream().filter(s->(s.startsWith("s"))||(s.startsWith("v"))).count();
		System.out.println(nums);
	}

}
