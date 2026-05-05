package com.loops;

import java.util.Scanner;

public class Loopsf_for1 {
   static  Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter a opeartion");
		int opeartion =sc.nextInt();
		switch(opeartion) {
		case 1 ->
		handelBatteryissue();
		case 2 ->
		handleNetworkIssue();
		case 3 ->
		 appCrashes();
		case 4 ->
		StorageIssue();
		case 5 ->
		exit();
		default->
		System.out.println("inavlid operation");
		}
		
	}
	static void  handelBatteryissue() {
		 sc.nextLine();
		System.out.println("please tell me the battery probelm what your facing(yes/no)");
		 String batteryIssue = sc.nextLine();
		 if(batteryIssue.equals("yes")) {
			 
			 System.out.println("ok we will check the battery once ");
		 }
		 else {
			 System.out.println("sorry");
		 }
	}
	static void handleNetworkIssue() {
		 sc.nextLine();
		System.out.println("please tell me what  network issue your facing(yes/no) ");
		String networkIssue = sc.nextLine();
		if(networkIssue.equals("yes")) {
			System.out.println("ok i will check the issue the once");
		}else {
			System.out.println("there is no internet issue");
		}
	}
	static void appCrashes() {
		 sc.nextLine();
		System.out.println("let me know the which apps are crash when your using phone(yes/no)");
		String appCrashes = sc.nextLine();
		if(appCrashes.equals("yes")) {
			System.out.println("ok i will find those apps and we will slovw those");
		}else {
			System.out.println("there is no crashed apps");
		}
	}
	static void StorageIssue() {
		 sc.nextLine();
		System.out.println("let me know the storage issues if issue is there enter yes or no");
		String storageIssue = sc.nextLine();
		if(storageIssue.equals("yes")) {
			System.out.println("ok we see the problem and slove the issues");
		}else {
			System.out.println("there is no storage issue");
		}
	}
	static void exit() {
		 sc.nextLine();
		System.out.println("if your enter a yes it will exit or i you will enter no i will no exit");
		String exit = sc.nextLine();
		if(exit.equals("no")) {
			System.out.println("now we will exit the progress");
		}
		else {
			System.out.println("your still in a process");
		}
	}

}
