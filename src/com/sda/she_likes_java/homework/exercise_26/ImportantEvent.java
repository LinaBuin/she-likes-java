package com.sda.she_likes_java.homework.exercise_26;

public enum ImportantEvent {

    PUPPY(6, "run and bite"),

    TEEN(14, "ignore commands"),

    DOG(24, "being smart");
    private int ageMonths;
    private String activity;



    public String getActivity() {
        return activity;
    }

    public int getAgeMonths() {
        return ageMonths;

    }

    public void setActivity(String activity){
        this.activity = activity;

    }

    private ImportantEvent(int ageMonths, String activity) {
            this.ageMonths = ageMonths;
            this.activity = activity;
    }
}

