package com.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi16 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("sasi", "Surya", "triven", "subbu", "raju");
		List<String> name = names.stream().filter(s -> s.toLowerCase().startsWith("s")).collect(Collectors.toList());
		System.out.println(name);
	}

}
