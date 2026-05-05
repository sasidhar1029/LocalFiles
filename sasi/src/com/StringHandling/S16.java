package com.StringHandling;

public class S16 {

	public static void main(String[] args) {
		String s = "sasidhar";
		char[] c = s.toCharArray();
		String rstr = "";
		for (int i = s.length()-1; i >=0; i--) {
			rstr += c[i];
		}
		System.out.println("Reverse of an array:" + rstr);
	}

}
