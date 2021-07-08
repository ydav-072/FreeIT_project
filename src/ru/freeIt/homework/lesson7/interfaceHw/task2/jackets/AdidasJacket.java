package ru.freeIt.homework.lesson7.interfaceHw.task2.jackets;

public class AdidasJacket implements Jackets {
    @Override
    public void putOn() {
        System.out.println("Put on Adidas Jackets");
    }

    @Override
    public void takeOff() {
        System.out.println("Take off on Adidas Jackets");
    }
}
