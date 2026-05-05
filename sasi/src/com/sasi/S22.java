package com.sasi;

public class S22 {
        int num1 = 10;
        int num2 = 20;
        void setValues(int num,int number) {
        	num = num1;
           number = num2;
           System.out.println(num1);
           System.out.println(num2);
        }
        void addition() {
        	setValues(12,64);
        	int sum = num1+num2;
        	System.out.println(sum);
        }
        void subtraction() {
        	setValues(12,64);
        	int sub = num1-num2;
        	System.out.println(sub);
        }
        
	public static void main(String[] args) {
		S22  n = new S22();
		n.setValues(12,64);
		n.addition();
		n.subtraction();
		
		

	}

}
