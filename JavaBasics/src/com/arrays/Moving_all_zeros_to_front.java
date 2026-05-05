package com.arrays;

import java.util.Arrays;

public class Moving_all_zeros_to_front {

	public static void main(String[] args) {
		int [] arr= {1,0,1,2,0,1,0,3,4};
		int p=arr.length-1;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]!=0) {
				arr[p]=arr[i];
				p--;
			}
		}
		//p>=0 means loop runs as long as p is valid index
		while(p>=0) {
			arr[p]=0;
			p--;
		}
		System.out.println(Arrays.toString(arr));
	}

}
