package com.StringHandling;

public class S34 {

	public static void main(String[] args) {
		int i1=100;
		System.out.println(i1+200);
		String s=String.valueOf(i1);
		//converting primitive data type to String
		System.out.println(s+200);
		//converting String to int
		String i2="100";
		int a =Integer.parseInt(s);	
		System.out.println(a+200);

	}

}
