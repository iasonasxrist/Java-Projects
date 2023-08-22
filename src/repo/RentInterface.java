package repo;

import model.rent.Rent;

import java.util.Date;

public interface RentInterface {

    public boolean add(Rent rent);


    public boolean remove(Rent rent);

    public void printAll(int AFM, String numberOfVehicle, Date start, Date end);
}
