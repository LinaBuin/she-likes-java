package com.sda.she_likes_java.homework.exercise_29;

import java.util.Scanner;

public class PostalCodeMain {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your postal code");
            String usersPostalCode = scanner.next();

            postalCodeFormatCheck postalCodeFormatChecker = new postalCodeFormatCheck();
            try {
                postalCodeFormatChecker.postalCodeFormatCheck(usersPostalCode);
            } catch (Exception e) {
                System.out.println(e.getMessage());

        }
    }

    }