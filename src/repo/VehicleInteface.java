package repo;

import model.vehicles.Vehicles;

public interface VehicleInteface {


    public boolean add(Vehicles vehicle);

    public boolean remove(String numberOfVehicle);


    public void printAll();


    public Vehicles searchByNumber(String numberOfVehicle);

    public void printMyHierarchy(String className);

}
