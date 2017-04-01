package com.practice.tdd;

/**
 * Created by jegan on 3/23/17.
 */
public class PhoneCall {

    public static void main(String[] args) {

        System.out.print("phoneCall op " + phoneCall(3, 1, 2, 20));
    }

    //3, 1, 2, 20
    //3, 2, 2, 10
    static int phoneCall(int min1, int min2_10, int min11, int s) {

        if (s < min1) {
            return 0;
        }

        int value1 = s-min1;
        int result = 1;

        if ( value1 > 0) {

            int value2 = value1 - (9 * min2_10);

            if (value2 > 0) {
                result += 9;

                result += value2 / min11;

            } else {
                result = result + (value1 / min2_10);
            }

        }






        return result;
    }

}
