package com.Arrayss;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Arrays21 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 60, 40, 40, 50);
		Optional<Integer> n = list.stream().distinct().max(Integer::compare);
		System.out.println(n);

	}

}
