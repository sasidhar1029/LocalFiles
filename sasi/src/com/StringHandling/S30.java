package com.StringHandling;

import java.util.Arrays;

//input :: s="find the longest string";
//output ::longest--> max
//:: string -->second max
public class S30 {

	public static void main(String[] args) {
		String s = "find the longest string";
		String[] s2 = s.split(" ");
		String max = "";
		String smax = "";
		int max1 = s2[0].length();
		int smax1 = s2[0].length();
		for (int i = 0; i < s2.length; i++) {
			if (s2[i].length() > max1) {
				smax = max;
				max = s2[i];
				max1 = s2[i].length();
			} else if (s2[i].length() > smax1 && max1 != s2[i].length()) {
				smax = s2[i];
			}
		}
		System.out.println("second max:" + smax);
		System.out.println("max:" + max);

	}

}
