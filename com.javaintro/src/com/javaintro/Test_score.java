package com.javaintro;

public class Test_score {
	  int num = 200;
	 int num1 = 390;
	 int total;
	 int avg;
	 long multiple;
	 double divide;
	public static void main(String[] args) {
		
		 Test_score t1 = new Test_score();
		 t1.num = 200;
		 t1.num1 = 380;
		 t1.total = (t1.num + t1.num1);
		 System.out.println(t1.total);
		 
		 t1.avg = (t1.num+t1.num1)/2;
		 System.out.println(t1.avg);
		 
		 t1.multiple =(t1.num*t1.num1);
		 System.out.println(t1.multiple);
		 
		 t1.divide = (t1.num/t1.num1);
		 System.out.println(t1.divide);

	}

}
