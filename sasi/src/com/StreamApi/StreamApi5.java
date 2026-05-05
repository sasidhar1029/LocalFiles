package com.StreamApi;

import java.util.Arrays;
import java.util.List;
//Count Number of Elements Greater than 50
public class StreamApi5 {

	public static void main(String[] args) {
		List<Integer> ev = Arrays.asList(10, 20, 30, 50, 60, 70, 70, 80);
		long e50 = ev.stream().filter(m -> m > 50).count();
		System.out.println(e50);
	}

}
