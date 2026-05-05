package com.dailyAssignments;

public class CountEven {

	public static void main(String[] args) {
		int number =10;
		int count =0;
		int sum =0;
		
		for(int i =1;i<=number;i++) {
			if(i%2==0) {
				count ++;
				
			}
			else {
				sum+=i;
			
			}}
			System.out.println("the count of even numbers:"+count);
			System.out.println("the sum of odd numbers:"+sum);
		
	}

}
