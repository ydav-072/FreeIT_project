package ru.freeIt.homework.lesson7.interfaceHw.task1.hands;

public class SamsungHand implements IHand{
    private int price;

    public SamsungHand(int price){
        this.price = price;
    }
    public SamsungHand(){

    }
    @Override
    public void upHand() {
        System.out.println("Рука Samsung поднялась вверх");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
