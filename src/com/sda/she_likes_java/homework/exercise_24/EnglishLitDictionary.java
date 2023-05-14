package com.sda.she_likes_java.homework.exercise_24;

import java.util.HashMap;
import java.util.Map;

public class EnglishLitDictionary {

    private final Map<String, String> dictionary;

    public EnglishLitDictionary(){

        dictionary = new HashMap<>();
        dictionary.put("house", "namas");
        dictionary.put("pet", "augintinis");
        dictionary.put("noise", "triukšmas");


    }

    public void translate(String englishWord) {

        String litTranslation = dictionary.get(englishWord);
        if (litTranslation != null) {
            System.out.println("English word: [%s] means [%s] in Polish".formatted(englishWord, litTranslation));
            //line below returns all words in one line
           // System.out.printf("English word means in Lit: [%s] means [%s]", englishWord, dictionary);
        } else {
            System.out.printf("I dont know how to translate [%s]",englishWord);
        }



    }

}

