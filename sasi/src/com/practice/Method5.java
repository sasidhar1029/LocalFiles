package com.practice;

import java.util.Scanner;

public class Method5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
               System.out.println("enter a number");
               String name=sc.next();
              
			getEmpName(name);
	}
	static void getEmpName(String name) {
		System.out.println("Employee name:"+name);
	}

}
