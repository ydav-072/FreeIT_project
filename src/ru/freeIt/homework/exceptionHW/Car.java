package ru.freeIt.homework.exceptionHW;

import java.util.Random;

public class Car {
    private String brand;
    private int speed;
    private int price;

    public Car() {
    }

    public Car(String brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
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

    public void start() throws StartException{
        Random random = new Random();
        int randomValue = random.nextInt(20);
        if((randomValue % 2) == 0){
            throw new StartException("Oooops, something was wrong...", randomValue);
        }else {
            System.out.println("Automobile " + getBrand() + " is started");
        }
    }
}
class StartException extends Exception{
    private int excStartNumber;

    public int getExcStartNumber() {
        return excStartNumber;
    }

    public StartException(String message, int startValue) {
        super(message);
        excStartNumber = startValue;
    }
}
