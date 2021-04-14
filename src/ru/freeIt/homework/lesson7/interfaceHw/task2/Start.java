package ru.freeIt.homework.lesson7.interfaceHw.task2;

import ru.freeIt.homework.lesson7.interfaceHw.task2.footwears.AdidasFootwear;
import ru.freeIt.homework.lesson7.interfaceHw.task2.footwears.NikeFootwear;
import ru.freeIt.homework.lesson7.interfaceHw.task2.jackets.AdidasJacket;
import ru.freeIt.homework.lesson7.interfaceHw.task2.jackets.NikeJacket;
import ru.freeIt.homework.lesson7.interfaceHw.task2.trousers.AdidasTrouses;
import ru.freeIt.homework.lesson7.interfaceHw.task2.trousers.NikeTrouses;

public class Start {
    public static void main(String[] args) {
        Human human1 = new Human("Bill", new AdidasFootwear(), new NikeJacket(), new NikeTrouses());
        Human human2 = new Human("Nikol", new NikeFootwear(), new AdidasJacket(), new AdidasTrouses());

        human1.putOn();
        human1.takeOff();

        human2.putOn();
        human2.takeOff();
    }
}
