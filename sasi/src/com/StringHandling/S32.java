package com.StringHandling;

public class S32 {

	public static void main(String[] args) {
		String[] names = { "abhishek", "Gill", "Dube", "jadeja", "kuldeep", "bhumra", "sky", "Tilak", "hardik", "varun",
				"srikanth" };
		for (String name : names) {
			if (name.startsWith("s") || name.endsWith("k") || name.contains("r")) {
//				if (name.toLowerCase().startsWith("s") ||
//						name.toUpperCase().endsWith("K") || name.contains("r"))
				System.out.println(name);
			}
		}

	}

}
