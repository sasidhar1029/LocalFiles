package com.loops;

public class PerfectorNot1 {

	public static void main(String[] args) {
     int num = 28;
     int sum =0;
     int i =1;
     while(i<num) {
    	 if(num%i==0) {
    		 sum +=i;
    	 }
    	 i++;
     }
     if(num==sum) {
    	 System.out.println("the given number is perfect number");
     }else {
    	 System.out.println("The given number is not perfect number");
     }
	}

}
