package com.casestudy;

public class Main {

	public static void main(String[] args) {
		Teacher t =new Teacher();
		Student s =new Student();
	
		t.setAddress("address:"+"kphp");
		t.setName("studentName:"+"sasi");
		t.setAge(31);
		t.setEmployeeId(120);
		t.setSubject("subject:"+"java");
		t.displayDetails();
	
		s.setAddress("Adress of student:"+"kphp");
		s.setAge(21);
		s.setName("student name:"+"subbu");
		s.setRollNumber(19);
		s.setGrade("studnet:"+"B");
		s.displayDetails();

	}

}
