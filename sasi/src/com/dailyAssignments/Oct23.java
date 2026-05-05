package com.dailyAssignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Oct23 {

	public static void main(String[] args) {
		List<String> students1 = new ArrayList<>();
		students1.add("sasi");
		students1.add("arjun");
		students1.add("surya");
		students1.add("vamsi");
		students1.add("triven");
		List<String> students2 = new ArrayList<>();
		students2.add("sasi");
		students2.add("naga");
		students2.add("raju");
		students2.add("subbu");

		List<String> students = new ArrayList<>();
//		System.out.println(students2.containsAll(students1));
		students.addAll(students1);
		students.addAll(students2);

		Set<String> s1 = new HashSet<>(students);
		System.out.println(s1);

	}

}
