package ru.freeIt.homework.lesson7.interfaceHw.task2.footwears;

public class NikeFootwear implements Footwears{
    @Override
    public void putOn() {
        System.out.println("Put on Nike Footwears");
    }

    @Override
    public void takeOff() {
        System.out.println("Take off Nike Footwears");
    }
}
