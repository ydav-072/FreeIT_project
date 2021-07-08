package ru.freeIt.homework.lesson7.interfaceHw.task3;

import java.util.Random;

public class Shuttle implements IStart{

    @Override
    public boolean checkSystem() {
        Random random = new Random();
        if (random.nextInt(9)+1 > 3) {
            return true;
        }else
            return false;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void startFly() {
        System.out.println("Старт Шатла");
    }
}
