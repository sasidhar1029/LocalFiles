package com.collection;

public class Comparable1 implements Comparable<Comparable1> {

	int jno;
	String sname;
	double sal;
	int rank;

	public Comparable1(int jno, String sname, double sal, int rank) {
		this.jno = jno;
		this.sname = sname;
		this.sal = sal;
		this.rank = rank;
	}

	@Override
	public int compareTo(Comparable1 o) {
		if(this.sal<o.sal) {
			return -1;
		}else if(this.sal>o.sal) {
			return 1;
		}else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return jno + " " + sname + " " + sal + " " + rank;
	}
}
