package model.vehicles;

import model.enums.TypeBike;

public class Bike extends Passenger {

    private TypeBike typeBike;

    public Bike(String numberOfVehicle, String brand, int year, int totalKM, double priceOfRent, int maxPeopleOnVehicle,
                int milliliters, TypeBike typeBike) {
        super(numberOfVehicle, brand, year, totalKM, priceOfRent, maxPeopleOnVehicle, milliliters);

        if (maxPeopleOnVehicle > 2) {
            throw new RuntimeException("Must not be up to 3 passengers ");
        }
        this.typeBike = typeBike;


    }

    public TypeBike getTypeBike() {
        return typeBike;
    }

    public void setTypeBike(TypeBike typeBike) {
        this.typeBike = typeBike;
    }

    public int getNumberOfPassengers() {
        return getMaxPeopleOnVehicle();
    }

    public void setNumberOfPassengers(int maxPeopleOnVehicle) {
        this.setMaxPeopleOnVehicle(maxPeopleOnVehicle);
    }

    @Override
    public String toString() {
        return "Bike{" +
                "typeBike=" + typeBike +
                ", maxPeopleOnVehicle=" + getNumberOfPassengers() +
                ", numberOfVehicle='" + numberOfVehicle + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", totalKM=" + totalKM +
                ", priceOfRent=" + priceOfRent +
                '}';
    }
}