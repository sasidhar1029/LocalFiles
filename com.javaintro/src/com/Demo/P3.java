package com.Demo;

public class P3 {
	public static void main(String[] args) {
		int [] arr = {40,20,10,30,5,2};
		int temp=0;
		System.out.println("Before sorting");
		for(int a:arr) {
			System.out.print(a+" ");
		}
		for(int i=0;i<arr.length;i++) {
			boolean flag=false;
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag =true;
				}
			}
			if(!flag) {
				break;
			}
		}
		System.out.println();
		System.out.println("After sorting");
		for(int a:arr) {
			System.out.print(a+" ");
		}
		
	}
}
