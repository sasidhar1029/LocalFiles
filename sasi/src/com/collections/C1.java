package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class C1 {

	public static void main(String[] args) {
		Collection<String> s = new ArrayList<>();
		s.add("subbu");
		s.add("vamsi");
		s.add("sasi");
		s.add("triven");
		s.add("surya");
		s.add("naga");
//		System.out.println(s);

		Collection<Object> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		

		Collection<Object> Total = new ArrayList<>();
		Total.addAll(s);
		Total.addAll(numbers);
		System.out.println(numbers.contains(1));
		System.out.println(Total.containsAll(numbers));
		numbers.clear();//[]
		System.out.println(numbers);//it gives full string because you clear for adding
		//it w will run numbers separetely it will havae empty array
		System.out.println(Total);
//		for (Object b : Total) {
//			System.out.print(b + " ");
//		}
		

	}

}