package com.collection;

public class Comparator1 {

    int jno;
    String sname;
    double sal;
    int rank;

    public Comparator1(int jno, String sname, double sal, int rank) {
        this.jno = jno;
        this.sname = sname;
        this.sal = sal;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return jno + " " + sname + " " + sal + " " + rank;
    }
}
