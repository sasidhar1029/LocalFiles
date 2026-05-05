package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C6 {

	public static void main(String[] args) {
		List<String> colors = new ArrayList<>();
		colors.add("red");
		colors.add("black");
		colors.add("green");
		colors.add("pink");
		colors.add("yellow");
		colors.add("gray");
		colors.add("white");
		System.out.println("Before sorting:" + colors);
		Collections.sort(colors);
		System.out.println("After the sorting:" + colors);

	}

}
