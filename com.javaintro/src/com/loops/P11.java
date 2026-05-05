package com.loops;
//Print all even numbers between 1 and 100.
public class P11 {

	public static void main(String[] args) {
		int count =0;
	for (int i = 1;i<=100;i++) {
		if(i%2==0) {
			System.out.println(i);
			count++;
		}
	}
    System.out.println("count of all even numbers 1 to 100:"+count);
	}

}
