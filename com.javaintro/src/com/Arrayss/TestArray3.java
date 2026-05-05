package com.Arrayss;

public class TestArray3 {

	public static void main(String[] args) {
		String[] names = { "sasi", "arjun", "reddy" };
		for (String name : names) {
			System.out.println(name.toUpperCase());
		}
		System.out.println("**************");
		String[] alpha = { "sasi", "arjun", "reddy" };
		for (String name : alpha) {
			System.out.println(name.toLowerCase());
		}
		System.out.println("****************");
		String[] s1 = { "Sasi", "arjun", "reddy" };
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i].toLowerCase());
		}

	}

}
