package com.practice.tdd;

/**
 * Created by jegan_2 on 2/15/2017.
 */
public class Set2 {


    private int size = 0;

    private Object[] elementsContainer = new Object[5];

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(Object element) {

        if (!contains(element)) {
            if (elementsContainer.length == size) {
                growContainer();
            }
            elementsContainer[size] = element;
            size++;
        }
    }

    private void growContainer() {
        Object[] largeContainer = new Object[elementsContainer.length * 2];
        System.arraycopy(elementsContainer, 0, largeContainer, 0, size);
        elementsContainer = largeContainer;
    }

    public int size() {
        return size;
    }

    public boolean contains(Object element) {
        return indexOf(element) > -1;
    }

    private int indexOf(Object element) {
        for (int index = 0; index < size; index++) {
            Object currentElement = elementsContainer[index];
            if ( element == currentElement) {
                return index;
            }
        }
        return -1;
    }

    public void remove(Object value) {

        Object[] newContainer = new Object[elementsContainer.length];

        for (int index = 0; index < size; index++) {
            newContainer[index] = elementsContainer[index];
            if (elementsContainer[index].equals(value)) {
                for (int index2 = index; index2 < size-1; index2++) {
                    newContainer[index2] = elementsContainer[index2+1];
                }
                size--;
                break;
            }
        }
        elementsContainer = newContainer;

/*
        if (contains(value)) {
            int elementIndex = indexOf(value);
            elementsContainer[elementIndex] = elementsContainer[size - 1];
            elementsContainer[size - 1] = null;
            size--;
        }*/
    }
}
