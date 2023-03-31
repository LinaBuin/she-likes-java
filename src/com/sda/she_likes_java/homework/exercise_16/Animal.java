package com.sda.she_likes_java.homework.exercise_16;

public class Animal {

    //class Animal containing the fields
    //first name
    //age
    //breed
    //Use private variables and create get/set methods
    //Create a toString() method for each class.
    //Create a main method and a sample class hierarchy

    public String animalFirstName;
    private int animalAge;
    public String animalBreed;


    public String getAnimalFirstName() {
        return animalFirstName;
    }

    public void setAnimalFirstName(String animalFirstName) {
        this.animalFirstName = animalFirstName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    public String getAnimalBreed() {
        return animalBreed;
    }

    public void setAnimalBreed(String animalBreed) {
        this.animalBreed = animalBreed;
    }
}