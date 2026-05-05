package com.javaintro;
import java.util.Scanner;
public class Day21 {
	static String brachName="hyderbad";
	static  String ifsc = "CNRB0003718";
     static Scanner sc = new Scanner(System.in);
      long accnumber() {
    	  System.out.println("enter a your account number:");
    	  long accountNum = sc.nextLong();
    	  
    	
    	 return accountNum;
      }
      String accHolerName() {
    	  System.out.println("Enter your name:");
    	  String accHolderName=sc.next();
    	  System.out.println(accHolderName);
    	  return accHolderName;
      }
      long deposit() {
    	  String fixedSaving;
		System.out.println("Enter your Deposit amount:");
    	  int deposit = sc.nextInt();
    	  System.out.println(deposit);
    	  return fixedSaving() ;
    	  }
      static int  fixedSaving() {
    	  int fixedSaving = 4000;
    	  System.out.println(fixedSaving);
    	 return fixedSaving;
      }
      
	public static void main(String[] args) {
		
       Day21 d1 = new Day21() ;
       d1.accnumber();
       d1.accHolerName();
       d1.deposit();
       fixedSaving();
	}

}
