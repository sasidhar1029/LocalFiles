package com.StringHandling;

// var args
public class S22 {
	void add(String z, int... a) {
		int sum = 0;
		for (int numbers : a) {
			sum = sum + numbers;
		}
		
		System.out.println("Sum of the Numbers:" + sum);
	}

	public static void main(String[] args) {
		S22 s = new S22();
		s.add("s");
		s.add("s", 10);
		s.add("sa", 20);
		s.add("sas", 89, 191, 11);
		s.add("Sasi", 22, 3, 4, 4);
	}

}
