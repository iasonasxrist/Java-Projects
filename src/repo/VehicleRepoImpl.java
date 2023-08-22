package repo;

import model.EnhancedList.EnhancedList;
import model.vehicles.Vehicles;

import java.util.Iterator;

public class VehicleRepoImpl implements VehicleInteface {

    EnhancedList<Vehicles> vehiclesArrayList = new EnhancedList<>();


    @Override
    public boolean add(Vehicles vehicle) {
        try {
            vehiclesArrayList.insert(vehicle);
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    @Override
    public boolean remove(String numberOfVehicle) {
        Vehicles toBeDeleted = null;
        for (Vehicles vehicle : vehiclesArrayList) {
            if (vehicle.getNumberOfVehicle().equals(vehicle.getNumberOfVehicle())) {

                toBeDeleted = vehicle;
                System.out.println(vehicle.toString());
                break;

            }
        }
        if (toBeDeleted != null) {
            vehiclesArrayList.remove(toBeDeleted);
            return true;
        }
        return false;
    }

    public void printAll() {
        for (Vehicles vehicles : vehiclesArrayList) {
            System.out.println(vehicles.toString());
        }
    }


    public Vehicles searchByNumber(String numberOfVehicle) {

        Iterator<Vehicles> found = vehiclesArrayList.iterator();

        while (found.hasNext() ){

            Vehicles vehicle = found.next();
            if( vehicle.getNumberOfVehicle().equals(numberOfVehicle) ){
                System.out.println("Selected vehicle is " + vehicle);
                return vehicle;
            }
        }
        return null;
    }

    @Override
    public void printMyHierarchy(String className) {
        vehiclesArrayList.printAllInHierarchy(className);
    }

}
