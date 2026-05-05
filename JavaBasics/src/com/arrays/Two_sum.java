package com.arrays;

public class Two_sum {

	public static void main(String[] args) {
		int[]arr = {10,20,49,93,933,23};
		int target = 30;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println(i+" "+j);
				}
			}
		}
	}

}
