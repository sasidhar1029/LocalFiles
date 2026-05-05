package com.arrays;

import java.util.Arrays;

public class movingAllZerosToEnd {

	public static void main(String[] args) {
		int [] arr= {1,0,1,2,0,1,0,3,4};
		int p=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[p]=arr[i];
				p++;
			}
		}
		while(p<arr.length) {
			arr[p]=0;
			p++;
		}
		System.out.println(Arrays.toString(arr));
	}

}
