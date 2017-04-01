package com.practice.tdd;

/**
 * Created by jegan on 2/23/17.
 */
public class Sorter {


    public static int[] bubbleSort(int[] inputArray) {

        for (int j = 0; j < inputArray.length; j++) {
            for (int i = 0; i < inputArray.length - 1; i++) {
                if (inputArray[i] > inputArray[i + 1]) {
                    int temp = inputArray[i + 1];
                    inputArray[i + 1] = inputArray[i];
                    inputArray[i] = temp;
                }
            }
        }

        return inputArray;
    }

    public static int[] insertionSort(int[] inputArray) {

        for (int i = 1; i < inputArray.length; i++) {
            for (int j = i; j > 0; j--) {
                System.out.println("I ==> " + inputArray[i] + "\t" + "J ==> " + inputArray[j]);
                if (inputArray[j] < inputArray[j-1]) {
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j-1];
                    inputArray[j-1] = temp;
                }

            }
        }

        return inputArray;
    }

    public static void main(String[] args) {
        int[] inputArray = new int[]{6, 2, 3, 8};
        System.out.println("input array");
        printArray(inputArray);
        System.out.println("bubble sort output");
        //printArray(bubbleSort(inputArray));
        System.out.println("insertion sort output");
        printArray(insertionSort(inputArray));
    }

    public static void printArray(int[] inputArray) {
        for (int i = 0; i <= inputArray.length - 1; i++) {
            System.out.print(inputArray[i] + "\t");
        }
        System.out.println();
    }


    boolean almostIncreasingSequence(int[] sequence) {

        Integer[] anomalyArray = new Integer[sequence.length];

        for (int i = 1; i < sequence.length-1; i++) {
            boolean left = sequence[i-1] <= sequence[i];
            boolean right = sequence[i] <= sequence[i+1];
            if (left && right) {
                continue;
            } else {

                if (!left) {
                    if (anomalyArray[i-1] != null) {
                        return false;
                    }
                    anomalyArray[i-1] = sequence[i-1];
                } else if (!right) {
                    if (anomalyArray[i] != null) {

                        return false;
                    }
                    anomalyArray[i] = sequence[i];
                } else {
                    return false;
                }

                return false;
                //anomalyArray[i] = sequence[i];
            }

        }


        return true;
    }


}
