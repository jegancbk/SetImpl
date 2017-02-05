package com.practice.tdd;

import java.util.HashMap;

/**
 * Created by jegan_2 on 2/5/2017.
 */
public class HashSetImpl<E> {

    private transient HashMap<E,Object> map;

    private static final Object PRESENT = new Object();

    public HashSetImpl() {
        map = new HashMap<E, Object>();
    }

    public boolean add(E value) {
        return map.put(value, PRESENT)==null;
    }

    public int size() {
        return map.size();
    }

    public boolean contains(E value) {

        return map.containsKey(value);
    }

    public boolean remove(Object value) {
        return map.remove(value) == PRESENT;
    }

    public void clear() {
        map.clear();
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }

}
