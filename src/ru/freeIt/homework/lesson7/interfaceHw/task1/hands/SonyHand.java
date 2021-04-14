package ru.freeIt.homework.lesson7.interfaceHw.task1.hands;

public class SonyHand implements IHand{
    private int price;

    public SonyHand(int price){
        this.price = price;
    }
    public SonyHand(){

    }
    @Override
    public void upHand() {
        System.out.println("Рука Sony поднялась вверх");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
