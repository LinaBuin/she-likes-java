package com.sda.she_likes_java.homework.exercise_16;

public class Owner {

    //Create a hierarchy of classes:
    //use a separate package: exercise_16
    //new Owner class with private fields
    //First name
    //Surname,
    //Animal

        public String firsName;
        public String surname;
        private String animal;


    public Owner(String firsName, String surname, String animal) {
        this.firsName = firsName;
        this.surname = surname;
        this.animal = animal;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAnimal() {
        return animal;

    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }
}
