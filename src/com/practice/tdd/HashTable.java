package com.practice.tdd;

public class HashTable implements HashTableInterface {

    HashTableBean hashtableBean[] = new HashTableBean[5];
    int position = 0;

    @Override
    public HashTableBean[] clone() {
        HashTableBean hashtableBeanClone[] = new HashTableBean[position];
        System.arraycopy(hashtableBean, 0, hashtableBeanClone, 0, position);
        hashtableBean = hashtableBeanClone;
        return hashtableBean;

    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        hashtableBean = null;

        hashtableBean = new HashTableBean[5];
        position = 0;
    }

    private int indexOf(Object key) {
        for (int i = 0; i < position; i++) {
            if (hashtableBean[i].getKey().toString().equals(key)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean containsKey(Object key) {
        return indexOf(key) > -1;
    }

    private int indexValueOf(Object value) {
        for (int i = 0; i < position; i++) {
            if (hashtableBean[i].getValue().toString().equals(value)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean containsValue(Object value) {
        return indexValueOf(value) > -1;
    }

    @Override
    public Object get(Object key) {
        int position = indexOf(key);
        return hashtableBean[position].getValue();

    }

    @Override
    public boolean isEmpty() {
        return position == 0;
    }

    @Override
    public void put(Object key, Object value) {

        if (key == null || value == null)
            return;

        if (!containsKey(key)) {
            if (position == hashtableBean.length) {
                increaseArraySize();
            }

            HashTableBean hb = new HashTableBean(key, value);

            hashtableBean[position] = hb;
            position++;
        }

    }

    private void increaseArraySize() {
        HashTableBean httemp[] = new HashTableBean[position * 2];
        System.arraycopy(hashtableBean, 0, httemp, 0, position);
        hashtableBean = httemp;
    }

    @Override
    public void remove(Object key) {

        int i = indexOf(key);
        if (hashtableBean[i].getKey().toString().equals(key)) {

            hashtableBean[i].setKey(null);
            hashtableBean[i] = null;
            position--;
        }
    }

    @Override
    public int size() {

        // TODO Auto-generated method stub
        return position;
    }

}
