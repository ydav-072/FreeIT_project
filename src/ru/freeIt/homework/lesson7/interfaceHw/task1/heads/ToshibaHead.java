package ru.freeIt.homework.lesson7.interfaceHw.task1.heads;

public class ToshibaHead implements IHead {
    private int price;

    public ToshibaHead(int price){
        this.price = price;
    }
    public ToshibaHead(){

    }

    @Override
    public void speek() {
        System.out.println("Говорит голова Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
