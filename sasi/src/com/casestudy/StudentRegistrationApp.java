package com.casestudy;
//(31-08-2025)
public class StudentRegistrationApp {

	public static void main(String[] args) {
		Student1 s= new Student1(1,"arjun",'A');
		Student1 s1 =new Student1(2,"subbu",'B');
		Student1 s2 =new Student1(3,"surya",'C');
		RegistrationForm r= new RegistrationForm("sasi",20,"male");
		System.out.println("Students Details:");
		System.out.printf("%-10s %-20s %-1s\n","Roll no","Name","Grade");
	    System.out.println("--------------------------------------");
		s.display1();
		s1.display1();
		s2.display1();
		System.out.println();
		r.display();

	}

}
