package com.sda.she_likes_java.homework.exercise_28;


import java.util.Comparator;

public class SurnamesList implements Comparator<SurnamesList> {
    private final String surname1;
    private final String surname2;

    public SurnamesList(String surname1, String surname2) {
        this.surname1 = surname1;
        this.surname2 = surname2;
    }


    public String getSurname1() {
        return surname1;
    }

    public String getSurname2() {
        return surname2;
    }

    @Override
    public int compare(SurnamesList o1, SurnamesList o2) {
        return 0;
    }
}

