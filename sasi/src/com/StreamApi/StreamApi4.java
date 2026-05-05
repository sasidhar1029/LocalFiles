package com.StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamApi4 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("sasi", "triven", "surya", "raju", "subbu", "naga", "vamsi");
		List<String> sort = list.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println(sort);

	}

}
