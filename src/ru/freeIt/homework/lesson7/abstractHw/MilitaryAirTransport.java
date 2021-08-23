package ru.freeIt.homework.lesson7.abstractHw;

public class MilitaryAirTransport extends AirTransport{
    private boolean systemOfEjection;
    private int valueOfRockets;

    public MilitaryAirTransport(int valueOfRockets, boolean systemOfEjection, String brand, int horsePower, int weight,
                                int maxSpeed, int lengthOfRoad, int wingsSpan) {
        setValueOfRockets(valueOfRockets);
        setSystemOfEjection(systemOfEjection);
        super.setBrand(brand);
        super.setHorsePower(horsePower);
        super.setWeight(weight);
        super.setMaxSpeed(maxSpeed);
        super.setLengthOfRoad(lengthOfRoad);
        super.setWingspan(wingsSpan);
    }

    public String describeTransport(int valueOfRockets){
        ejectionChecker();
        shooting(valueOfRockets);
        return this.getValueOfRockets() + " " + this.isSystemOfEjection() + " " + this.getHorsePower() + " " + this.getWeight() + " " +
                this.getMaxSpeed() + " " + this.getLengthOfRoad() + " " + this.getWingspan();
    }

    private void  shooting(int valueOfRockets){
        if(this.valueOfRockets > valueOfRockets){
            System.out.println("Ракета пошла...");
        } else
            System.out.println("Боеприпасы отсутствуют");
    }

    private void ejectionChecker(){
        if (systemOfEjection){
            System.out.println("Катапультирование прошло успешно");
        } else
            System.out.println("У вас нет такой системы");
    }

    public boolean isSystemOfEjection() {
        return systemOfEjection;
    }

    public void setSystemOfEjection(boolean systemOfEjection) {
        this.systemOfEjection = systemOfEjection;
    }

    public int getValueOfRockets() {
        return valueOfRockets;
    }

    public void setValueOfRockets(int valueOfRockets) {
        this.valueOfRockets = valueOfRockets;
    }
}
