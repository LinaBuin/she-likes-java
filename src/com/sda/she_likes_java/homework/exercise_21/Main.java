package com.sda.she_likes_java.homework.exercise_21;

public class Main {

    public static void main(String[] args) {

        Vehicle newVehicle = new Vehicle();
        newVehicle.move();

        Airplane flyableAirplane = new Airplane();
        flyableAirplane.fly();

        Ship driftingShip = new Ship();
        driftingShip.drift();

        Submarine divingSubmarine = new Submarine();
        divingSubmarine.dive();

        System.out.println("   " +
                "        ");            // space

        Vehicle justPlain = new Airplane();
        ((Vehicle) justPlain).move();   //upcasting

        System.out.println("   " +
                "        ");            // space

       Airplane superPlain = (Airplane) justPlain;
        superPlain.fly();             // down casting

    }
}


