package ru.freeIt.homework.multithreadingHW.query2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class WaitingPoolMonitorThread extends Thread {

    private final Lock lock = new ReentrantLock();
    WaitingPool pool;

    public WaitingPoolMonitorThread(WaitingPool pool) {
        this.pool = pool;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3_000);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }

            try {
                lock.lock();
                System.out.println("Pool size = " + pool.getSize());
            } finally {
                lock.unlock();
            }

        }

    }

}