package com.collections;

import java.util.ArrayList;
import java.util.Collection;

//retainAll
public class C6 {

	public static void main(String[] args) {
		Collection <String> fruits = new ArrayList<>();
		fruits.add("orange");
		fruits.add("mango");
		fruits.add("Banana");
		fruits.add("graphes");
		fruits.add("apple");
		Collection <String> veggies = new ArrayList<>();
		veggies.add("Tomato");
		veggies.add("Potato");
		veggies.add("Bendis");
		veggies.add("Banana");
//		System.out.println(fruits);
//		System.out.println(fruits.retainAll(veggies));
//		System.out.println(fruits);
//		System.out.println(veggies);
		System.out.println(fruits);
		Object[] objs =fruits.toArray(); //collection to array
		for(Object obj:objs) {
			System.out.print(obj+" ");
		}
		
	}

}
