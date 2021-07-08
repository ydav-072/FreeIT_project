package ru.freeIt.homework.lesson12;

import java.io.Serializable;

public class Automobile implements Serializable {
    private String brand;
    private int speed;
    private int price;

    public Automobile(String brand, int speed, int price){
        this.brand = brand;
        this.price = price;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
