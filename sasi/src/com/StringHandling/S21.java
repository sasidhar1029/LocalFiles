package com.StringHandling;

import com.dailyAssignments.Null_pointerException;

public class S21 {

	public static void main(String[] args) {
		String s1 = "";
		String s2 = null;
		String s3 = " ";
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s1 == s3);

		// Returns true,if the string is empty or contains only white space codepoints,
		// otherwise false.
		System.out.println(s1.isBlank());// true
		// returns true if and only if length() is 0
		System.out.println(s1.isEmpty());// true
		try {
			System.out.println(s2.isBlank());// NullPointerException
			System.out.println(s2.isEmpty());// NullPointerException
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ok");
		}

		System.out.println(s3.isBlank());// true (coz it has white space)
		System.out.println(s3.isEmpty());// false

	}

}
