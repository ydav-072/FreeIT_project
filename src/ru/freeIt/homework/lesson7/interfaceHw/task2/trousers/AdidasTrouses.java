package ru.freeIt.homework.lesson7.interfaceHw.task2.trousers;

public class AdidasTrouses implements Trousers{
    @Override
    public void putOn() {
        System.out.println("Put on Adidas Trousers");
    }

    @Override
    public void takeOff() {
        System.out.println("Take off on Adidas Trousers");
    }
}
