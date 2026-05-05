package com.StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamApi8 {

	public static void main(String[] args) {
		List<Double> list = Arrays.asList(200.00, 300.00, 700.00, 400.00, 600.00, 500.00);
		List<Double> Day = list.stream().filter(s -> s > 500.00).sorted(Comparator.reverseOrder()).toList();
		for(Double d:Day) {
			System.out.println(d+" ");
		}
	}

}
