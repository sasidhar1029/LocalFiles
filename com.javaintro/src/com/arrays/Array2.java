package com.arrays;
//reverse of an array
public class Array2 {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int n =arr.length;
		int temp=0;
		for(int i=0;i<n/2;i++) {
			 temp =arr[i];
			arr[i]=arr[n-i-1];
			arr[n-i-1]=temp;
		}
		System.out.println(temp);
	}

}
