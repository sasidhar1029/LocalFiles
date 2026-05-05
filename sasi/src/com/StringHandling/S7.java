package com.StringHandling;

public class S7 {

	public static void main(String[] args) {
	String name1 ="sasi"; // s and  a are same in two strings then after 'a' 's' in
	//name 1 and 'r' is in  name2 then compare difference of two strings of ascii code 
	// of 's'  is 115 and ascii code of 'r' is 114 so answer is 1
	String name2="Sarjun";
	System.out.println(name1.compareTo(name2));
	System.out.println(name1.compareToIgnoreCase(name2));

	}

}
