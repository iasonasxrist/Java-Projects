package model.vehicles;

public  class Passenger extends Vehicles{

    private int maxPeopleOnVehicle;

    private int milliliters;
    public Passenger (String numberOfVehicle, String brand, int year, int totalKM, double priceOfRent, int maxPeopleOnVehicle, int milliliters){

        super(numberOfVehicle, brand, year, totalKM, priceOfRent);
        this.maxPeopleOnVehicle = maxPeopleOnVehicle;
        this.milliliters = milliliters;

    }

    public int getMaxPeopleOnVehicle() {
        return maxPeopleOnVehicle;
    }

    public void setMaxPeopleOnVehicle(int maxPeopleOnVehicle) {
        this.maxPeopleOnVehicle = maxPeopleOnVehicle;
    }

    public int getMilliliters() {
        return milliliters;
    }

    public void setMilliliters(int milliliters) {
        this.milliliters = milliliters;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "maxPeopleOnVehicle=" + maxPeopleOnVehicle +
                ", milliliters=" + milliliters +
                ", numberOfVehicle='" + numberOfVehicle + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", totalKM=" + totalKM +
                ", priceOfRent=" + priceOfRent +
                '}';
    }
}
