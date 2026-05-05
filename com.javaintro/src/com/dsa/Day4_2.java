package com.dsa;

public class Day4_2 {

	public static void main(String[] args) {
	   String s="abcd";
	   System.out.println(s);
	   String ans="";
	   for(int i=3;i>=0;i--) {
		   ans = ans+s.charAt(i);
	   }
	   System.out.println(ans);

	}

}
