package com.constructor;

public class Test1 {
	private String name;
	private int age;

//	public Test1() {
//		this.name = "unknown";
//		this.age = 0;
//	}
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		Test1 t = new Test1();
		t.setAge(12);
		t.setName("sasi");
		System.out.println(t.getName());
		System.out.println(t.getAge());

	}

}
