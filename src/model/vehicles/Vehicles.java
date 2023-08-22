package model.vehicles;

public abstract class Vehicles implements Comparable<Vehicles> {

    protected String numberOfVehicle;

    protected String brand;

    protected int year;

    protected int totalKM;

    protected double priceOfRent;

    protected boolean isValidCustomFormat(String value) {
        return value.matches("[A-Z]{3}\\d{4}");
    }


    public Vehicles(String numberOfVehicle, String brand, int year, int totalKM, double priceOfRent) {

        if (isValidCustomFormat(numberOfVehicle)) {
            this.numberOfVehicle = numberOfVehicle;
        } else {
            throw new IllegalArgumentException("Invalid custom format! Please check Number Of Vehicle!");
        }
        this.brand = brand;
        this.year = year;
        this.totalKM = totalKM;
        this.priceOfRent = priceOfRent;

    }

    ;

    public String getNumberOfVehicle() {
        return numberOfVehicle;
    }

    public void setNumberOfVehicle(String numberOfVehicle) {
        this.numberOfVehicle = numberOfVehicle;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getTotalKM() {
        return totalKM;
    }

    public void setTotalKM(int totalKM) {
        this.totalKM = totalKM;
    }

    public double getPriceOfRent() {
        return (int) priceOfRent;
    }

    public void setPriceOfRent(double priceOfRent) {
        this.priceOfRent = priceOfRent;
    }


    @Override
    public String toString() {
        return "Vehicles{" +
                "numberOfVehicle='" + numberOfVehicle + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", totalKM=" + totalKM +
                ", priceOfRent=" + priceOfRent +
                '}';
    }


    @Override
    public int compareTo(Vehicles o) {
        if (getNumberOfVehicle() != o.getNumberOfVehicle()) {
            return -1;

        } else if (getNumberOfVehicle().equals(getNumberOfVehicle())) {
            return 0;

        } else {
            return 1;
        }
    }
}
