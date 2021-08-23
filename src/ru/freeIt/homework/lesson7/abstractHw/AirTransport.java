package ru.freeIt.homework.lesson7.abstractHw;

public abstract class AirTransport extends Transport {
    private int wingspan;

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getLengthOfRoad() {
        return lengthOfRoad;
    }

    public void setLengthOfRoad(int lengthOfRoad) {
        this.lengthOfRoad = lengthOfRoad;
    }

    private int lengthOfRoad;
}
