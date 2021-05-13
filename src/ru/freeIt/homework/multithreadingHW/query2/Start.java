package ru.freeIt.homework.multithreadingHW.query2;
//Тоннель. В горах существует два железнодорожных тоннеля, по которым
//        поезда могут двигаться в обоих направлениях. По обоим концам тоннеля
//        собралось много поездов. Обеспечить безопасное прохождение тоннелей
//        в обоих направлениях. Поезд можно перенаправить из одного тоннеля
//        в другой при превышении заданного времени ожидания на проезд.

public class Start {
    public static void main(String[] args) {
        Tunnel tunnelTrue = new Tunnel(true);
        Tunnel tunnelFalse = new Tunnel(false);
        WaitingPool waitingPool = new WaitingPool();

        CreatorThread creator = new CreatorThread(waitingPool);
        creator.start();

        WaitingPoolMonitorThread poolMonitor = new WaitingPoolMonitorThread(waitingPool);
        poolMonitor.setDaemon(true);
        poolMonitor.start();

        DispatcherThread dispatcher = new DispatcherThread(waitingPool, tunnelTrue, tunnelFalse);
        dispatcher.setDaemon(true);
        dispatcher.start();
    }
}
