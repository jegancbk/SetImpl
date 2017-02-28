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

                if (inputArray[j] > inputArray[i]) {
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[i];
                    inputArray[i] = temp;
                }

            }
        }

        return inputArray;
    }

    public static void main(String[] args) {
        int[] inputArray = new int[]{10, 3, 4, 2, 11, -1};
        System.out.println("input array");
        printArray(inputArray);
        System.out.println("bubble sort output");
        printArray(bubbleSort(inputArray));
        System.out.println("insertion sort output");
        printArray(insertionSort(inputArray));
    }

    public static void printArray(int[] inputArray) {
        for (int i = 0; i <= inputArray.length - 1; i++) {
            System.out.print(inputArray[i] + "\t");
        }
        System.out.println();
    }

}
