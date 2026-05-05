package com.collections;

import java.util.ArrayList;
import java.util.List;

public class TestEmployee {

	public static void main(String[] args) {
		System.out.println("Represent lisf of employees");
		Employee e1 = new Employee(1, "sasi", 699993, 8732676033l);
		Employee e2 = new Employee(2, "arjun", 697777, 8332653233l);
		Employee e3 = new Employee(3, "surya", 900000, 93472722990l);
		List<Employee> emplist = new ArrayList<>();
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		for(Employee emp:emplist) {
			System.out.println(emp);
		}
	  
	}
	

}
