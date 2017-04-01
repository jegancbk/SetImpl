package com.practice.tdd;

import com.sun.deploy.util.ArrayUtil;

/**
 * Created by jegan on 3/24/17.
 */
public class AllLongestStrings {


    public static void main(String[] args) {
        String[] inputArray = {"aba", "aa", "ad", "vcd", "aba"};
        System.out.print(ArrayUtil.arrayToString(allLongestStrings(inputArray)));
    }


    static String[] allLongestStrings(String[] inputArray) {

        String[] opArray = null;

        int length = 0;
        int index = 0;
        for (int i = 0 ; i < inputArray.length; i++) {

            if (inputArray[i].length() > length) {
                opArray = new String[inputArray.length];
                index = 0;
                opArray[index] = inputArray[i];
                length = inputArray[i].length();
            } else if (inputArray[i].length() == length) {
                index+=1;
                opArray[index] = inputArray[i];
            } else {
                continue;
            }


        }

        return opArray;


    }

}
