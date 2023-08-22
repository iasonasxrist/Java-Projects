import model.client.Client;
import model.enums.EnergyType;
import model.enums.TypeBike;
import model.enums.TypeOfClient;
import model.rent.Rent;
import model.rentSystem.RentSystem;
import model.vehicles.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {


    public static void main(String[] args) {


        RentSystem system = RentSystem.getInstance("Avis Travel", 146433190, "Enou 3");

        Car car2 = new Car("ABC1235", "Huyndai", 2012, 60000, 30.0, 4, 1300, 5, EnergyType.GAS);
        Car car = new Car("ABC1234", "Toyota", 2022, 50000, 50.0, 4, 1200, 4, EnergyType.BATTERY);
        Bike bike = new Bike("XYZ5678", "Honda", 2021, 10000, 20.0, 2, 1400, TypeBike.TOURING);
        Truck truck = new Truck("XYZ5123", "Berbley", 2019, 1000, 300, 1000, 10000, 3000);

        Client client1 = new Client("Fizoua", 146433190, 694462763, "Athens", "Greece", TypeOfClient.INDIVIDUAL);
        Client client2 = new Client("Ometa", 146433190, 694462399, "Athens", "Greece", TypeOfClient.CORPORATE);

        SimpleDateFormat exampleFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date date1 = null;
        Date date2 = null;
        Date date3 = null;
        Date date4 = null;

        try {
            date1 = exampleFormat.parse("2020-10-10");
            date2 = exampleFormat.parse("2020-10-20");
            date3 = exampleFormat.parse("2020-8-26");
            date4 = exampleFormat.parse("2020-8-30");

        } catch (ParseException e) {
            System.out.println("Parse Exception" + e.getMessage());
        }

        Rent rent1 = new Rent(client1, car, date1, date2);
        Rent rent2 = new Rent(client2, car2, date3, date4);

//      VEHICLES
        system.listOfVehicles.add(car2);
        system.listOfVehicles.add(car);
        system.listOfVehicles.add(bike);
        system.listOfVehicles.add(truck);

        system.printVehicles();

//      CLIENTS
        system.listOfClients.addClient(client1);
        system.listOfClients.addClient(client2);



        // RENTS
        system.listOfRents.add(rent1);
        system.listOfRents.add(rent2);


        int choice;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("---------------MENU------------------");
            System.out.println("0: Search Category Of Vehicles");
            System.out.println("1: Print All Vehicles");
            System.out.println("2: Search Vehicle");
            System.out.println("3: Add Vehicle");
            System.out.println("4: Delete Vehicle");
            System.out.println("5: Print details Of Client By AFM");
            System.out.println("6: Delete Client By AFM");
            System.out.println("7: Create a Rent ");
            System.out.println("8: Print details Of Rents");
            System.out.println("9: Termination ");

            choice = sc.nextInt();


            switch (choice) {

                case 0:
                    System.out.println("1 : All");
                    System.out.println("2: Bikes");
                    System.out.println("3: Cars");
                    System.out.println("4 : Passengers");
                    System.out.println("5 : Trucks");

                    Scanner scou1 =  new Scanner(System.in);
                    int number = scou1.nextInt();
                    System.out.println("Loading . . .");

                    if (number == 1){
                        system.printInHierarchy("model.vehicles.Vehicles");
                        break;

                    } else if (number == 2) {
                        system.printInHierarchy("model.vehicles.Bike");
                        break;
                    }
                    else if (number == 3) {
                        system.printInHierarchy("model.vehicles.Car");
                        break;
                    }
                    else if (number == 4) {
                        system.printInHierarchy("model.vehicles.Passenger");
                        break;
                    }
                    else if (number == 5) {
                        system.printInHierarchy("model.vehicles.Truck");
                        break;
                    }


                case 1:

                    system.listOfVehicles.printAll();
                    break;


                case 2:
                    try {
                        Scanner sc1 = new Scanner(System.in);
                        String numb = sc1.nextLine();
                        System.out.println(numb);
                        system.listOfVehicles.searchByNumber(numb);
                        break;

                    } catch (NoSuchElementException e) {
                        System.err.println("No more input available.");
                    } catch (IllegalStateException e) {
                        System.err.println("Scanner is closed.");
                    }
                case 3:
                    System.out.println("Create a Vehicle");
                    Scanner create = new Scanner(System.in);

                    try{

                        System.out.println("1: Bike");
                        System.out.println("2: Car");
                        System.out.println("3 : Passenger");
                        System.out.println("4 : Truck");

                        Scanner addVehicle =  new Scanner(System.in);
                        int selectedVehicle = addVehicle.nextInt();
                        System.out.println("Loading . . .");

                        if (selectedVehicle == 1){

                            Scanner scanner = new Scanner(System.in);

                            System.out.print("Enter license plate: ");
                            String licensePlate = scanner.nextLine();

                            System.out.print("Enter brand: ");
                            String brand = scanner.nextLine();

                            System.out.print("Enter year: ");
                            int year = scanner.nextInt();

                            System.out.print("Enter totalKM: ");
                            int totalKM = scanner.nextInt();

                            System.out.print("Enter price of rent: ");
                            double priceOfRent = scanner.nextDouble();

                            System.out.print("Enter max people on vehicle: ");
                            int maxPeopleOnVehicle = scanner.nextInt();

                            System.out.print("Enter engine displacement in milliliters: ");
                            int milliliters = scanner.nextInt();

                            System.out.print("Enter bike type (SPORT, CRUISER, TOURING): ");
                            scanner.nextLine(); // Consume the newline character
                            String typeBikeStr = scanner.nextLine();
                            TypeBike typeBike = TypeBike.valueOf(typeBikeStr);


                            // Create the Bike instance using user input
                            Bike newBike = new Bike(licensePlate, brand, year, totalKM, priceOfRent,
                                    maxPeopleOnVehicle, milliliters, typeBike);

                            system.listOfVehicles.add(newBike);

                            // Print the created Bike
                            System.out.println("Created Bike:");
                            System.out.println(newBike);
                            break;

                        } else if (selectedVehicle == 2) {

                            Scanner scanner = new Scanner(System.in);

                            System.out.print("Enter license plate: ");
                            String licensePlate = scanner.nextLine();

                            System.out.print("Enter brand: ");
                            String brand = scanner.nextLine();

                            System.out.print("Enter year: ");
                            int year = scanner.nextInt();

                            System.out.print("Enter totalKM: ");
                            int totalKM = scanner.nextInt();

                            System.out.print("Enter price of rent: ");
                            double priceOfRent = scanner.nextDouble();

                            System.out.print("Enter max people on vehicle: ");
                            int maxPeopleOnVehicle = scanner.nextInt();

                            System.out.print("Enter engine displacement in milliliters: ");
                            int milliliters = scanner.nextInt();

                            System.out.print("Enter number of doors: ");
                            int numberOfDoors = scanner.nextInt();

                            System.out.print("Enter energy type (GAS, DIESEL, BATTERY): ");
                            scanner.nextLine(); // Consume the newline character
                            String energyTypeStr = scanner.nextLine();
                            EnergyType energyType = EnergyType.valueOf(energyTypeStr);



                            // Create the Car instance using user input
                            Car newCar = new Car(licensePlate, brand, year, totalKM, priceOfRent,
                                    maxPeopleOnVehicle, milliliters, numberOfDoors, energyType);

                            system.listOfVehicles.add(newCar);


                            // Print the created car
                            System.out.println("Created Car:");
                            System.out.println(newCar);
                            break;
                        }
                        else if (selectedVehicle == 3) {

                            Scanner scanner = new Scanner(System.in);

                            System.out.print("Enter license plate: ");
                            String licensePlate = scanner.nextLine();

                            System.out.print("Enter brand: ");
                            String brand = scanner.nextLine();

                            System.out.print("Enter year: ");
                            int year = scanner.nextInt();

                            System.out.print("Enter mileage: ");
                            int mileage = scanner.nextInt();

                            System.out.print("Enter price of rent: ");
                            double priceOfRent = scanner.nextDouble();

                            System.out.print("Enter max people on vehicle: ");
                            int maxPeopleOnVehicle = scanner.nextInt();

                            System.out.print("Enter engine displacement in milliliters: ");
                            int milliliters = scanner.nextInt();

                            // Create the Passenger instance using user input
                            Passenger newPassenger = new Passenger(licensePlate, brand, year, mileage, priceOfRent,
                                    maxPeopleOnVehicle, milliliters);
                            system.listOfVehicles.add(newPassenger);

                            // Print the created passenger
                            System.out.println("Created Passenger:");
                            System.out.println(newPassenger);
                            break;
                        }
                        else if (selectedVehicle == 4) {

                            Scanner scanner = new Scanner(System.in);

                            System.out.print("Enter license plate: ");
                            String licensePlate = scanner.nextLine();

                            System.out.print("Enter brand: ");
                            String brand = scanner.nextLine();

                            System.out.print("Enter year: ");
                            int year = scanner.nextInt();

                            System.out.print("Enter totalKM: ");
                            int totalKM = scanner.nextInt();

                            System.out.print("Enter price of rent: ");
                            double priceOfRent = scanner.nextDouble();

                            System.out.print("Enter max load (kg): ");
                            int maxLoad = scanner.nextInt();

                            System.out.print("Enter width (m): ");
                            int width = scanner.nextInt();

                            System.out.print("Enter height(m): ");
                            int height = scanner.nextInt();

                            // Create the Cargo instance using user input
                            Truck newTruck = new Truck(licensePlate, brand, year, totalKM, priceOfRent,
                                    maxLoad, width, height);

                            system.listOfVehicles.add(newTruck);
                            // Print the created cargo
                            System.out.println("Created Truck:");
                            System.out.println(newTruck);
                            break;
                        }



                    }catch(Exception e){
                        System.out.println(e);
                        break;
                    }


                case 4:
                    System.out.println("Insert number Of Vehicle");
                    Scanner sc2 = new Scanner(System.in);

                    try {
                        String remove = sc2.nextLine();
                        System.out.println("Done...");
                        system.listOfVehicles.remove(remove);
                        break;

                    } catch (NoSuchElementException e) {
                        System.err.println("No more input available.");
                        break;
                    } catch (IllegalStateException e) {
                        System.out.println("Scanner is closed.");
                        break;
                    }

                case 5:
                    System.out.println("* Insert AFM Of Client *");
                    Scanner sc3 = new Scanner(System.in);

                    try {
                        Integer afm = sc3.nextInt();
                        Client newC = system.listOfClients.printClientByAFM(afm);

                        if (newC == null){
                            System.out.println("Not Found");
                        }
                        break;
                    }
                    catch (InputMismatchException e) {
                        System.out.println("Invalid input format. Please enter an integer.");
                        break;
                    }
                    catch (NoSuchElementException e) {
                        System.err.println("No more input available.");
                        break;
                    }
                    catch (IllegalStateException e) {
                        System.err.println("Scanner is closed.");
                        break;
                    }


                case 6:
                    System.out.println("Insert AFM of Client");
                    Scanner sc4 = new Scanner(System.in);
                    try {
                        Integer deleted = sc4.nextInt();
                        system.listOfClients.deleteClient(deleted);
                        break;
                    }
                    catch (InputMismatchException e) {
                        System.err.println("Invalid input format. Please enter an integer.");
                        break;
                    }
                    catch (NoSuchElementException e) {
                        System.err.println("No more input available.");
                        break;
                    }
                    catch (IllegalStateException e) {
                        System.err.println("Scanner is closed.");
                        break;
                    }

                case 7:

                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Insert AFM Of Client");
                    Integer select = scanner.nextInt();
                    Client selectedClient = system.listOfClients.printClientByAFM(select);

                    if (selectedClient ==null){
                        System.out.println("Client doesn't exist!");
                        break;
                    }

                    System.out.println("*Insert Number Of Vehicle*");
                    Scanner scanner2 = new Scanner(System.in);
                    String numberOfVehicle = scanner2.nextLine();


                    Vehicles selectedVehicle = system.listOfVehicles.searchByNumber(numberOfVehicle);
                    if (selectedVehicle == null) {
                        System.out.println("Error");
                        break;
                    }

                    System.out.print("Enter a date (yyyy-MM-dd): ");


                    Date startDate = null;
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

                    try {
                        startDate = dateFormat.parse(scanner.next());
                        

                    } catch (ParseException e) {
                        System.out.println("Invalid date format. " + e.getMessage());
                        break;
                    } catch (NullPointerException | IllegalArgumentException e) {
                        System.out.println("Invalid date format." + e.getMessage());
                        break;
                    }


                    System.out.print("Enter end date (yyyy-MM-dd): ");
                    Date endDate = null;

                    try {
                        endDate = dateFormat.parse(scanner.next());
                    } catch (ParseException e) {
                        System.out.println(e);

                    } catch (NullPointerException | IllegalArgumentException e) {
                        System.out.println("Invalid date format. Please enter in yyyy-MM-dd format. Exception ");
                    }


                    Rent rent = new Rent(selectedClient, selectedVehicle, startDate, endDate);

                    System.out.println(rent.getTotalCost());
                    break;

                case 8:
                    System.out.println("*Insert AFM of Client*");
                    Scanner scannerAfm = new Scanner(System.in);
                    int AFM = scannerAfm.nextInt();


                    System.out.println("*Insert Number Of Vehicle*");
                    Scanner scannerVehicle = new Scanner(System.in);
                    String vehicleNumber = scannerVehicle.nextLine();


                    Scanner scannerDate21 = new Scanner(System.in);
                    System.out.println("Enter start date (yyyy-MM-dd): ");
                    Date start = null;
                    SimpleDateFormat date2Format = new SimpleDateFormat("yyyy-MM-dd");


                    try {
                        start = date2Format.parse(scannerDate21.next());

                    } catch (ParseException e) {
                        System.out.println("Invalid date format. " + e.getMessage());
                    } catch (NullPointerException | IllegalArgumentException e) {
                        System.out.println("Invalid date format." + e.getMessage());

                    }

                    Scanner scannerDate22 = new Scanner(System.in);
                    System.out.println("Enter end date (yyyy-MM-dd): ");
                    Date end = null;

                    try {
                        end = date2Format.parse(scannerDate22.next());

                    } catch (ParseException e) {
                        System.out.println("Invalid date format. " + e.getMessage());
                    } catch (NullPointerException | IllegalArgumentException e) {
                        System.out.println("Invalid date format." + e.getMessage());

                    }

                    System.out.println("* Rent Details *");
                    system.listOfRents.printAll(AFM, vehicleNumber, start, end);
                    break;

                case 9:
                    System.out.println("Exiting...");
                    // Close the Scanner
                    return;


            }
        }
    }

}