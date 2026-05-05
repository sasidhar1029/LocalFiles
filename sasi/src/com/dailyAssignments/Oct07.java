package com.dailyAssignments;

public class Oct07 {
	public static void main(String[] args) {
		String s = "i love vcube";
		String temp = s.replace(" ", "");
		String result = "";
		int mk = temp.length()-1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				result += " ";
			} else {
				result += temp.charAt(mk);
				mk--;
			}
		}
		System.out.println(result);
	}
}
