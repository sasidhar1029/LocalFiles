package com.loops;
  //write a program print 1 to 10 without using loops
public class Withoutloops {
	 static int a =0;
	 Withoutloops(){
		 if(a<10) {
			 a+=1;
			 System.out.print(a+" ");
			 Withoutloops w1 = new Withoutloops();
		 }
	 }
public static void main(String[] args) {
	Withoutloops w1 = new Withoutloops();
}
}
