package com.dsa;
//WAP a program find the numbers which is divisible by 3.
public class Day3_1 {

	public static void main(String[] args) {
      int arr[]= {6,5,4,3,2,1};
      int count=0;
      System.out.println("numbers divisible by 3:");
      for(int i=0;i<arr.length;i++) {
    	int temp =arr[i];
      if(temp%3==0) {
    	  System.out.println(temp);
    	  count++;
      }
      }
      System.out.println("Total count:"+count);
	}

}
