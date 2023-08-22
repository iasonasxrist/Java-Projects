package model.vehicles;

import model.enums.EnergyType;
import model.enums.Property;

public class Car extends Passenger{

    private int numberOfDoors;
    private EnergyType energyType;

    private Property usage;

    public Car(String numberOfVehicle, String brand, int year, int totalKM, double priceOfRent, int maxPeopleOnVehicle, int milliliters,int numberOfDoors, EnergyType energyType){
        super( numberOfVehicle,  brand,  year,  totalKM,  priceOfRent, maxPeopleOnVehicle,milliliters);
        this.numberOfDoors = numberOfDoors;
        this.energyType = energyType;

        if ( this.numberOfDoors <= 7 ){
            this.usage = Property.PRIVATE;
        }
        else{
            this.usage = Property.PUBLIC;
        }

    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public EnergyType getEnergyType() {
        return energyType;
    }

    public void setEnergyType(EnergyType energyType) {
        this.energyType = energyType;
    }

    public Property getUsage() {
        return usage;
    }

    public void setUsage(Property usage) {
        this.usage = usage;
    }


    @Override
    public String toString() {
        return "Car{" +
                "numberOfDoors=" + numberOfDoors +
                ", energyType=" + energyType +
                ", usage=" + usage +
                ", numberOfVehicle='" + numberOfVehicle + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", totalKM=" + totalKM +
                ", priceOfRent=" + priceOfRent +
                '}';
    }
}
