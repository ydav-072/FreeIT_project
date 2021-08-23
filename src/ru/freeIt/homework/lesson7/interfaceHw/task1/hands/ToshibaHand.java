package ru.freeIt.homework.lesson7.interfaceHw.task1.hands;

public class ToshibaHand implements IHand{
    private int price;

    public ToshibaHand(int price){
        this.price = price;
    }
    public ToshibaHand(){

    }

    @Override
    public void upHand() {
        System.out.println("Рука Toshiba поднялась вверх");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
