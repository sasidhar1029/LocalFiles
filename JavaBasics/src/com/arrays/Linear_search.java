package com.arrays;

import java.util.Scanner;

public class Linear_search {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a length of an array");
		int a = sc.nextInt();
		int []arr = new int[a];
		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		int key =30;
		boolean status = false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				status=true;
				break;
			}
		}
		if(status) {
			System.out.println("found"+key);
		}else {
			System.out.println("Not found"+key);
		}
	}

}
