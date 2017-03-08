package com.practice.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by jegan_2 on 2/7/2017.
 */
public class TestSet {


    @Test
    public void testIsEmpty() {

        Set set = new Set();

        assertTrue(set.isEmpty());

        Set manySet = new Set();
        manySet.add(1);

        assertFalse(manySet.isEmpty());


    }


    @Test
    public void testContains() {
        Set manySet = new Set();

        manySet.add(1);
        manySet.add(2);

        assertEquals(true, manySet.contains(2));
        assertEquals(false, manySet.contains(3));
    }

    @Test
    public void testSize() {
        Set manySet = new Set();

        manySet.add(1);
        manySet.add(2);
        manySet.add(3);

        assertEquals(3, manySet.size());
    }

    @Test
    public void testAdd() {
        Set manySet = new Set();

        manySet.add(1);
        manySet.add(2);
        manySet.add(3);

        assertEquals(3, manySet.size());
        assertEquals(true, manySet.contains(2));
    }

    @Test
    public void testDynamicSet() {
        Set manySet = new Set();

        manySet.add(1);
        manySet.add(2);
        manySet.add(3);
        manySet.add(4);
        manySet.add(5);
        manySet.add(6);
        manySet.add(7);
        manySet.add(8);

        assertEquals(8, manySet.size());


    }

    @Test
    public void testUniqueness() {

        Set manySet = new Set();

        manySet.add(1);
        manySet.add(2);
        manySet.add(3);
        manySet.add(2);
        manySet.add(5);
        manySet.add(6);
        manySet.add(5);
        manySet.add(8);

        assertEquals(6, manySet.size());

    }


    @Test
    public void testRemove() {

        Set manySet = new Set();

        manySet.add(1);
        manySet.add(2);
        manySet.add(3);
        manySet.add(4);
        manySet.add(5);
        manySet.add(6);
        manySet.add(7);
        manySet.add(8);

        assertEquals(8, manySet.size());

        manySet.remove(5);

        assertEquals(7, manySet.size());
        assertEquals(false, manySet.contains(5));
        assertEquals(true, manySet.contains(7));


    }


    @Test
    public void testIntersection() {
        Set firstSet = new Set();

        firstSet.add(1);
        firstSet.add(2);
        firstSet.add(3);
        firstSet.add(4);
        firstSet.add(5);
        firstSet.add(6);
        firstSet.add(7);
        firstSet.add(8);

        Set secondSet = new Set();

        secondSet.add(3);
        secondSet.add(9);
        secondSet.add(12);
        secondSet.add(1);
        secondSet.add(45);
        secondSet.add(3);
        secondSet.add(13);
        secondSet.add(25);

        Set resultSet = firstSet.intersect(secondSet);

        assertEquals(2, resultSet.size());
        assertEquals(true, resultSet.contains(3));

    }

    @Test
    public void testUnion() {

        Set firstSet = new Set();

        firstSet.add(1);
        firstSet.add(2);
        firstSet.add(3);
        firstSet.add(4);
        firstSet.add(5);
        firstSet.add(6);
        firstSet.add(7);
        firstSet.add(8);

        Set secondSet = new Set();

        secondSet.add(3);
        secondSet.add(9);
        secondSet.add(12);
        secondSet.add(1);
        secondSet.add(45);
        secondSet.add(3);
        secondSet.add(13);
        secondSet.add(25);

        Set resultSet = firstSet.union(secondSet);

        assertEquals(13, resultSet.size());

    }

}
