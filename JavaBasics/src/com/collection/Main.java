package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Comparable1 c  = new Comparable1(18, "Sasi",   80200, 1);
        Comparable1 c1 = new Comparable1(19, "Bounty", 30200, 2);
        Comparable1 c2 = new Comparable1(20, "Bison",  98200, 3);
        Comparable1 c3 = new Comparable1(21, "Arjun",  72200, 4);

        List<Comparable1> criclist = new ArrayList<>();
        criclist.add(c);
        criclist.add(c1);
        criclist.add(c2);
        criclist.add(c3);

        Collections.sort(criclist);

        for (Comparable1 obj : criclist) {
            System.out.println(obj);
        }
    }
}
