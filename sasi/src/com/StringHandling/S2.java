package com.StringHandling;

public class S2 {

	public static void main(String[] args) {
		String s1 = "virat";
		System.out.println(s1);
		String s2 = "virat";
		System.out.println(s2);
		String s3 = "kohli";
		System.out.println(s3);
		String s4 = new String("Srikanth");
		System.out.println(s4);
		String s5 = "Srikanth";
		String s6 = new String("virat");
		System.out.println(s4 == s5);
		System.out.println(s4.equals(s5));
		System.out.println(s4.equalsIgnoreCase(s5));
		s1 = "king";
		System.out.println(s1);
	}

}
