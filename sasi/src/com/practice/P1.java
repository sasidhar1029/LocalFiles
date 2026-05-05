package com.practice;

public class P1 {
	float r;
	int l;
	int b;
	int s;

	public P1(float r) {
		this.r = r;
		System.out.println("Area of  circle:" + Math.PI * r * r);
	}

	public P1(int l, int b) {
		this.l = l;
		this.b = b;
		System.out.println("Area of reactangle:" + l * b);
	}

	public P1(int s) {
		this.s = s;
		System.out.println("Area of square:" + s*s);
	}

	public static void main(String[] args) {
		P1 p = new P1(2,4);
	
	}

}
