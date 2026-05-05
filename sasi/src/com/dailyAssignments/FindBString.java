package com.dailyAssignments;

//(11-09-2025);
public class FindBString {

	public static void main(String[] args) {

		String[] str = { "hello", "super_saiyajin", "skyfallgood", "automusultratinct", "goodafternoonghhhh" };
		
		String max = str[0];
		for (int i = 0; i < str.length; i++) {
			if (str[i].length() > max.length()) {
				max = str[i];
			}

		}
		System.out.println(max);

	}

}
