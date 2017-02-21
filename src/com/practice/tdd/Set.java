package com.practice.tdd;

import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jegan_2 on 2/7/2017.
 */
public class Set {

    int size = 0;
    Object[] storage = new Object[10];

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(Object obj) {
        if (!contains(obj)) {
            if (storage.length == size) {
                grow();
            }
            storage[size++] = obj;
        }
    }

    public void grow() {
        //storage = Arrays.copyOf(storage, storage.length * 2);
        Object[] largerStorage = new Object[storage.length * 2];
        System.arraycopy(storage, 0, largerStorage, 0, size);
        storage = largerStorage;
    }

    public int size() {
        return size;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public void remove(Object value) {


        int index = indexOf(value);
        if (index != -1) {

            /*List<Object> tempList = new ArrayList<Object>(Arrays.asList(storage));
            tempList.remove(value);
            storage = tempList.toArray();*/

            System.arraycopy(storage, index + 1, storage, index, storage.length - 1 - index);
            /*storage[index] = storage[size - 1];
            storage[size - 1] = null;*/
            size--;
        }
    }

    public int indexOf(Object value) {
        int index = 0;
        for (Object currentObj:storage) {
            if(value.equals(currentObj)) {
                return index;
            }
            index++;
        }
        return  -1;
    }


    public Set intersect(Set manySet) {

        Set intersectedSet = new Set();

        for (int index = 0; index < size(); index++) {
            if (manySet.contains(storage[index])) {
                intersectedSet.add(storage[index]);
            }
        }
        return intersectedSet;
    }

    public Set union(Set manySet) {

        for (int index = 0; index < size(); index++) {
            //unionSet.add()
            manySet.add(storage[index]);
        }

        return manySet;
    }
}
