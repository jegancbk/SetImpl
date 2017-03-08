package com.practice.tdd;

import java.util.Arrays;

/**
 * Created by jegan_2 on 2/7/2017.
 */
public class Set3 {

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
        int i = 0;
        do {
            largerStorage[i] = storage[i];
            i++;
        }while (i < size);

        /*Object[] largerStorage = new Object[storage.length * 2];
        System.arraycopy(storage, 0, largerStorage, 0, size);*/
        storage = largerStorage;
    }

    public int size() {
        return size;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public void remove(Object value) {

        if (!contains(value)) {
            return;
        }

        Object[] newStorage = new Object[storage.length-1];

        int i = 0;
        int j = 0;

        do {

            if (!value.equals(storage[j])) {
                newStorage[i] = storage[j];
                i++;
            }

            j++;

        } while (j < size);


        /*int i, j;

        Object[] newStorage = new Object[storage.length-1];

        for (i = j = 0; j < size; j++) {

            if (!value.equals(storage[j])) {
                newStorage[i++] = storage[j];
            }

        }*/
        //storage = Arrays.copyOf(storage, i);
        storage = newStorage;

        size--;

        /*int index = indexOf(value);
        if (index != -1) {

            *//*List<Object> tempList = new ArrayList<Object>(Arrays.asList(storage));
            tempList.remove(value);
            storage = tempList.toArray();*//*

            Object[] storageCopy = new Object[storage.length-1];
            System.arraycopy(storage, 0, storageCopy, 0, index);
            System.arraycopy(storage, index+1, storageCopy, index, storage.length-index-1);

            storage = storageCopy;

           // System.arraycopy(storage, index + 1, storage, index, storage.length - 1 - index);
            *//*storage[index] = storage[size - 1];
            storage[size - 1] = null;*//*

            *//*storage[index] = storage[0];
            storage[0] = null;*//*

            size--;
        }*/
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


    public Set3 intersect(Set3 manySet) {

        Set3 intersectedSet = new Set3();

        for (int index = 0; index < size(); index++) {
            if (manySet.contains(storage[index])) {
                intersectedSet.add(storage[index]);
            }
        }
        return intersectedSet;
    }

    public Set3 union(Set3 manySet) {

        for (int index = 0; index < size(); index++) {
            //unionSet.addLast()
            manySet.add(storage[index]);
        }

        return manySet;
    }
}
