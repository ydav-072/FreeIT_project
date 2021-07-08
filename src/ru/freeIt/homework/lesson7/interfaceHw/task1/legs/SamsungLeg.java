package ru.freeIt.homework.lesson7.interfaceHw.task1.legs;

public class SamsungLeg implements ILeg{
    private int price;

    public SamsungLeg(int price){
        this.price = price;
    }
    public SamsungLeg(){

    }

    @Override
    public void step() {
        System.out.println("Нога Samsung сделал шаг");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
