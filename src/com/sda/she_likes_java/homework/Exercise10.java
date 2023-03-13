package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class Exercise10 {

    public static void main(String[] args) {
        System.out.println("Party time");
        System.out.println("How old are you:");

        Scanner inputReader = new Scanner(System.in);
        String declineMessage = "No pass";

        int age = inputReader.nextInt();
        System.out.println("How well can you sing, from 1 to 5:");
        int singing = inputReader.nextInt();
        System.out.println("What is your hight:");
        double height = inputReader.nextDouble();

        boolean isAllowedToParty =  age >= 18 && singing >= 4 && height >= 1.70;

        if (!isAllowedToParty) {
            System.out.println(declineMessage);
        } else {
            System.out.println("Wellcome");
        }  
    }
}
