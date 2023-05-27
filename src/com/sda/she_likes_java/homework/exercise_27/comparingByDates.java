package com.sda.she_likes_java.homework.exercise_27;

import java.util.Comparator;

public class comparingByDates implements Comparator<MyDate> {

    public int compare(MyDate o1, MyDate o2) {
        return o2.getYear()-o1.getYear();
    }

}
