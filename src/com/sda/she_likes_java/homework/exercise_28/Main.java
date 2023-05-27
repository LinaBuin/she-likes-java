package com.sda.she_likes_java.homework.exercise_28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<SurnamesList> surnames = new ArrayList<>();
        surnames.add(new SurnamesList("Kazlauskas", "Lukauskas"));



        Collections.sort(surnames,
                new SortingBySurnamesLength());
        System.out.println("sorted by surnames length: " + surnames);

    }
}
