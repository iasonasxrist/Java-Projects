package model.rentSystem;

import model.vehicles.Vehicles;
import repo.ClientRepoImp;
import repo.RentRepoImpl;
import repo.VehicleRepoImpl;

public class RentSystem {

    public RentRepoImpl listOfRents;
    private String name;

    private double AFM;

    private String Headquarters;

    private static RentSystem instance = null;

    public VehicleRepoImpl listOfVehicles;

    public ClientRepoImp listOfClients;

    private RentSystem(String name, double AFM, String Headquarters){

        this.name= name;
        this.AFM =AFM;
        this.Headquarters = Headquarters;
        this.listOfVehicles = new VehicleRepoImpl();
        this.listOfRents = new RentRepoImpl();
        this.listOfClients = new ClientRepoImp();

    };

    public static RentSystem getInstance(String name, double AFM, String Headquarters){
        if (instance == null){
            instance = new RentSystem(name, AFM, Headquarters);
        }
        return instance;
    }

    public void printVehicles(){
        listOfVehicles.printAll();
    }

    public void printInHierarchy(String className){

        listOfVehicles.printMyHierarchy(className);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAFM() {
        return AFM;
    }

    public void setAFM(double AFM) {
        this.AFM = AFM;
    }

    public String getHeadquarters() {
        return Headquarters;
    }

    public void setHeadquarters(String headquarters) {
        Headquarters = headquarters;
    }

    @Override
    public String toString() {
        return "System{" +
                "name='" + name + '\'' +
                ", AFM=" + AFM +
                ", Headquarters='" + Headquarters + '\'' +
                '}';
    }
}
