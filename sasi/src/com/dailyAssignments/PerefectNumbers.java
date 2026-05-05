package com.dailyAssignments;

public class PerefectNumbers{

	public static void main(String[] args) {
	    int n =6;
		int sum = 0;
		for(int i =1 ;i<n;i++) {
			if(n%i==0) {
				sum = sum+i;
			}
		}
		if(n==sum) {
				System.out.println("the given number is perfect number");
			
		}else {
				System.out.println("the given number is not a perfect number");
			}
			
		}
		
		

	}


