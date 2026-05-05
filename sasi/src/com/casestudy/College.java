package com.casestudy;

public class College {

	public static void main(String[] args) {
		String[] students = { "sasi", "naga", "subbu" };
		try {
			System.out.println(students[5]);
		} catch (ArrayIndexOutOfBoundsException ar) {
			System.out.println("Student not found-invalid index");
		} finally {
			System.out.println("in finally");
		}

	}

}
