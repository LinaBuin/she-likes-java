package com.sda.she_likes_java.visibility.private_modifier.Cars;

//it snor possible to
class Car {
    private String brand;
    public String model;

    String colour;

    public String getBrand() {
        return brand;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}

