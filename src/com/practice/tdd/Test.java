package com.practice.tdd;

import sun.security.provider.SHA;

/**
 * Created by jegan on 3/31/17.
 */
public class Test {

    public static void main(String[] args) {
        //Snippet 1
        /*try {
            char[] array = {'T', 'E', 'S', 'T'};
            int index = array.length;

            while (index > 0) {
                System.out.println(array.toString());
            }
        } catch (Exception e) {
            System.out.println(e.getClass().toString());
        } finally {
            System.out.println("Finally");
        }*/

        //Snippet 2
       /* StringBuffer message = new StringBuffer("Hello World");
        StringBuffer result = modifyStringBuffer(message);

        if (message == result) {
            System.out.println("1 = " + result);

        }

        if (message.equals(result)) {
            System.out.println("2 = " + result);
        }*/


       //Snippet 3
        /*Shape shape = new Circle();
        System.out.println(shape);

        Shape newShape = new Triange();
        System.out.println(newShape);*/


        //Snippet 4
        Color color = Color.valueOf(args[0]);

        if (color.isGreyScale()) {
            System.out.println("Grey scale color - " + color);

        } else if (!color.isTransparent()) {
            System.out.println("Not Transparent - " + color);
        } else {
            System.out.println("Can not print - " + color);
        }


        //Snippet 5

        System.out.println(finallyMethod());


    }

    public enum Color {
        RED,
        GREEN,
        BLUE,
        BLACK,
        WHITE,
        GREY,
        TRANSPARENT;

        public boolean isTransparent() {
            return this == TRANSPARENT;
        }

        public boolean isGreyScale() {
            return this == BLACK || this == WHITE || this == GREY;
        }
    }

    private static StringBuffer modifyStringBuffer(StringBuffer message) {

        return message.reverse();
    }


    private static abstract class Shape {
        public String toString() {
            return "I am a shape";
        }
    }

    private static abstract class Circle extends Shape{
        public String toString() {
            return "I am a circle";
        }
    }

    private static class Triange extends Shape {}

    private static int finallyMethod() {

        try {
            System.out.println("try");
            return 10;
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.print("finally");
            return 88;
        }
    }
}
