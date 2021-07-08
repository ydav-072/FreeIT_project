package ru.freeIt.homework.lesson7.interfaceHw.task2.footwears;

public class AdidasFootwear implements Footwears{
    @Override
    public void putOn() {
        System.out.println("Put on Adidas footwear");
    }

    @Override
    public void takeOff() {
        System.out.println("Take off Adidas footwear");
    }
}
