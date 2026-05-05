package com.collections;

import java.util.Stack; 

public class StackExample {

	public static void main(String[] args) {
		Stack<String> bookStack = new Stack<>();
		bookStack.push("j2se");
		bookStack.push("j2EE");
		bookStack.push("java");
		bookStack.push("web ");
		bookStack.push("sql");
		System.out.println(bookStack);
		System.out.println(bookStack.pop());
		System.out.println(bookStack.peek());

		System.out.println(bookStack.empty());
		System.out.println(bookStack.search("java"));

	}
}
