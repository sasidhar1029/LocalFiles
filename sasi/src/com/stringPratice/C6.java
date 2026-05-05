package com.stringPratice;

public class C6 {

	public static void main(String[] args) {
		String s1 = "example.com";
		String s2 = "Example.com";
		StringBuffer buf = new StringBuffer(s1);
		System.out.println(s1.contentEquals(buf));
		System.out.println(s2.contentEquals(buf));
		System.out.println(s2.contains(buf));
	}

}