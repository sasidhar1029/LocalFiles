package com.dailyAssignments;

public class Null_pointerException {

	boolean method() {
		System.out.println("method is calling");
		return false;
	}

	public static void main(String[] args) {

		try {
			Null_pointerException n = null;
			System.out.println(n.method());
		} catch (NullPointerException n1) {
			System.err.println("in catch");
			n1.printStackTrace();

		} finally {
			System.out.println("in finally");
		}

	}

}
