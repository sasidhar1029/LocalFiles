package com.loops;
//write a program print 1 to 10 without using loops
public class Withoutloops1 {
	static int a=0;
	{ 
		if(a<10) {
			a +=1;
			System.out.print(a +" ");
			Withoutloops1 w2 = new Withoutloops1();
		}
	}
	public static void main(String[] args) {
		Withoutloops1 w2 = new Withoutloops1();
	}

}
