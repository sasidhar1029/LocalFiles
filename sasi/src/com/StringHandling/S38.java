package com.StringHandling;
//1.Write a Java program to find the longest word in a sentence that:
//-> Contains at least one vowel, and
//-> Does not contain any repeating characters.
//
//ex: input:- String sentence = "Smart people plan daily work perfectly";
//    output:- Smart

public class S38 {

	public static void main(String[] args) {
		String s ="Smart people plan daily work perfectly";
		String[] s2 =s.split(" ");
		for(int i=0;i<=s2.length-1;i++) {
			System.out.println(s2[i]);
		}
	}

}
