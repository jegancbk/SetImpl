package com.practice.tdd;

import static org.junit.Assert.*;

import org.junit.Test;


public class HashTableTest {

    @Test
    public void testIsEmpty() {
        HashTable emptyTable = new HashTable();
        assertTrue(emptyTable.isEmpty());
        HashTable nonEmptyTable = new HashTable();
        nonEmptyTable.put(1, "one");
        assertFalse(nonEmptyTable.isEmpty());
    }

    @Test
    public void testSize() {
        HashTable emptyTable = new HashTable();
        assertEquals(0, emptyTable.size());
        HashTable nonEmptyTable = new HashTable();
        nonEmptyTable.put(1, "one");
        assertEquals(1, nonEmptyTable.size());
    }

    @Test
    public void testDelete() {
        HashTable nonEmptyTable = new HashTable();
        nonEmptyTable.put("1", "one");
        nonEmptyTable.remove("1");
        assertEquals(0, nonEmptyTable.size());
    }

    @Test
    public void testGet() {
        HashTable nonEmptyTable = new HashTable();
        nonEmptyTable.put("1", "one");
        assertEquals("one", nonEmptyTable.get("1"));
    }

    @Test
    public void testContainsKey() {
        HashTable nonEmptyTable = new HashTable();
        nonEmptyTable.put("1", "one");
        nonEmptyTable.put("1", "one");
        nonEmptyTable.put("9", "one");
        nonEmptyTable.put("7", "one");
        nonEmptyTable.put("6", "one");
        nonEmptyTable.put("5", "one");
        assertEquals(5, nonEmptyTable.size());

        assertEquals(true, nonEmptyTable.containsKey("1"));
    }

    @Test
    public void testContainsValue() {
        HashTable nonEmptyTable = new HashTable();
        nonEmptyTable.put("1", "one");
        nonEmptyTable.put("2", "two");
        assertTrue(nonEmptyTable.containsValue("one"));
        assertTrue(nonEmptyTable.containsValue("two"));
        assertFalse(nonEmptyTable.containsValue("three"));

    }

    @Test
    public void testClear() {
        HashTable nonEmptyTable = new HashTable();
        nonEmptyTable.put(1, "one");
        nonEmptyTable.clear();
        assertEquals(0, nonEmptyTable.size());
    }


    @Test
    public void testClone() {
        HashTable nonEmptyTable = new HashTable();
        nonEmptyTable.put("1", "one");
        nonEmptyTable.put("2", "two");
        assertEquals(2, nonEmptyTable.size());

        Object temp[] = nonEmptyTable.clone();
        assertEquals(2, temp.length);
    }
}