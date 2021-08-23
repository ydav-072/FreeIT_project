package ru.freeIt.homework.lesson7.abstractHw;

public class FreightTransport extends LandTransport {
    private int liftingCapacity;

    public FreightTransport(int liftingCapacity, int maxSpeed, String brand, int fuelConsumption,
                            int horsePower, int weight, int valueOfWheels) {
        setLiftingCapacity(liftingCapacity);
        super.setMaxSpeed(maxSpeed);
        super.setBrand(brand);
        super.setFuelConsumption(fuelConsumption);
        super.setHorsePower(horsePower);
        super.setWeight(weight);
        super.setValueOfWheels(valueOfWheels);
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(int liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    public String descriptionObject(int weight){
        liftingCapacityChecker(weight);
        String powerInWatt = Double.toString(this.getHorsePower() * 0.74);
        return this.getBrand() + " " + this.getMaxSpeed()+ " " + this.getFuelConsumption() + " "
                + this.getHorsePower() + " " + this.getWeight() + " " + this.getValueOfWheels() + " " + powerInWatt
                + " " + this.getLiftingCapacity();

    }

    private  void liftingCapacityChecker(int weight){
        if (weight > liftingCapacity){
            System.out.println("Грузовик загружен");
        } else
            System.out.println("Вам нужен грузовик побольше");
    }
}
