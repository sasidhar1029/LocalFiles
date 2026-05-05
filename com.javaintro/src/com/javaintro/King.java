package com.javaintro;

public class King {
  
	{
		String name = "King";
		Integer salary = 27000;
		Integer pfDeduction = 5;
		 Integer cgst = 7;
		Integer da = 3;
		Integer pfdMonth = (salary*5)/100;
		Integer cgstMonth = (salary*7)/100;
		Integer daMonth = (salary*3)/100;
		Integer total = salary+daMonth;
		Integer nSalary= total-pfdMonth-cgstMonth;
		
		System.out.println(name);
		System.out.println(salary);
		System.out.println(pfDeduction);
		System.out.println(cgst);
		System.out.println(da);
		System.out.println(pfdMonth);
		System.out.println(cgstMonth);
		System.out.println(daMonth);
		System.out.println(total);
		System.out.println(nSalary);
	}
	public static void main(String[] args) {
		King k1 = new King();

	}

}
