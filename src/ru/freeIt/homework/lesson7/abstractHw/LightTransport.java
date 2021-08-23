package ru.freeIt.homework.lesson7.abstractHw;

public class LightTransport extends LandTransport {
    private String bodyType;
    private int valueOfPassengers;

    public LightTransport(String bodyType, int valueOfPassengers, int maxSpeed, String brand, int fuelConsumption,
                        int horsePower, int weight, int valueOfWheels) {
        this.setBodyType(bodyType);
        this.setValueOfPassengers(valueOfPassengers);
        super.setMaxSpeed(maxSpeed);
        super.setBrand(brand);
        super.setFuelConsumption(fuelConsumption);
        super.setHorsePower(horsePower);
        super.setWeight(weight);
        super.setValueOfWheels(valueOfWheels);
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getValueOfPassengers() {
        return valueOfPassengers;
    }

    public void setValueOfPassengers(int valueOfPassengers) {
        this.valueOfPassengers = valueOfPassengers;
    }

    public String descriptionObject(int time){
        mileageCalculation(time);
        String powerInWatt = Double.toString(this.getHorsePower() * 0.74);
        return this.getBrand() + " " + this.getMaxSpeed()+ " " + this.getFuelConsumption() + " "
                + this.getHorsePower() + " " + this.getWeight() + " " + this.getValueOfWheels() + " " + this.getBodyType() + " "
                + this.getValueOfPassengers() + " " + powerInWatt;

    }

    private void mileageCalculation(int time){
        int totalMileage = this.getMaxSpeed() * time;
        int fuelConsumption = time * totalMileage;
        System.out.println("За время " + time + " часа, автомобиль " + this.getBrand() + " двигаясь со скоростью " +
                this.getMaxSpeed() + " израсходует " + fuelConsumption + " и проедет " + totalMileage);
    }
}
