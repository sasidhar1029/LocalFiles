package com.strings;

public class Reverse_an_String {

	public static void main(String[] args) {
		String s = "Sasidhar";
		System.out.println(s);
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev += s.charAt(i);
		}
		System.out.println("Reverse String:"+rev);
	}

}
