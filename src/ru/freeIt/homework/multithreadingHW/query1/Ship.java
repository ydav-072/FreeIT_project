package ru.freeIt.homework.multithreadingHW.query1;

import java.util.Random;

public class Ship extends Thread {

    private int valueOfContainers;
    private int totalCapacityShip;
    private Port port;

    public int loadShip() {
        while (this.port.getValueOfContainersInPort() > 0 && this.valueOfContainers < this.totalCapacityShip) {
            this.valueOfContainers++;
            this.port.setValueOfContainersInPort(this.port.getValueOfContainersInPort() - 1);
            System.out.println(this.port.getValueOfContainersInPort());
            System.out.println("Loading ship " + Thread.currentThread().getName());
        }
        return this.valueOfContainers;
    }

    public void unloadShip() {
        int cargo = this.valueOfContainers;
        while (this.port.getValueOfContainersInPort() < this.port.getTotalCapacityContainersOfPort() && this.valueOfContainers > 0) {
            this.valueOfContainers--;
            this.port.setValueOfContainersInPort(this.port.getValueOfContainersInPort() + 1);
            System.out.println(this.port.getValueOfContainersInPort());
            System.out.println("Unloading ship " + Thread.currentThread().getName());
        }
    }

    @Override
    public void run() {
        Random random = new Random();
        this.totalCapacityShip = random.nextInt(10) + 1;
        this.valueOfContainers = random.nextInt(3);
        System.out.println(Thread.currentThread().getName() + "capacity: " + this.totalCapacityShip);
        System.out.println(Thread.currentThread().getName() + "containers: " + this.valueOfContainers);
        try {
            this.port.getPier().acquire();
            if (this.totalCapacityShip > this.valueOfContainers) {
                loadShip();
            } else {
                unloadShip();
            }
            this.port.getPier().release();
        } catch (InterruptedException interruptedException) {
            System.out.println("Ship is");
        }
    }


    public int getValueOfContainers() {
        return valueOfContainers;
    }

    public void setValueOfContainers(int valueOfContainers) {
        this.valueOfContainers = valueOfContainers;
    }

    public int getTotalCapacityShip() {
        return totalCapacityShip;
    }

    public void setTotalCapacityShip(int totalCapacityShip) {
        this.totalCapacityShip = totalCapacityShip;
    }

    public Port getPort() {
        return port;
    }

    public void setPort(Port port) {
        this.port = port;
    }
}
