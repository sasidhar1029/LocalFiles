package com.dailyAssignments;

//(1.Write a Java Program to Sort the Given String based on the digit in each word
//input: "am2 i1 to4 going3 this6 weekend7 hometown5"
//output: i am going to hometown this weekend)
public class Sep22 {

	public static void main(String[] args) {
		int n = 1;
		String res = "";
		String input = "am2 i1 to4 going3 this6 weekend7 hometown5";

		String[] s1 = input.split(" ");
		for (String s : s1) {
			for (String s2 : s1) {
				if (s2.contains(n + " ")) {
					res += s2.replaceAll("[0-9]", " ");
					n++;
				}
			}
		}
		System.out.println(res);
	}

}
