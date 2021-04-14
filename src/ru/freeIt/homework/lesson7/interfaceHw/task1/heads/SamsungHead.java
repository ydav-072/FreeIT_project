package ru.freeIt.homework.lesson7.interfaceHw.task1.heads;

public class SamsungHead implements IHead{
    private int price;

    public SamsungHead(int price){
        this.price = price;
    }
    public SamsungHead(){

    }
    @Override
    public void speek() {

    }

    @Override
    public int getPrice() {
        return price;
    }
}
