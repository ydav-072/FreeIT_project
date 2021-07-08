package ru.freeIt.homework.lesson7.interfaceHw.task1.legs;

public class ToshibaLeg implements ILeg{
    private int price;

    public ToshibaLeg(int price){
        this.price = price;
    }
    public ToshibaLeg(){

    }

    @Override
    public void step() {
        System.out.println("Нога Toshiba сделал шаг");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
