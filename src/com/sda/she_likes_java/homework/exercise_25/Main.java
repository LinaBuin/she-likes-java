package com.sda.she_likes_java.homework.exercise_25;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Let's play geography quiz");

        //System.out.println("Provide city name: ");
        //Scanner inputReader = new Scanner(System.in);
        //String wordFromTheUser = inputReader.next();
        //currentGeography.matchCityToCountry(wordFromTheUser);


        CitiesCountries citiesCountries = new CitiesCountries();
        citiesCountries.match("London");
        citiesCountries.match("Ptuj");

    }
}
