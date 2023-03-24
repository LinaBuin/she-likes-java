package com.sda.she_likes_java.homework;

public class Exercise13 {
    public static void main(String[] args) {

        int[] myElements = new int[100];

        // initialization phase
        // first index is: 0
        // last index is: numbers.length - 1


        for (int i = 0; i < myElements.length; i++) {
            System.out.println("Current value i is: " + i);
            myElements [i] = 3 * i;
            // numbers[i -1]
        }
            // read data
        for (int i = myElements.length - 1; i > -1; i--) {
            System.out.println("my element" + i + " = " + myElements [i]);

        }


    }

}
