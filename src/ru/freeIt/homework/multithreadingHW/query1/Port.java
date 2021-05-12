package ru.freeIt.homework.multithreadingHW.query1;

import java.util.concurrent.Semaphore;

public class Port {
    private Semaphore pier;
    private int totalCapacityContainersOfPort;
    private int valueOfContainersInPort;

    public void pierRequest() {

    }

    public Semaphore getPier() {
        return pier;
    }

    public void setPier(Semaphore pier) {
        this.pier = pier;
    }

    public int getTotalCapacityContainersOfPort() {
        return totalCapacityContainersOfPort;
    }

    public void setTotalCapacityContainersOfPort(int totalCapacityContainersOfPort) {
        this.totalCapacityContainersOfPort = totalCapacityContainersOfPort;
    }

    public int getValueOfContainersInPort() {
        return valueOfContainersInPort;
    }

    public void setValueOfContainersInPort(int valueOfContainersInPort) {
        this.valueOfContainersInPort = valueOfContainersInPort;
    }
}
