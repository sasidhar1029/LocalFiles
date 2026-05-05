package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Write a Java program to copy one ArrayList into another using addAll()
//and then sort the new list.

public class C8 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("sasi");
		names.add("sasi");
		names.add("vamsi");
		names.add("triven");
		names.add("surya");
		names.add("naga raju");
		System.out.println(names);
		List<String> animals = new ArrayList<>();
		animals.addAll(names);
		Collections.sort(animals);
		System.out.println(animals);

	}

}
