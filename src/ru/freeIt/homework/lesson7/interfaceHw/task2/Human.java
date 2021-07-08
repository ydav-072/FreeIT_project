package ru.freeIt.homework.lesson7.interfaceHw.task2;

import ru.freeIt.homework.lesson7.interfaceHw.task2.footwears.Footwears;
import ru.freeIt.homework.lesson7.interfaceHw.task2.jackets.Jackets;
import ru.freeIt.homework.lesson7.interfaceHw.task2.trousers.Trousers;

public class Human {
    private String name;
    private Footwears footwears;
    private Jackets jackets;
    private Trousers trousers;

    public Human(String name, Footwears footwears, Jackets jackets, Trousers trousers) {
        this.name = name;
        this.footwears = footwears;
        this.jackets = jackets;
        this.trousers = trousers;
    }

    public Human() {
    }

    public void putOn(){
        System.out.println(this.name);
        footwears.putOn();
        jackets.putOn();
        trousers.putOn();
    }

    public void takeOff(){
        System.out.println(this.name);
        footwears.takeOff();
        jackets.takeOff();
        trousers.takeOff();
    }

    public Footwears getFootwears() {
        return footwears;
    }

    public void setFootwears(Footwears footwears) {
        this.footwears = footwears;
    }

    public Jackets getJackets() {
        return jackets;
    }

    public void setJackets(Jackets jackets) {
        this.jackets = jackets;
    }

    public Trousers getTrousers() {
        return trousers;
    }

    public void setTrousers(Trousers trousers) {
        this.trousers = trousers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
