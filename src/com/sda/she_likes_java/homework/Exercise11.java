package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class Exercise11 {

    public static void main(String[] args) {
        System.out.println("Checked by old bouncer");

        checkedByOldBouncer();

        System.out.println("*************************");


    }
    public static void checkedByYoungBouncer()  {
        int age;
        int height;
        boolean isAbleTiSingWell;
        Scanner inputReader = new Scanner(System.in);

        System.out.println("How old are You? ");
        age = inputReader.nextInt();
        System.out.println("Can You sing well");
        isAbleTiSingWell = inputReader.nextBoolean();
        System.out.println("How tall are You? ");
        height = inputReader.nextInt();

        boolean checkedByYoungBouncer = age >= 18 && isAbleTiSingWell == true && height > 180;
        if (checkedByYoungBouncer) {
            System.out.println("welcome");

        } else {
            System.out.println("No disco");
        }
    } public static void checkedByOldBouncer() {

        int age;
        int height;
        boolean isAbleToSingWell;
        Scanner inputReader = new Scanner(System.in);

        System.out.println("How old are You? ");
        age = inputReader.nextInt();
        System.out.println("Can You sing well? ");
        isAbleToSingWell = inputReader.nextBoolean();
        System.out.println("How tall are You? ");
        height = inputReader.nextInt();

        boolean checkedByOldBouncer = age >= 18 && height > 180;
        if (checkedByOldBouncer) {
            System.out.println("Welcome");
        } else {
            System.out.println("No disco");
            System.out.println("I'll try with second bouncer");
            System.out.println("Young bouncer is starting to ask questions");
            checkedByYoungBouncer();
        }
    }

}
