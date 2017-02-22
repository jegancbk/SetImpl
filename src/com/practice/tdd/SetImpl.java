package com.practice.tdd;

/**
 * Created by jegan_2 on 2/21/2017.
 */
public class SetImpl {

    private int counter = 0;

    private Object[] container = new Object[6];

    public boolean isEmpty() {
        return counter == 0;
    }

    public void add(Object element) {

        if (contains(element)) {
            return;
        }
        if (container.length == counter) {
            growContainer();
        }
        container[counter] = element;
        counter++;

    }

    private void growContainer() {
        Object[] largeContainer = new Object[container.length * 2];
        System.arraycopy(container, 0, largeContainer, 0, counter);
        container = largeContainer;
    }

    public int size() {
        return  counter;
    }

    public boolean contains(Object data) {
        return indexOf(data) > -1;
    }

    private int indexOf(Object data) {
        for (int i =0; i < counter; i++) {
            if (container[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public void remove(Object s) {

        int position = indexOf(s);
        if (position > -1) {
            container[position] = container[container.length - 1];
            counter--;
        }

    }

    public SetImpl union(SetImpl anotherSet) {

        for (int i = 0; i < counter; i++) {
            anotherSet.add(container[i]);
        }

        return anotherSet;
    }

    public SetImpl intersection(SetImpl anotherSet) {

        SetImpl result = new SetImpl();
        for (int i = 0; i < counter; i++) {
            if(anotherSet.contains(container[i])) {
               result.add(container[i]);
            }
        }

        return  result;
    }
}
