package ru.freeIt.homework.lesson7.abstractHw;

public abstract class LandTransport extends Transport {
    private int valueOfWheels;
    private double fuelConsumption;

    public int getValueOfWheels() {
        return valueOfWheels;
    }

    public void setValueOfWheels(int valueOfWheels) {
        this.valueOfWheels = valueOfWheels;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
