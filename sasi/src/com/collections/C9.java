package com.collections;

 class C9 extends Object {
		int sid;
		String sname;
	@Override
	public String toString() {
		return "Student Info-Id:"+sid+"Sname:"+sname;
	}
}

 class TestStudent{
	 public static void main(String[] args) {
		System.out.println("Hello main");
		C9 c = new C9();
		System.out.println(c);
		System.out.println(c.toString());
	}
 }
