package model.rent;

import model.client.Client;
import model.vehicles.Vehicles;

import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Random;

public class Rent implements Comparable<Rent> {
    private int rentNumber;
    private Client client;
    private Vehicles vehicle;
    private Date registrationDate;
    private Date returnDate;

    private Integer totalCost;


    public Rent(Client client, Vehicles vehicle, Date registrationDate, Date returnDate) {
        this.rentNumber = generateRentNumber();
        this.client = client;
        this.vehicle = vehicle;
        this.registrationDate = registrationDate;
        this.returnDate = returnDate;
        this.totalCost = getTotalCost();
    }

    private int generateRentNumber() {
        return new Random().nextInt(10000);
    }

    public int getTotalCost() {

        long daysBetween = ChronoUnit.DAYS.between(registrationDate.toInstant(), returnDate.toInstant());

        return (int) (daysBetween * vehicle.getPriceOfRent());

    }

    public int getRentNumber() {
        return rentNumber;
    }

    public void setRentNumber(int rentNumber) {
        this.rentNumber = rentNumber;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Vehicles getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicles vehicle) {
        this.vehicle = vehicle;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public void setTotalCost(Integer totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {

        return "Rent{" + "rentNumber=" + rentNumber + ", client=" + client + ", vehicle=" + vehicle + ", registrationDate=" + registrationDate + ", returnDate=" + returnDate + ", totalCost=" + totalCost + '}';
    }

    @Override
    public int compareTo(Rent o) {
        return 0;
    }
}
