package com.arrays;

import java.util.HashSet;

public class Find_pair {

	public static void main(String[] args) {
		int[] arr = { 2, 7, 11, 15 };
		int target = 9;
		HashSet<Integer> set = new HashSet<>();
		for (int a : arr) {
			if (set.contains(target - a)) {
				System.out.println("pair found");
			} 
			set.add(a);
		}
	}

}
