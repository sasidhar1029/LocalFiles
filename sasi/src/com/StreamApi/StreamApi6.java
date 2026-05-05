package com.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamApi6 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList(" ","","surya","sasi");
		Optional<String> result = list.stream().filter(str -> !str.trim().isEmpty()).findAny();
//				.collect(Collectors.toList());
		System.out.println(result);
	}

}
