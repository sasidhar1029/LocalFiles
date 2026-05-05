package com.Arrayss;

public class Count_freq {
//frequency of each element
	public static void main(String[] args) {
		int[] arr = { 12, 23, 23, 02, 48, 23, 67, 86, 986, 57 };
		for(int i=0;i<arr.length;i++) {
			int count =1;
			boolean isDuplicate = false;
			for(int k=0;k<i;k++) {
				if(arr[i]==arr[k]) {
					isDuplicate = true;
					break;
				}
			}
			if(isDuplicate)continue;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] ==arr[j]) {
					count++;
				}
			}
			System.out.println(arr[i]+"-"+ count+" times");
		}
	}
}
