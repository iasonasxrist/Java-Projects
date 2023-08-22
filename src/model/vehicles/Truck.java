package model.vehicles;

public class Truck extends Vehicles{

    private int maxLoad;

    private int width;

    private int height;

    @Override
    public String toString() {
        return "Truck{" +
                "maxLoad=" + maxLoad +
                ", width=" + width +
                ", height=" + height +
                ", numberOfVehicle='" + numberOfVehicle + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", totalKM=" + totalKM +
                ", priceOfRent=" + priceOfRent +
                '}';
    }

    public Truck(String numberOfVehicle, String brand, int year, int totalKM, double priceOfRent, int maxLoad, int width, int height) {

        super(numberOfVehicle,brand,year,totalKM,priceOfRent);
        this.maxLoad = maxLoad;
        this.width = width;
        this.height = height;

    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
