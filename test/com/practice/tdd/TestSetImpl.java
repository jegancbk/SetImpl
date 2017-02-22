package com.practice.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by jegan_2 on 2/21/2017.
 */
public class TestSetImpl {


    SetImpl manySet = null;
    SetImpl emptySet = null;

    @BeforeEach
    public void setup() {

        emptySet = new SetImpl();
        manySet = new SetImpl();
    }

    @Test
    public void testIsEmpty() {

        Assertions.assertTrue(new SetImpl().isEmpty());

        manySet.add("1");
        manySet.add("2");

        Assertions.assertFalse(manySet.isEmpty());

    }

    @Test
    public void testSize() {


        Assertions.assertEquals(0,emptySet.size());


        manySet.add("1");
        manySet.add("2");
        manySet.add("3");
        Assertions.assertEquals(3, manySet.size());

    }

    @Test
    public void testContains() {


        manySet.add("1");
        manySet.add("2");
        manySet.add("3");

        Assertions.assertTrue(manySet.contains("2"));
        Assertions.assertFalse(manySet.contains(4));
    }

    @Test
    public void testDuplicates() {
        manySet.add("1");
        manySet.add("2");
        manySet.add("3");
        manySet.add("2");

        Assertions.assertEquals(3, manySet.size());
    }

    @Test
    public void testDynamicSet() {
        manySet.add("1");
        manySet.add("2");
        manySet.add("3");
        manySet.add("4");
        manySet.add("5");
        manySet.add("6");

        Assertions.assertEquals(6, manySet.size());
        Assertions.assertEquals(true, manySet.contains("6"));

    }

    @Test
    public void testRemove() {
        manySet.add("1");
        manySet.add("2");
        manySet.add("3");
        manySet.add("4");
        manySet.add("5");
        manySet.add("6");

        Assertions.assertEquals(6, manySet.size());
        Assertions.assertEquals(true, manySet.contains("6"));

        manySet.remove("4");
        Assertions.assertEquals(5, manySet.size());
        Assertions.assertEquals(false, manySet.contains("4"));

        Assertions.assertEquals(true, manySet.contains("2"));

    }

    @Test
    public void testUnion() {

        manySet.add("1");
        manySet.add("2");
        manySet.add("3");
        manySet.add("4");
        manySet.add("5");
        manySet.add("6");

        SetImpl anotherSet = new SetImpl();
        anotherSet.add("7");
        anotherSet.add("2");
        anotherSet.add("5");
        anotherSet.add("9");

        SetImpl result = manySet.union(anotherSet);
        Assertions.assertEquals(8, result.size());

    }

    @Test
    public void testIntersection() {
        manySet.add("1");
        manySet.add("2");
        manySet.add("3");
        manySet.add("4");
        manySet.add("5");
        manySet.add("6");

        SetImpl anotherSet = new SetImpl();
        anotherSet.add("7");
        anotherSet.add("2");
        anotherSet.add("5");
        anotherSet.add("9");

        SetImpl resultSet = manySet.intersection(anotherSet);

        Assertions.assertEquals(2, resultSet.size());
        Assertions.assertEquals(true, resultSet.contains("5"));
    }
}
