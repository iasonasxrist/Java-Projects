package repo;

import model.EnhancedList.EnhancedList;
import model.rent.Rent;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RentRepoImpl implements RentInterface {

    EnhancedList<Rent> listOfRents = new EnhancedList<>();

    @Override
    public boolean add(Rent rent) {
        try {
            listOfRents.insert(rent);
        }
        catch(Exception e){
            System.out.println(e);
        }
        return true;
    }

    @Override
    public boolean remove(Rent rent) {
        try {
            listOfRents.remove(rent);

        } catch (Exception e) {
            System.out.println(e);
        }
        return true;
    }

    public void printAll(int AFM, String numberOfVehicle, Date start, Date end) {

        for (Rent rent : listOfRents) {

            if (rent.getVehicle().getNumberOfVehicle().equals(numberOfVehicle)) {


                if (rent.getClient().getClientAFM() == AFM) {
//                    For  Debugging
//                    System.out.println(rent.getRegistrationDate() + " ^^^^^" + start);
                    if (rent.getRegistrationDate().compareTo(start) == 0 &&
                            rent.getReturnDate().compareTo(end) == 0 && start.before(end)) {

                        System.out.println(rent);

                    } else {
                        System.out.println("ERROR!" + "Please enter proper Dates");
                        return;
                    }
                } else {
                    System.out.println("ERROR!" + "Client doesn't exists");
                    return;
                }
            } else {
                System.out.println("ERROR!" + "Vehicle doesn't exists");
                return;
            }
        }
    }
}
