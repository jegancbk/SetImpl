package com.practice.tdd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jegan on 2/24/17.
 */
public class LinkedListImplTest {

    @Test
    public void testIsEmpty() {
        LinkedListImpl linkedList = new LinkedListImpl();
        assertTrue(linkedList.isEmpty());
        linkedList.addLast(1);
        assertFalse(linkedList.isEmpty());
    }

    @Test
    public void testAddLast() {

        LinkedListImpl linkedList = new LinkedListImpl();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        assertEquals(3, linkedList.size());
        assertEquals(true, linkedList.contains(3));

    }

    @Test
    public void testContains() {
        LinkedListImpl linkedList = new LinkedListImpl();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);

        assertEquals(true, linkedList.contains(2));
    }


    @Test
    public void testRemove() {
        LinkedListImpl linkedList = new LinkedListImpl();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);

        linkedList.remove(2);
        linkedList.remove(5);
        linkedList.remove(3);

        assertEquals(false, linkedList.contains(2));
        assertEquals(false, linkedList.contains(3));
        assertEquals(1, linkedList.size());
    }


    @Test
    public void testIndexOf() {
        LinkedListImpl linkedList = new LinkedListImpl();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);

        assertEquals(1, linkedList.indexOf(2));

    }

    @Test
    public void testAddFirst() {
        LinkedListImpl linkedList = new LinkedListImpl();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);

        linkedList.addFirst(5);
        assertEquals(0, linkedList.indexOf(5));
    }

    @Test
    public void testGetFirst() {
        LinkedListImpl linkedList = new LinkedListImpl();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);

        assertEquals(1, linkedList.getFirst());
    }

    @Test
    public void testGetLast() {
        LinkedListImpl linkedList = new LinkedListImpl();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);

        assertEquals(3, linkedList.getLast());
    }

    @Test
    public void testLastIndexOf() {
        LinkedListImpl linkedList = new LinkedListImpl();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(2);
        linkedList.addLast(6);

        assertEquals(3, linkedList.lastIndexOf(2));
    }

    @Test
    public void testAdd() {
        LinkedListImpl linkedList = new LinkedListImpl();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addFirst(2);
        linkedList.addLast(6);
        linkedList.add(7, 0);

        assertEquals(0, linkedList.indexOf(7));
        assertEquals(6, linkedList.size());

        linkedList.add( 8, 3);
        assertEquals(3, linkedList.indexOf(8));

        linkedList.add(9, 7);
        assertEquals(7, linkedList.indexOf(9));


    }

}