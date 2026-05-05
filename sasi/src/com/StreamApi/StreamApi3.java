package com.StreamApi;

import java.util.Arrays;
import java.util.List;

//Convert List of Strings to Uppercase
public class StreamApi3 {

	public static void main(String[] args) {
		List<String> s = Arrays.asList("sasi", "surya", "subbu", "raju");
		
		List<String> upperString = s.stream().map(String::toUpperCase).toList();
		System.out.println(upperString);

	}

}
