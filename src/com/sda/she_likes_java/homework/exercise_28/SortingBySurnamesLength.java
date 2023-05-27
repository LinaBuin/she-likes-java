package com.sda.she_likes_java.homework.exercise_28;

import java.util.Comparator;

public class SortingBySurnamesLength implements Comparator<SurnamesList> {

    @Override
    public int compare(SurnamesList o1, SurnamesList o2) {
        return o2.getSurname1().length() - o1.getSurname2().length();
    }
}
