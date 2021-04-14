package ru.freeIt.homework.lesson7.interfaceHw.task2.trousers;

public class NikeTrouses implements Trousers{
    @Override
    public void putOn() {
        System.out.println("Put on Nike Trousers");
    }

    @Override
    public void takeOff() {
        System.out.println("Take off Nike Trousers");
    }
}
