package com.practice.tdd;

import com.sun.tools.javac.util.ArrayUtils;

/**
 * Created by jegan on 3/21/17.
 */
public class AlmostIncreasingSequence {

    public static void main(String[] args) {
        int[] sequence = {1, 3, 2, 1};

        System.out.print(almostIncreasingSequence(sequence));
    }

    static boolean almostIncreasingSequence(int[] sequence) {


        for (int i = 0; i < sequence.length - 1; i++) {
            if (sequence[i] >= sequence[i + 1]) {

                if (i > 0 && i < sequence.length - 2 && sequence[i - 1] >= sequence[i + 1]) {

                    for (int j = i + 2; j < sequence.length; j++) {

                        if (j < sequence.length - 1)
                            if (sequence[j] >= sequence[j+1])
                                return false;

                        if (sequence[j] <= sequence[i])
                            return false;
                    }
                } else {
                    for (int j = i + 1; j < sequence.length - 1; j++) {

                        if (i > 0)
                            if (sequence[j] <= sequence[i-1])
                                return false;

                        if (sequence[j] >= sequence[j+1])
                            return false;

                    }
                }
            }
        }
        return true;

    }





}
