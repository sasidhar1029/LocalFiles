package com.Arrayss;

public class Sorting_Elements {
//sort the elements in asceding order
	public static void main(String[] args) {
		int [] arr = {12,23,23,02,48,23,67,86,986,57};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] =arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int a:arr) {
			System.out.print(a+" ");
		}

	}

}
