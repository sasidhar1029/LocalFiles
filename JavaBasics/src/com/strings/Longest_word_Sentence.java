package com.strings;

public class Longest_word_Sentence {

	public static void main(String[] args) {
		String s="Welcome to Infosys DSE Interview";
		String[] words =s.split(" ");
		String longest ="";
		for(String w:words) {
			if(w.length()>longest.length()) {
				longest=w;
			}
		}
		System.out.println(longest);
	}

}
