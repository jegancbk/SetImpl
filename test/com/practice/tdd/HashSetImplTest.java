package com.practice.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jegan_2 on 2/5/2017.
 */
class HashSetImplTest {
    @Test
    public final void whenASingleValueIsAddedThenReturnValueIsTrue() {
        HashSetImpl<Integer> hashSet = new HashSetImpl<Integer>();
        Assertions.assertEquals(true, hashSet.add(2));
    }
    @Test
    public final void whenDuplicateValuesAreAddedThenReturnValueIsFalse() {
        HashSetImpl<Integer> hashSet = new HashSetImpl<Integer>();
        hashSet.add(2);
        Assertions.assertEquals(false, hashSet.add(2));
    }

    @Test
    public final void whenThreeValuesAreAddedThenSizeIsThree() {
        HashSetImpl<Integer> hashSet = new HashSetImpl<Integer>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);

        Assertions.assertEquals(3, hashSet.size());
    }

    @Test
    public final void whenLookingUpAValueThatExistsThenContainsReturnsTrue() {
        HashSetImpl<Integer> hashSet = new HashSetImpl<Integer>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);

        Assertions.assertEquals(true, hashSet.contains(2));
    }

    @Test
    public final void whenLookingUpAValueThatDoesNotExistsThenContainsReturnsFalse() {
        HashSetImpl<Integer> hashSet = new HashSetImpl<Integer>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);

        Assertions.assertEquals(false, hashSet.contains(4));
    }

    @Test
    public final void whenRemovingAValueThenSizeIsReducedByOne() {
        HashSetImpl<Integer> hashSet = new HashSetImpl<Integer>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);

        int currentSize = hashSet.size();

        hashSet.remove(2);

        int newSize = hashSet.size();

        Assertions.assertEquals(currentSize - 1, newSize);
    }

    @Test
    public final void whenRemovingANonExistingValueThenRemvoeReturnsFalse() {
        HashSetImpl<Integer> hashSet = new HashSetImpl<Integer>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);

        Assertions.assertEquals(false, hashSet.remove(5));

    }

    @Test
    public final void whenClearingAHashSetThenSizeIsZero() {
        HashSetImpl<Integer> hashSet = new HashSetImpl<Integer>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);

        hashSet.clear();

        Assertions.assertEquals(0, hashSet.size());
    }

    @Test
    public final void whenCallingIsEmptyOnHashSetWithoutValuesThenReturnsTrue() {
        HashSetImpl<Integer> hashSet = new HashSetImpl<Integer>();
        Assertions.assertEquals(true, hashSet.isEmpty());
    }

    @Test
    public final void whenCallingIsEmptyOnHashSetWithValuesThenReturnsFalse() {
        HashSetImpl<Integer> hashSet = new HashSetImpl<Integer>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);

        Assertions.assertEquals(false, hashSet.isEmpty());
    }
}