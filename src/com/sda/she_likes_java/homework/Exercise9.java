package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {

        System.out.println("Bouncer In Dicso!!");
        System.out.println("Entrance over 16 years old");
        System.out.println("***************");

        Scanner inputReader = new Scanner(System.in);
        System.out.println("Tell me how old are You");
        int personAge = inputReader.nextInt();
        if (personAge >= 16) {
            System.out.println("Wellcome");
        } else {
            System.out.println("I'm calling your mom");
        }
        System.out.println("Tell me your hight");
        int personHight = inputReader.nextInt();
        if (personHight >= 160) {
            System.out.println("Wellcome");
        } else {
            System.out.println("I'm calling your mom");
        }
    }
}
