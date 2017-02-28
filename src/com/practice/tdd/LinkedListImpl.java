package com.practice.tdd;

/**
 * Created by jegan on 2/24/17.
 */
public class LinkedListImpl<T> {

    private int size = 0;
    private Node<T> head = null;
    public boolean isEmpty() {
        return size == 0;
    }

    public void addLast(T value) {
        size++;

        Node node = new Node(value);

        if (head == null) {
            head = node;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;

    }

    public int size() {
        return size;
    }

    public boolean contains(T value) {

        return indexOf(value) > -1;

    }

    public int indexOf(T value) {
        Node current = head;

        for (int i = 0; i < size; i++) {
            if (current.value == value) {
                return i;
            } else {
                current = current.next;
            }
        }

        return -1;
    }

    public void remove(T value) {


        if ( head == null ) {
            return;
        }

        if ( head.value == value ) {
            head = head.next;
            return;
        }

        Node current = head;

        while (current.next != null) {

            if (current.next.value == value) {
                current.next = current.next.next;
                size--;
                return;
            }

            current = current.next;
        }


    }

    public void addFirst(T value) {
        size++;
        Node node = new Node(value);
        node.next = head;
        head = node;

    }

    public T getFirst() {
        return head.value;
    }

    public T getLast() {

        return (T) recursiveGetLast(head).value;
    }

    public Node recursiveGetLast(Node current) {

        if (current.next == null) {
            return current;
        } else {
            return recursiveGetLast(current.next);
        }

    }

    public int lastIndexOf(T value) {

        Node current = head;

        int index = -1;

        for (int i = 0; i < size; i++) {
            if (current.value == value) {
                index = i;
                current = current.next;
            } else {
                current = current.next;
            }
        }

        return index;
    }

    public void add(T value, int index) {

        if (index > size) {
            return;
        }

        if (index == 0) {
            addFirst(value);
            return;
        }

        if (index == size) {
            addLast(value);
            return;
        }


        Node node = new Node(value);

        if (head == null) {
            head = node;
            return;
        }
        int i = 0;
        Node current = head;
        while (current.next != null) {

            if (i == index-1) {
                Node temp = current.next;
                current.next = node;
                current.next.next = temp;
                size++;
                return;
            } else {
                current = current.next;
                i++;
            }
        }


    }

    private static class Node<T> {
        Node next;
        T value;
        public Node(T value) {
            this.value = value;
        }
    }
}
