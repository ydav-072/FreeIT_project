package ru.freeIt.homework.multithreadingHW.query1;
//Порт. Корабли заходят в порт для разгрузки/загрузки контейнеров. Число
//        контейнеров, находящихся в текущий момент в порту и на корабле, должно
//        быть неотрицательным и превышающим заданную грузоподъемность судна и вместимость порта. В порту работает несколько причалов. У одного
//        причала может стоять один корабль. Корабль может загружаться у причала,
//        разгружаться или выполнять оба действия.

import java.util.concurrent.Semaphore;

public class Start {
    public static void main(String[] args) {
        Port port = new Port();
        port.setValueOfContainersInPort(70);
        port.setTotalCapacityContainersOfPort(120);
        port.setPier(new Semaphore(5));

        for (int i = 0; i < 50; i++){
            Ship ship = new Ship();
            ship.setPort(port);
            ship.start();
        }
    }
}
