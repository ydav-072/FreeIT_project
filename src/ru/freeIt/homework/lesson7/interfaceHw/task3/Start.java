package ru.freeIt.homework.lesson7.interfaceHw.task3;

public class Start {
    public static void main(String[] args) throws InterruptedException {
       SpacePort spacePort1 = new SpacePort();
       spacePort1.start(new Shuttle());

       SpacePort spacePort2 = new SpacePort();
       spacePort2.start(new SpaceX());
    }
}
