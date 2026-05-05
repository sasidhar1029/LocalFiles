package com.dailyAssignments;

public class Person {
         private int id =10;
         protected String name="sasi";
         public int age=21;
         int deptnono=30;
	public static void main(String[] args) {
	    	 Person p1 = new Person();
		 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

}

