package com.StringHandling;

public class S4 {
	String str1 =new String ("Deepak");
	static String str2 =new String("Vcube");
	static String str3 ="deepak";
	String str4 ="sriknath";
	public static void main(String[] args) {
		S4 s = new S4();
		System.out.println(s);
		String s1 =new String();
//		System.out.println(s1);
		System.out.println("Adress:" + System.identityHashCode(s1));
		
	}

}
