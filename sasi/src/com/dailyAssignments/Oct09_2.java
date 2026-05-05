package com.dailyAssignments;

public class Oct09_2 {

	public static void main(String[] args) {
		String s = "Hello world";
		String[] s2 = s.split(" ");
//		String r ="";
		for (String s3 : s2) {
			String m = " ";
			for (int i = s3.length() - 1; i >= 0; i--) {
				m += s3;
			}
		 m+=s2;
		}
		System.out.println();

	}

}
