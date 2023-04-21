package com.sda.she_likes_java.strings;

public class ImmutableString {
    public static void main(String[] args) {

        String name = "Lina";
        name = name.concat("p");// + is shortcut for concat method call
        name = name.concat("is 40");


        System.out.println("My name now: " +name);

        StringBuilder nameWithBuilder = new StringBuilder("Lina");
        nameWithBuilder.append("bark");
        nameWithBuilder.append("bark");
        nameWithBuilder.append("bark");
        nameWithBuilder.append("bark");
        nameWithBuilder.append("bark");
        System.out.println("name woth string builder" + nameWithBuilder);

        String some = "alise" + "is" + "10" + "yeras";


        StringBuilder someString = new StringBuilder();
        someString.append("Alise");
        someString.append("is");
        someString.append("10");
        someString.append("years");






    }
}
