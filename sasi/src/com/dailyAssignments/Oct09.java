package com.dailyAssignments;

public class Oct09 {

	public static void main(String[] args) {
		String s = "Java is Fun";
		String[] s2 = s.split(" ");
		String r ="";
		for (String word : s2) {
		 String k="";
		 for(int i=word.length()-1;i>=0;i--) {
			 k+=word.charAt(i);
		 }
		 r+=k+ " ";
		}
		System.out.println(r.trim());
	}

}
