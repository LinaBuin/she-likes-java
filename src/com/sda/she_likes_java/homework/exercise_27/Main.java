package com.sda.she_likes_java.homework.exercise_27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        MyDate newYear = new MyDate(2022, 1, 1);
        MyDate hisBirthday = new MyDate(1975, 1, 4);
        MyDate myBirthday = new MyDate(1977, 9, 17);
        MyDate daySchool = new MyDate(2023, 9, 1);

        List<MyDate> dates = new ArrayList<>();
        dates.add(newYear);
        dates.add(hisBirthday);
        dates.add(myBirthday);
        dates.add(daySchool);

        Collections.sort(dates,
                new comparingByDates());
        System.out.println("after sorting by years: " + dates);



    }
}
