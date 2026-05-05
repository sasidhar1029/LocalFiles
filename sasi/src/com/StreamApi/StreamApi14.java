package com.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi14 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("A","B","c");
		String name = list.stream().map(s->s.toLowerCase()).collect(Collectors.joining(","));
		System.out.println(name);
	}

}
