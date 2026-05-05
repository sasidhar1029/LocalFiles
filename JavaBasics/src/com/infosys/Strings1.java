package com.infosys;

public class Strings1 {

	public static String removeDigit(String number, char digit) {
		int n = number.length();
		for (int i = 0; i < n - 1; i++) {
			if (number.charAt(i) == digit && number.charAt(i + 1) > digit) {
				return number.substring(0, i) + number.substring(i + 1);
			}
		}
		int lastIndex = number.lastIndexOf(digit);
		return number.substring(0, lastIndex) + number.substring(lastIndex + 1);
	}

	public static void main(String[] args) {

		String number = "1321";
		char digit = '1';
		System.out.println(removeDigit(number,digit));
	}

}
