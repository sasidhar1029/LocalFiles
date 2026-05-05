package com.dsa;

public class Day4_3 {

	public static void main(String[] args) {
        String s ="aba";
        String ans ="";
        //arr.length ---> is for array length
        //s.length() ---> is for getting string length(The main differene is only ()'pranthaesis'
        for(int i=s.length()-1;i>=0;i--) {
        	ans =  ans+s.charAt(i);
        }
        if(ans.equals(s)) {
        	System.out.println("yes it is a palindrome :"+ans);
        }else {
        	System.out.println("it is not a palindrome:"+ans);
        }

	}

}
