package com.practice.tdd;

import org.junit.jupiter.api.*;

/**
 * Created by jegan_2 on 2/7/2017.
 */
public class TestSet {

    private Set set;
    private Set oneSet;
    private Set manySet;
    private Set grownSet;

    @BeforeEach
    public void setup() {

        set = new Set();

        oneSet = new Set();
        oneSet.add(1);

        manySet = new Set();
        manySet.add(1);
        manySet.add(2);

        grownSet = new Set();

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

        Assertions.assertEquals(false, grownSet.contains(5));
        Assertions.assertEquals(true, grownSet.contains(6));
        Assertions.assertEquals(10, grownSet.size());
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
        Set resultSet =  grownSet.intersect(manySet);

        Assertions.assertEquals(2, resultSet.size());
    }

    @Test
    public void testUnion() {
        Set newSet = new Set();
        newSet.add(12);
        newSet.add(13);
        Set resultSet = grownSet.union(newSet);

        Assertions.assertEquals(13, resultSet.size());
    }
}
