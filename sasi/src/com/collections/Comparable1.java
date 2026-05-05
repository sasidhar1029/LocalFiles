package com.collections;

public class Comparable1 implements Comparable<Comparable1> {
	int id;
	String name;
	int age;
	String branch;

	public Comparable1(int id, String name, int age, String branch) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.branch = branch;
	}

	public String toString() {
		return this.id + ":" + this.name + ":" + this.age + ":" + this.branch;
	}

	@Override
	public int compareTo(Comparable1 o) {
		if (this.age < o.age) {
			return -1;
		} else if (this.age > o.age) {
			return 1;
		} else {
			return 0;
		}
	}
}
