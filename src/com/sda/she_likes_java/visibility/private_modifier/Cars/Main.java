package com.sda.she_likes_java.visibility.private_modifier.Cars;

public class Main {
    public static void main(String[] args) {
        Car funnyCar = new Car();
        // brand is private so not visible outside the clas
  //      funnyCar.brand

         funnyCar.model = "corola";

         //cabbot see colour from outside its class package
        //funnyCar.colour = "pink";





    }
}
