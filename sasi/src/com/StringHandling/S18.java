package com.StringHandling;

import java.util.Scanner;

public class S18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		System.out.println(str.lastIndexOf('a'));//for 1st 'a'
		System.out.println(str.indexOf('a', str.indexOf('a') + 1));//for getting 2nd 'a'
		System.out.println(str.indexOf('a', str.indexOf('a', str.indexOf('a') + 1) + 1));
		//For getting 3rd 'a'

	}

}
