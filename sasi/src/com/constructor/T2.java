package com.constructor;

public class T2 {
	int sid;
	String sname;
	int age;
	long phno;

	T2(int sid, String sname, int age, long phno) {
		this.sid = sid;
		this.sname = sname;
		this.age = age;
		this.phno = phno;
	}

	public static void main(String[] args) {
		System.out.println("main method staretd");
		T2 t = new T2(1, "sasi", 22, 9347272990L);
		t.sid = 12;
		t.sname = "reddy";
		t.age = 23;
		t.phno = 9515273090L;
		t.show();
		T2 t1 = new T2(1, "sasi", 22, 951527844L);
		t1.show();
		T2 t3 = new T2(2, "arjun", 21, 657898823);
		t3.show();
	}

	void show() {
		System.out.println("******************");
		System.out.println("Student id:" + sid);
		System.out.println("Student name:" + sname);
		System.out.println("Student age:" + age);
		System.out.println("Student phone:" + phno);
	}

}
