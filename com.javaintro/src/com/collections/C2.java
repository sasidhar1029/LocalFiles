package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class C2{
    public static void main(String[] args) {

        Collection<Character> c = new ArrayList<>();
        c.add('c');
        c.add('l');
        c.add('a');
        c.add('s');
        c.add('s');

        Collection<Character> c1 = new ArrayList<>();
        c1.add('r');
        c1.add('o');
        c1.add('o');
        c1.add('m');
        c1.add('c');

        Collection<Character> c2 = new ArrayList<>();
        c2.addAll(c);

        // ✅ manually add elements from c1 if not already in c2
        for (Character ch : c1) {
            if (!c2.contains(ch)) { // using contains()
                c2.add(ch);
            }
        }

        // 🧩 check using containsAll() and removeAll()
        System.out.println("c2 contains all of c1? " + c2.containsAll(c1));
        System.out.println("c2 before removeAll: " + c2);

        // this won't remove anything because c2 contains c1 elements
        c2.removeAll(c1); // remove elements present in c1
        System.out.println("c2 after removeAll(c1): " + c2);

        // reconstruct duplicates-removed version again
        c2.clear();
        c2.addAll(c);
        for (Character ch : c1) {
            if (!c2.contains(ch)) { // avoid duplicates
                c2.add(ch);
            }
        }

        System.out.println("\n✅ Final collection without duplicates: " + c2);
    }
}
