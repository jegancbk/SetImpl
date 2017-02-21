package com.practice.tdd;

import java.util.*;

/**
 * Created by jegan_2 on 2/14/2017.
 */
public class PrSet {

    public static void main(String[] args) {
        System.out.println("test");

        java.util.Set<Integer> a = new TreeSet<Integer>(Arrays.asList(new Integer[]{0,2,4,5,6,8,10}));
        java.util.Set<Integer> b = new TreeSet<Integer>(Arrays.asList(new Integer[]{5,6,7,8,9,10}));
        System.out.println("inputs");
        System.out.println(a);
        System.out.println(b);

        System.out.println("union");
        //union
        java.util.Set<Integer> c = new TreeSet<Integer>(a);
        c.addAll(b);
        System.out.println(c);

        System.out.println("intersection");
        //intersection
        java.util.Set<Integer> d = new TreeSet<Integer>(a);
        d.retainAll(b);
        System.out.println(d);

        System.out.println("difference");
        //difference
        java.util.Set<Integer> e = new TreeSet<Integer>(a);
        e.removeAll(b);
        System.out.println(e);

        System.out.println("reverse");
        //reverse
        List<Integer> list = new ArrayList<Integer>(a);
        java.util.Collections.reverse(list);
        System.out.println(list);
    }

}
