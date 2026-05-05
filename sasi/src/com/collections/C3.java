package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class C3 {

	public static void main(String[] args) {
		Collection<String> names = new ArrayList<>();
		names.add("sasi");
		names.add("surya");
		names.add("raju");
		names.add("subbu");
		names.add("triven");
		names.add("vamsi");
		// 1st way of representing the data
		System.out.println(names);
		System.out.println("*********************");
		// 2nd way of representing the data
		for (String name : names) {
			System.out.print(name + " ");
		}
		System.out.println();
		System.out.println("*********************");
	}

}
