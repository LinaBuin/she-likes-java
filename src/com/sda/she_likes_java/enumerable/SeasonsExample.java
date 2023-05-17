package com.sda.she_likes_java.enumerable;

import javax.sound.midi.Soundbank;

public class SeasonsExample {
    public static void main(String[] args) {
        Seasons myFavouriteOne = Seasons.SUMMER;
        System.out.println("Average temp during summer is: "
        + myFavouriteOne.getAverageTemp());

        System.out.println("summers activity: " + myFavouriteOne.getActivity());
        myFavouriteOne.setActivity("running");
        System.out.println("summers activity: " + myFavouriteOne.getActivity());

        Seasons autumn = Seasons.AUTUMN;

        System.out.println("summer: " + myFavouriteOne);
    }
}
