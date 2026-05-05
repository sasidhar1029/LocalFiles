package com.oops.typesof_inh;


class TestD{
	int a = 10;
	void method1() {
		System.out.println("method1 called in testA");
	}
}

class TestE extends TestD{
	int b = 20;
	void method1() {
		System.out.println("method1 called in testB");
	}
}
class TestF extends TestE{
	int c =30;
	void method3() {
		System.out.println("method3 called from testC");
	}
}
public class Multi_level_inh {

	public static void main(String[] args) {
	  TestF testF = new TestF();
	  System.out.println(testF.b);
	  System.out.println(testF.a);
	  System.out.println(testF.c);
      testF.method1();
      testF.method3();
	}

}
