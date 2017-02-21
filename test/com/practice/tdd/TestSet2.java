package com.practice.tdd;

import com.sun.xml.internal.ws.policy.AssertionSet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by jegan_2 on 2/15/2017.
 */
public class TestSet2 {

    private Set2 set;
    private Set2 oneSet;
    private Set2 manySet;

    @BeforeEach
    public void setup() {
        set = new Set2();
        oneSet = new Set2();
        oneSet.add("1");
        manySet = new Set2();
        manySet.add("1");
        manySet.add("2");
        manySet.add("3");
    }

    @Test
    public void testIsEmpty() {

        Assertions.assertEquals(true, set.isEmpty());
        Assertions.assertEquals(false, oneSet.isEmpty());
        Assertions.assertEquals(false, manySet.isEmpty());
    }

    @Test
    public void testAdd() {
        Assertions.assertEquals(1, oneSet.size());
        Assertions.assertEquals(3, manySet.size());
    }

    @Test
    public void testContains() {
        Assertions.assertEquals(true, manySet.contains("2"));
        Assertions.assertEquals(false, manySet.contains("5"));
    }

    @Test
    public void testUniqueness() {
        manySet.add("2");
        Assertions.assertEquals(3, manySet.size());
    }

    @Test
    public void testLargerSets() {
        manySet.add("4");
        manySet.add("5");
        manySet.add("6");

        Assertions.assertEquals(6, manySet.size());
    }

    @Test
    public void testRemove() {
        manySet.remove("2");
        Assertions.assertEquals(false, manySet.contains("2"));
    }

    @Test
    public void testUnion() {

    }

}
