package com.sda.she_likes_java.homework.exercise_26;

//Create an enumeration class named ImportantEvents.
//The class should contain the following fields:
//- Date of the event
// - Description of the event.
// Create at least 3 instances of the class to symbolise your important events.
//Create the class Main and in it:
//- call the values() method of your class
//- write out the contents of the created array (dates and description)

public class Main {

    public static void main(String[] args) {
        ImportantEvent myFavourite = ImportantEvent.DOG;
        System.out.println("Labrador is puppy : " + myFavourite.getAgeMonths()+ " month");
        System.out.println("Labrador at this age likes to  : " + myFavourite.getActivity());

        ImportantEvent teen  = ImportantEvent.TEEN;
        System.out.println("Labrador is teen : " + teen.getAgeMonths() + " month");
        System.out.println("Dog at this age likes to  : " + teen.getActivity());


        ImportantEvent puppy = ImportantEvent.PUPPY;
        System.out.println("Labrador is dog: " + puppy.getAgeMonths()+ " month");
        System.out.println("Labrador at this age likes to  : " + puppy.getActivity());

        System.out.println("***********************");

        ImportantEvent[] allEvents = ImportantEvent.values();
        System.out.println("Labrador evolution :" + allEvents[0] + " , "
                + allEvents[1] + " , " + allEvents[2]);



    }




}
