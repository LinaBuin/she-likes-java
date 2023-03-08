package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {
        System.out.println("calculator");
        System.out.println("calculating difference of two numbers");
        System.out.println("provide first number:");
        int firstNumber;
        int secondNumber;

        Scanner inputReader = new Scanner(System.in);
        firstNumber = inputReader.nextInt();
        System.out.println("Provide second number: ");
        secondNumber = inputReader.nextInt();
        int difference = firstNumber - secondNumber;
        System.out.println("Difference is: " + difference);

        System.out.println("calculating sum of two numbers");
        firstNumber = inputReader.nextInt();
        System.out.println("Provide second number: ");
        secondNumber = inputReader.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.println("sum is: " + sum);

        System.out.println("calculating product of two numbers");
        firstNumber = inputReader.nextInt();
        System.out.println("Provide second number: ");
        secondNumber = inputReader.nextInt();
        int product = firstNumber * secondNumber;
        System.out.println("product is: " + product);

        System.out.println("calculating quotient of two numbers");
        firstNumber = inputReader.nextInt();
        System.out.println("Provide second number: ");
        secondNumber = inputReader.nextInt();
        int quotient = firstNumber / secondNumber;
        System.out.println("quotient is: " + quotient);



    }


}
