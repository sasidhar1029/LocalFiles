package com.loops;
//Print only odd numbers from 1 to 20.
public class P15 {

	public static void main(String[] args) {
		int count =0;
		int sum = 0;
	for(int i=0;i<=20;i++) {
	   if(i%2!=0) {
		   System.out.println(i);
		   count++;
		   sum +=i;
	   }
	}
	System.out.println("the sum of odd numbers from 10 to 20:"+sum);
	System.out.println("the count of odd numbers from 1 to 20=="+count);
	}

}
