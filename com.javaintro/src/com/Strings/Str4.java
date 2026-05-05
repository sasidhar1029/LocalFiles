package com.Strings;

import java.util.Scanner;
//find the words count in given String
public class Str4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.nextLine();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			s.charAt(i);
			count++;
		}
		System.out.println(count);

	}

}
