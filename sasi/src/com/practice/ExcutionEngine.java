package com.practice;

public class ExcutionEngine {
@Override
protected void finalize() throws Throwable {
	 System.out.println("finalize method called");
}
	public static void main(String[] args) {
		ExcutionEngine emp1 = new ExcutionEngine();
		ExcutionEngine emp2 = new ExcutionEngine();
		ExcutionEngine emp3 = new ExcutionEngine();
		emp3 = emp1;
		System.gc();
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);

	}

}
