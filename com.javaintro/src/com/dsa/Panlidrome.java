package com.dsa;

public class Panlidrome {

	public static void main(String[] args) {
		String s = "absa";
		String ans = "";
		for (int i = s.length()-1; i>=0; i--) {
			//s.length()--it is for string length.so here string length is 3 so we want indices start from
			// 0 so we need 2 so we give -1 for string length
            //s.length --- it is for array length
			ans = ans+s.charAt(i);
		}
		//Comparing the reversed string with the original using .equals()
		if(ans.equals(s)) {
			System.out.println("yes macha this is palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}

}
