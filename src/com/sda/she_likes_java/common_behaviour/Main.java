package com.sda.she_likes_java.common_behaviour;
public class Main {

    public static void main(String[] args) {
        Bird bird = new Bird();
//        bird.fly();

        Animal tiger = new Tiger();
        tiger.go();

        Bird parrot = new Parrot();
        Bird ostrich = new Ostrich();

        Superman superSuperMan = new Superman();
        Flyable superFly = superSuperMan;
        Swimmable superSwim = superSuperMan;
        superSuperMan.fly();
        superSuperMan.swim();

        Flyable superman = new Superman();
        Flyable flyableParrot = new Parrot();

        Swimmable tiger2 = (Swimmable) tiger;
        Swimmable swimmableTiger = new Tiger();

        // Tiger assignment ways
        Tiger newTiger = new Tiger();
        newTiger.go();
        newTiger.swim();
        Animal animalTiger = new Tiger();
        animalTiger.go();
        Swimmable swimmableTiger2 = new Tiger();
        swimmableTiger2.swim();
        Object objectTiger = new Tiger();
        // cannot call go() and swim() - thery are not visible here

        }
    }