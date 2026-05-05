package com.arrays;

//Write a Java program to sort a numeric array and a string array.
public class Sorting {

	public static void main(String[] args) {
		int[] my_array1 = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456 };

		String[] my_array2 = { "Java", "Python", "PHP", "C#", "C Programming", "C++" };
		for (int i : my_array1) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (String s : my_array2) {
			System.out.print(s + " ");
		}

	}

}
