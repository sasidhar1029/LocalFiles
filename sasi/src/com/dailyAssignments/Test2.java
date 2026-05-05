package com.dailyAssignments;

public class Test2 {

	public static void main(String[] args) {
		String input = "a1b2c3";
		String result = "";
		for (int i = 1; i < input.length(); i++) {
			char prvs = input.charAt(i - 1);
			char c = input.charAt(i);
			if (Character.isDigit(c)) {
				int s1 = Integer.parseInt(c + " ");
				for (int j = 0; j < s1; j++) {
					result += prvs;
				}
			}
		}
		System.out.println(result);

	}

}
