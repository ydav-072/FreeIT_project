package ru.freeIt.homework.lesson7.abstractHw;

public class PacificAirTransport extends AirTransport{
    private int valueOfPassengers;
    private boolean withVip;

    public PacificAirTransport(int valueOfPassengers, boolean withVip, String brand, int horsePower, int weight,
                               int maxSpeed, int lengthOfRoad, int wingsSpan) {
        setValueOfPassengers(valueOfPassengers);
        setWithVip(withVip);
        super.setBrand(brand);
        super.setHorsePower(horsePower);
        super.setWeight(weight);
        super.setMaxSpeed(maxSpeed);
        super.setLengthOfRoad(lengthOfRoad);
        super.setWingspan(wingsSpan);
    }

    public String descriptionObject(int valueOfPas){
        valueOfPassengersChecker(valueOfPas);
        return this.getValueOfPassengers() + " " + this.isWithVip() + " " + this.getHorsePower() + " " + this.getWeight() + " " +
                this.getMaxSpeed() + " " + this.getLengthOfRoad() + " " + this.getWingspan();
    }

    private void valueOfPassengersChecker(int valueOfPas){
        if (valueOfPas > valueOfPassengers){
            System.out.println("Закажиет самолёт побольше");
        } else
            System.out.println("Все пассажиры влезут");
    }

    public int getValueOfPassengers() {
        return valueOfPassengers;
    }

    public void setValueOfPassengers(int valueOfPassengers) {
        this.valueOfPassengers = valueOfPassengers;
    }

    public boolean isWithVip() {
        return withVip;
    }

    public void setWithVip(boolean withVip) {
        this.withVip = withVip;
    }
}
