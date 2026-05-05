package com.Arrayss;

public class Arrays12 {
//find largest element
	public static void main(String[] args) {
		int[] arr = { 3, 2, 0, 7, 25, 12, 11 };
		int max =arr[0];
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				max =arr[i];
			}
		}
		System.out.println("Largest element:"+max);
		
	}

}
