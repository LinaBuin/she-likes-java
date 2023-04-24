package com.sda.she_likes_java.homework.exercise_17;

import java.util.Random;

public class LendingApp {
    public static void main(String[] args) {

        BooksFields book1 = new BooksFields();
        book1.author = "Tom Hard";
        book1.title = "Read me";
        book1.year = "2001";

        BooksFields book2 = new BooksFields();
        book2.author = "Johny Deep";
        book2.title = "Johny";
        book2.year = "2002";

        BooksFields book3 = new BooksFields();
        book3.author = "Astrid Lindgren";
        book3.title = "Ronja";
        book3.year = "2014";

        System.out.println("Book 1 is : " +book1.title + "," + book1.author + "," + book1.year);
        System.out.println("Book 2 is : " +book2.title + "," + book2.author + "," + book2.year);
        System.out.println("Book 3 is : " +book3.title + "," + book3.author + "," + book3.year);

        Random numberGenerator = new Random();
        int someRandomNumber = numberGenerator.nextInt(10);
        System.out.println("random number is: " +someRandomNumber);
        
        }

}
