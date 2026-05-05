package com.collections;

import java.util.Stack;

public class S1 {

	public static void main(String[] args) {
		Stack<String> bookStack = new Stack<>();
//		bookStack.push("j2se");
//		bookStack.push("j2EE");
//		bookStack.push("java");
//		bookStack.push("web ");
//		bookStack.push("sql");
		System.out.println(bookStack.pop());//java.util.EmptyStackException
		System.out.println(bookStack.peek());//java.util.EmptyStackException
		System.out.println(bookStack.empty());//true
		System.out.println(bookStack.search(bookStack));//-1
	}

}
