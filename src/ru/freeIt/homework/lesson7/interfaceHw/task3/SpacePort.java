package ru.freeIt.homework.lesson7.interfaceHw.task3;

import java.util.concurrent.TimeUnit;

public class SpacePort {
    public SpacePort(){
    }
    public void start(IStart iStart) throws InterruptedException {
        if (iStart.checkSystem()){
            iStart.startEngine();
            System.out.print("Обратный отсчёт: ");
            for (int i = 10; i >= 0; i--){
                TimeUnit.SECONDS.sleep(1);
                System.out.println(i);
            }
            iStart.startFly();
        }else
            System.out.println("Предстартовая проверка провалена");

    }
}
