package com.sda.she_likes_java.homework.exercise_25;

import com.sda.she_likes_java.collections.lists.WordsBilingual;

import java.util.HashMap;
import java.util.Map;

public class CitiesCountries {

    private final Map<String, String> europeCitiesCountries;

    public CitiesCountries (){

        europeCitiesCountries = new HashMap<>();
        europeCitiesCountries.put("Bratislava", "Slovakia");
        europeCitiesCountries.put("Zagreb", "Croatia");
        europeCitiesCountries.put("Ljubljana", "Slovenia");
        europeCitiesCountries.put("Dublin", "Ireland");
        europeCitiesCountries.put("London", "UK");

    }


        public void match(String city) {

            String countryMatch = europeCitiesCountries.get(city);
            if (countryMatch != null) {
                System.out.println("City [%s] is in [%s]".formatted(city, countryMatch));
            } else {
                System.out.printf("I dont know where is [%s]",city);
            }

        }
    //public void matchCityToCountry(String countryMatch);
    //for (WordsBilingual currentWordsPair : ) {

    }

