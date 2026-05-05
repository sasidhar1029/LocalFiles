package com.StringHandling;

public class S15 {

	public static void main(String[] args) {

		String str = "java";
		System.out.println(str); // original
		StringBuilder sb = new StringBuilder(str).reverse();
		System.out.println(sb);
//		System.out.println(new StringBuilder(str).reverse()); // reversed
	}

}
