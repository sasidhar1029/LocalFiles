package com.dailyAssignments;

public class Oct08 {

	public static void main(String[] args) {
		String s ="i love programming";
		String[] s2 = s.split(" ");
		int max = 0;
		int max1 = s2[0].length();
		for(int i=0;i<s2.length;i++) {
			if(s2[i].length()>max1) {
				max1 =s2[i].length();
				}
		}
		System.out.println((char)max1);

	}

}
