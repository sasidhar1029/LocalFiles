package com.sasi;

public class S29 {

	public static void main(String[] args) {
		int age = 20;
		if(age>0 && age<=5) {
			System.out.println("kids");
		}
		else if(age>5 && age<=12) {
			System.out.println("children");
		}
		else if(age>12 && age<=19) {
			System.out.println("children");
		}
		else if(age>19 && age<=35) {
			System.out.println("young");
		}
		else if(age>35 && age<=65) {
			System.out.println("middle age");
		}
		else if(age>65) {
			System.out.println("old age");
		}
		else {
			System.out.println("invalid age");
		}
		

	}

}
