package ru.freeIt.homework.lesson7.interfaceHw.task1.legs;

public class SonyLeg implements ILeg{
    private int price;

    public SonyLeg(int price){
        this.price = price;
    }
    public SonyLeg(){

    }


    @Override
    public void step() {
        System.out.println("Нога Sony сделал шаг");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
