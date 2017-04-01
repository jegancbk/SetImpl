package com.practice.tdd;

/**
 * Created by jegan_2 on 2/7/2017.
 */
public class Set {


    private int counter = 0;

    private Object[] objPool = new Object[5];

    public boolean isEmpty() {
        
        return (counter == 0);
    }

    public void add(Object i) {

        if (contains(i)){
            return;
        }

        int nullIndex = indexOf(null);

        if (nullIndex != -1) {
            objPool[nullIndex] = i;
            counter++;
            return;
        }

        if (objPool.length == counter) {
            increaseArraySize();
        }
        objPool[counter] = i;
        counter++;

    }

    private void increaseArraySize() {
        Object[] bigObjectPool = new Object[objPool.length * 2];

        int i = 0;
        do {
            bigObjectPool[i] = objPool[i];
            i++;
        } while (i < counter);

        //System.arraycopy(objPool, 0, bigObjectPool, 0, counter);
        objPool = bigObjectPool;
    }

    public boolean contains(Object i) {

        return indexOf(i) > -1;

    }

    public int size() {

        return counter;
    }

    public void remove(Object i) {

        int currentIndex = indexOf(i);


            if (currentIndex > -1) {

                //System.arraycopy(objPool, currentIndex + 1, objPool, currentIndex, objPool.length - 1 - currentIndex);

                objPool[currentIndex] = null;

                counter--;
            }

    }

    private int indexOf(Object data) {

        for (int loop = 0; loop < counter; loop++) {
            if (objPool[loop] != null && objPool[loop].equals(data)) {
                return loop;
            } else if(objPool[loop] == data && data == null) {
                return loop;
            }
        }

        return -1;
    }

    public Set intersect(Set secondSet) {

        Set resultSet = new Set();


        for (int loop = 0; loop < counter; loop++) {

            if (secondSet.contains(objPool[loop])) {
                resultSet.add(objPool[loop]);
            }
        }

        return resultSet;
    }

    public Set union(Set secondSet) {

        for (int loop = 0; loop < counter; loop++) {

            secondSet.add(objPool[loop]);

        }

        return secondSet;
    }
}
