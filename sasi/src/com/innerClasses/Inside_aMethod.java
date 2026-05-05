package com.innerClasses;

public class Inside_aMethod {
	public static void main(String[] args) {
		System.out.println("main method stared");
		Inside_aMethod i1 = new Inside_aMethod();
		i1.hello();
	}

	void hello() {
		System.out.println("method called");
		int num = 100;
		class I1 {
			void print() {
				System.out.println("value:" + num);
			}
		}
		I1 i1 = new I1();
		i1.print();
	}
}
