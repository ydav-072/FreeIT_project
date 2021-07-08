package ru.freeIt.homework.lesson7.interfaceHw.task1;

import ru.freeIt.homework.lesson7.interfaceHw.task1.hands.SamsungHand;
import ru.freeIt.homework.lesson7.interfaceHw.task1.hands.SonyHand;
import ru.freeIt.homework.lesson7.interfaceHw.task1.hands.ToshibaHand;
import ru.freeIt.homework.lesson7.interfaceHw.task1.heads.SamsungHead;
import ru.freeIt.homework.lesson7.interfaceHw.task1.heads.SonyHead;
import ru.freeIt.homework.lesson7.interfaceHw.task1.heads.ToshibaHead;
import ru.freeIt.homework.lesson7.interfaceHw.task1.legs.SamsungLeg;
import ru.freeIt.homework.lesson7.interfaceHw.task1.legs.SonyLeg;
import ru.freeIt.homework.lesson7.interfaceHw.task1.legs.ToshibaLeg;

/*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
public class Start {
    public static void main(String[] args) {
        Robot robot1 = new Robot(new ToshibaHead(500), new SamsungHand(400), new SonyLeg(200));
        Robot robot2 = new Robot(new SonyHead(800), new ToshibaHand(500), new SamsungLeg(250));
        Robot robot3 = new Robot(new SamsungHead(700), new SonyHand(900), new ToshibaLeg(600));

        robot1.action();
        robot2.action();
        robot3.action();
        if (robot1.getPrice() > robot2.getPrice() && robot1.getPrice() > robot3.getPrice()){
            System.out.println("Robot1 get max price: " + robot1.getPrice());
        } else
            if(robot2.getPrice() > robot1.getPrice() & robot2.getPrice() > robot3.getPrice()){
                System.out.println("Robot2 get max price: " + robot2.getPrice());
            }else
                System.out.println("Robot3 get max price: " + robot3.getPrice());
    }
}
