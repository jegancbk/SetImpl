package com.practice.tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * Created by jegan_2 on 2/7/2017.
 */
public class TestSet3 {

    private Set3 set;
    private Set3 oneSet;
    private Set3 manySet;
    private Set3 grownSet;

    @BeforeEach
    public void setup() {

        set = new Set3();

        oneSet = new Set3();
        oneSet.add(1);

        manySet = new Set3();
        manySet.add(1);
        manySet.add(2);

        grownSet = new Set3();

        grownSet.add(1);
        grownSet.add(2);
        grownSet.add(3);
        grownSet.add(3);
        grownSet.add(4);
        grownSet.add(5);
        grownSet.add(6);
        grownSet.add(7);
        grownSet.add(8);
        grownSet.add(9);
        grownSet.add(10);
        grownSet.add(11);

    }

    @Test
    public void testIsEmpty() {

        Assertions.assertEquals(true, set.isEmpty());
        Assertions.assertEquals(false, oneSet.isEmpty());
        Assertions.assertEquals(false, manySet.isEmpty());
    }

    @Test
    public void testAdd() {

        Assertions.assertEquals(0, set.size());
        Assertions.assertEquals(1, oneSet.size());
        Assertions.assertEquals(2, manySet.size());
    }

    @Test
    public void testContains() {
        Assertions.assertEquals(true, manySet.contains(1));
        Assertions.assertEquals(true, oneSet.contains(1));
        Assertions.assertEquals(false, set.contains(2));
    }

    @Test
    public void testGrow() {

        Assertions.assertEquals(11, grownSet.size());
    }

    @Test
    public void testRemove() {
        Assertions.assertEquals(true, grownSet.contains(5));
        grownSet.remove(5);
        grownSet.remove(11);
        grownSet.remove(1);

        Assertions.assertEquals(false, grownSet.contains(5));
        Assertions.assertEquals(false, grownSet.contains(11));
        Assertions.assertEquals(false, grownSet.contains(1));
        Assertions.assertEquals(true, grownSet.contains(6));
        Assertions.assertEquals(8, grownSet.size());
    }

    @AfterEach
    public void teardown() {
        set = null;
        oneSet = null;
        manySet = null;
        grownSet = null;

    }

    @Test
    public void testIntersection() {
        Set3 resultSet =  grownSet.intersect(manySet);

        Assertions.assertEquals(2, resultSet.size());
    }

    @Test
    public void testUnion() {
        Set3 newSet = new Set3();
        newSet.add(12);
        newSet.add(13);
        Set3 resultSet = grownSet.union(newSet);

        Assertions.assertEquals(13, resultSet.size());
    }
}
