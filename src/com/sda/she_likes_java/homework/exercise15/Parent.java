package com.sda.she_likes_java.homework.exercise15;

public class Parent {

    String name;
    String surname;

    Address address;
    Person firstChild;
    Person secondChild;

    public static void main(String[] args) {
        Parent mum = new Parent();
        mum.name = "L";
        Parent dad = new Parent();
        dad.name = "LL";

        Person myFirstChild = new Person();
        myFirstChild.name = "G";

        Person mySecondChild = new Person();
        mySecondChild.name = "B";

        Address home = new Address();
        home.country = "LT";
        home.city = "VNO";

        System.out.println("Adress is: %s, %s".formatted(home.country, home.city));
        System.out.println("Parents names are:  %s, %s".formatted(mum.name, dad.name));
        System.out.println("Children names are:  %s, %s".formatted(myFirstChild.name, mySecondChild.name));



    }



}
