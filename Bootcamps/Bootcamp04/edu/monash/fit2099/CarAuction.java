package Bootcamps.Bootcamp04.edu.monash.fit2099;

import Bootcamps.Bootcamp04.edu.monash.fit2099.clients.Client;
import Bootcamps.Bootcamp04.edu.monash.fit2099.vehicles.CruiserBike;
import Bootcamps.Bootcamp04.edu.monash.fit2099.vehicles.CruiserBikeType;
import Bootcamps.Bootcamp04.edu.monash.fit2099.vehicles.SportCar;
import Bootcamps.Bootcamp04.edu.monash.fit2099.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarAuction{
    //Attributes - Car Array is a dynamic array list.
    private List<Vehicle> vehicleArray = new ArrayList<>();
    private List<Client> clientArray = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    //Methods
    //Create Sports Car Method
    public void createSportsCars() {
        int vehicleId;
        String maker;
        String model;
        int modelYear;
        int seats;
        boolean isConvertible;

        //Create SportsCar
        System.out.println("--------------------------------------");
        System.out.println("Adding a new SportsCar to the auction.");
        System.out.print("Please enter a car Id: ");
        vehicleId = scanner.nextInt();
        System.out.print("Please enter a car maker: ");
        maker = scanner.next();
        System.out.print("Please enter a car model: ");
        model = scanner.next();
        System.out.print("Please enter a car model year: ");
        modelYear = scanner.nextInt();
        System.out.print("Please enter the number of seats: ");
        seats = scanner.nextInt();
        System.out.print("Please state if the car is convertible (true if yes, false is no): ");
        isConvertible = scanner.nextBoolean();
        SportCar sportCar = new SportCar(vehicleId, maker, model, modelYear, seats, isConvertible);
        vehicleArray.add(sportCar);

        //Closure statement - To assure user that a new Sports Car has been added to the car auction.
        System.out.println("Added a new sports car : " + maker + " " + model + " " + modelYear);

    }

    //Create Cruiser Bike Method
    //Reading in Enum from scanner reference:
    //https://stackoverflow.com/questions/9578986/java-and-enum-with-scanner
    public void createCruiserBike() {
        int vehicleId;
        String maker;
        String model;
        int modelYear;
        CruiserBikeType cruiserBikeType;

        //Create SportsCar
        System.out.println("--------------------------------------");
        System.out.println("Adding a new CruiserBike to the auction.");
        System.out.print("Please enter a bike Id: ");
        vehicleId = scanner.nextInt();
        System.out.print("Please enter a bike maker: ");
        maker = scanner.next();
        System.out.print("Please enter a bike model: ");
        model = scanner.next();
        System.out.print("Please enter a bike model year: ");
        modelYear = scanner.nextInt();
        System.out.print("Please state the type of cruiser bike (CHOPPER or BOBBER): ");
        cruiserBikeType = CruiserBikeType.valueOf(scanner.next().toUpperCase());
        CruiserBike cruiserBike = new CruiserBike(vehicleId, maker, model, modelYear, cruiserBikeType);
        vehicleArray.add(cruiserBike);

        //Closure statement for Cruiser Bike
        System.out.println("Added a new cruise bike : " + maker + " " + model + " " + modelYear);

    }

    //Create Client Method
    public void createClient(){
        int clientId;
        String firstName;
        String lastName;

        //Create SportsCar
        System.out.println("--------------------------------------");
        System.out.println("Adding a new Client.");
        System.out.print("Please enter client Id number: ");
        clientId = scanner.nextInt();
        System.out.print("Please enter the client's first name: ");
        firstName = scanner.next();
        System.out.print("Please enter the client's last name: ");
        lastName = scanner.next();
        Client client = new Client(clientId,firstName,lastName);
        clientArray.add(client);

        //Closure statement for Client
        System.out.println("Added a new client : " + clientId + " " + firstName + " " + lastName);
    }

    //Create Bid Method
    public void createBid(){
        int vehicleId;
        int clientId;
        int bidPrice;
        String bidDate;
        boolean foundFlag = false;

        //Identify Vehicle and check if vehicle exists in array.
        System.out.print("Please enter the Vehicle Id of the vehicle the bid will be placed on: ");
        vehicleId = scanner.nextInt();

        //Search Car Array
        for(Vehicle vehicle:vehicleArray){
            if (vehicle.getVehicleID() == vehicleId){
                System.out.print("Please enter the Client Id number of the client who is placing the bid: ");
                clientId = scanner.nextInt();
                System.out.print("Please enter the bid price: ");
                bidPrice= scanner.nextInt();
                System.out.print("Please enter the bid date in the form: day/month/year ");
                System.out.print("(Example: 23/03/2022): ");
                bidDate = scanner.next();
                vehicle.addBid(clientId,bidPrice,bidDate);

                //Closure statement for Bid
                System.out.println("Added a new bid of : " + bidPrice + " from client number: " + clientId + " to vehicle number: " + vehicleId);
                foundFlag = true;
                break;
            }
        }

        if (!foundFlag){
            System.out.println("Vehicle of Id: " + vehicleId + " is currently is not in the auction");
            System.out.println("Unable to place bid.");
        }
    }

    //Display Car method - display cars in carArray
    public void displayFleet(){
        if (vehicleArray.size() > 0) {
            for (int i = 0; i < vehicleArray.size(); i++) {
                //Get vehicle out from array list to print description.
                System.out.print("Vehicle (" + (i + 1) + ") ");
                vehicleArray.get(i).description();
            }
        } else {
            System.out.println("There are no vehicles in auction now.");
        }
    }

    //Display Clients method - display clients in clientArray
    public void displayClients(){
        if (clientArray.size() > 0) {
            for (int i = 0; i < clientArray.size(); i++) {
                //Get client out from array list to print description.
                System.out.print("Client (" + (i + 1) + ") ");
                clientArray.get(i).description();
            }
        } else {
            System.out.println("There are no clients participating in auction now.");
        }
    }

    //Print Auction Status method
    public void printStatus(){
        System.out.println("Welcome to FIT2099 Car Auction Systems");
        System.out.println("Cars currently in auction:");
        displayFleet();
        //System.out.println("Thank you for visiting FIT2099 Car Auction System");
    }
}