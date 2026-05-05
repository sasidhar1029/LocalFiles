package com.arrays;

import java.util.HashSet;

public class Find_HashSet {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 20, 30, 30, 40, 50, 60, 60 };

		HashSet<Integer> hash = new HashSet<>();
		for (int a : arr) {
			//in if it is true it will print without duplicate 
			//if it is false then it would be print only duplicates(!(hash.add(a)))
			if ((hash.add(a))) {
				System.out.print(a + " ");
			}
		}
	}

}
