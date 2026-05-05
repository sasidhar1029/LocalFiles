//Write a Java program Without Using Any Primitive Data Types Declare fields As Empno, Ename, Salary, Hiredate, Experience.
//1.Employee earns 5000/month with a 10% annual bonus.
//2.Calculate and print Annual Salary, Annual Bonus, and Total Annual Earnings with Employee Details.
//Data Should Print Automatically whenever an Instance is Creates for class

package com.javaintro;

public class Primitive {
	{
		Integer empNo = 1;
		String eName = "sasi";
		Integer salary = 5000;
		String hireDate = "22-06-2024";
		Integer experience = 2;
		Integer asalary = 5000*12;
		Integer abonus = (asalary/100)*10;
		Integer total = asalary+abonus;
		System.out.println(empNo);
		System.out.println(eName);
		System.out.println(salary);
		System.out.println(hireDate);
		System.out.println(experience);
		System.out.println("annual salary:"+asalary);
		System.out.println("annual bonus:"+abonus);
		
		System.out.println("Total money"+total);
	}
	 
	public static void main(String[] args) {
      Primitive p1 = new Primitive();
	}

}
