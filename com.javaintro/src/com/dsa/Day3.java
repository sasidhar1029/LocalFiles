package com.dsa;
//WAP a program to count how many 1's in given array
public class Day3 {

	public static void main(String[] args) {
		int arr[]= {1,4,6,8,4,1,6,2,1};
		 int count =1;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]==1) {
				count++; 
//				count +=1;
			}
		}
		System.out.println(count);
		}
	

}
