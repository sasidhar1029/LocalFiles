package com.Strings;

public class Check_isNumber {

	public static void main(String[] args) {
		String s = "1345ad6";
		boolean isnum = true;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (!(ch >= '0' && ch <= '9')) {
				isnum = false;
				break;

			}
		}
		if (isnum) {
			System.out.println("The given String have only numbers");
		} else {
			System.out.println("The given String having not only numbers");
		}

	}

}
