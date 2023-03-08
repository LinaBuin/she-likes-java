package com.sda.she_likes_java.homework;

import java.util.Scanner;


public class Calculator {
     // psv shortcut
    public static void main(String[] args) {
        System.out.println("calculator...");
        System.out.println("Calculating sum of two numbers");
        System.out.println("provide first number: ");
        int firstNumber;
        int secondNumber;
        // TODO: explain object creation
        Scanner inputReader = new Scanner(System.in);
        firstNumber = inputReader.nextInt();
        System.out.println("You provided number: " + firstNumber);
        System.out.println("Provide second number: ");
        secondNumber = inputReader.nextInt();
        System.out.println("You provided number: " + secondNumber);
        int sum = firstNumber + secondNumber;
        System.out.println("Sum is: " + sum);
    }
}
