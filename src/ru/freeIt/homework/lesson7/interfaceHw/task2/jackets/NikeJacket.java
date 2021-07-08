package ru.freeIt.homework.lesson7.interfaceHw.task2.jackets;

public class NikeJacket implements Jackets{
    @Override
    public void putOn() {
        System.out.println("Put on Nike Jackets");
    }

    @Override
    public void takeOff() {
        System.out.println("Take off Nike Jackets");
    }
}
