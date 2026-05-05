package com.StringHandling;

public class S10 {

	public static void main(String[] args) {
		String[] names = { "gill", "abhishek", "sky", "arshadeep", "sasi", "arjun" };

		for (String name : names) {
			if (name.toLowerCase().contains("a")) {
				System.out.println(name);
			}
		}
	}

}
