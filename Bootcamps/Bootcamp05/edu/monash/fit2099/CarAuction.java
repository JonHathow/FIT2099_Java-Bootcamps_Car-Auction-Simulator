package Bootcamps.Bootcamp05.edu.monash.fit2099;

import Bootcamps.Bootcamp05.edu.monash.fit2099.clients.Client;
import Bootcamps.Bootcamp05.edu.monash.fit2099.taxation.TaxationManager;
import Bootcamps.Bootcamp05.edu.monash.fit2099.vehicles.BobberBike;
import Bootcamps.Bootcamp05.edu.monash.fit2099.vehicles.ChopperBike;
import Bootcamps.Bootcamp05.edu.monash.fit2099.vehicles.SportCar;
import Bootcamps.Bootcamp05.edu.monash.fit2099.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * CarAuction class is the class which manages the Car Auction. It contains all the methods which
 * invoke the vehicles in the auction, display the auction status, and allow the user to register
 * clients and place bids.
 * This is version 5 of this class, as it is from Week 5's Bootcamp.
 *
 * @author How Yu Chern
 * @version 5.0.0
 */
public class CarAuction{
    //Attributes - Car Array is a dynamic array list.
    /**
     * An ArrayList of vehicles in the car auction, vehicleArray.
     */
    private List<Vehicle> vehicleArray = new ArrayList<>();

    /**
     * An ArrayList of clients participating in the auction, clientArray.
     */
    private List<Client> clientArray = new ArrayList<>();

    /**
     * An instance of scanner class to capture user input.
     */
    Scanner scanner = new Scanner(System.in);

    //Methods
    //Create Sports Car Method
    /**
     * The method createSportsCars takes in car properties from the
     * user via console io, creates a new Sport Car from those properties, and
     * adds it to the vehicleArray in the car auction.
     * Used to add a new Sport Car to the car auction.
     * @throws Exception when sports car maker, model, modelYear, or seats are entered incorrectly.
     */
    public void createSportsCars() throws Exception {
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

        try {
            SportCar sportCar = new SportCar(vehicleId, maker, model, modelYear, seats, isConvertible);
            vehicleArray.add(sportCar);
            System.out.println(sportCar);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        //Closure statement - To assure user that a new Sports Car has been added to the car auction.
        System.out.println("Added a new sports car : " + maker + " " + model + " " + modelYear);

    }

    //Create Cruiser Bike Method - Chopper or Bobber Bike
    /**
     * The method createChopperBike takes in bike properties from the
     * user via console io, creates a new Chopper Bike from those properties, and
     * adds it to the vehicleArray in the car auction.
     * Used to add a new Chopper Bike to the car auction.
     *
     * @throws Exception when chopper bike maker, model, or modelYear are entered incorrectly.
     */
    public void createChopperBike() throws Exception {
        int vehicleId;
        String maker;
        String model;
        int modelYear;

        //Create Chopper Bike
        System.out.println("--------------------------------------");
        System.out.println("Adding a new ChopperBike to the auction.");
        System.out.print("Please enter a bike Id: ");
        vehicleId = scanner.nextInt();
        System.out.print("Please enter a bike maker: ");
        maker = scanner.next();
        System.out.print("Please enter a bike model: ");
        model = scanner.next();
        System.out.print("Please enter a bike model year: ");
        modelYear = scanner.nextInt();

        try {
            ChopperBike chopperBike = new ChopperBike(vehicleId, maker, model, modelYear);
            vehicleArray.add(chopperBike);
            System.out.println(chopperBike);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        //Closure statement for Chopper Bike
        System.out.println("Added a new chopper bike : " + maker + " " + model + " " + modelYear);
    }

    /**
     * The method createBobberBike takes in bike properties from the
     * user via console io, creates a new Bobber Bike from those properties, and
     * adds it to the vehicleArray in the car auction.
     * Used to add a new Bobber Bike to the car auction.
     *
     * @throws Exception when chopper bike maker, model, or modelYear are entered incorrectly.
     */
    public void createBobberBike() throws Exception {
        int vehicleId;
        String maker;
        String model;
        int modelYear;

        //Create Bobber Bike
        System.out.println("--------------------------------------");
        System.out.println("Adding a new BobberBike to the auction.");
        System.out.print("Please enter a bike Id: ");
        vehicleId = scanner.nextInt();
        System.out.print("Please enter a bike maker: ");
        maker = scanner.next();
        System.out.print("Please enter a bike model: ");
        model = scanner.next();
        System.out.print("Please enter a bike model year: ");
        modelYear = scanner.nextInt();

        try {
            BobberBike bobberBike = new BobberBike(vehicleId, maker, model, modelYear);
            vehicleArray.add(bobberBike);
            System.out.println(bobberBike);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        //Closure statement for Bobber Bike
        System.out.println("Added a new Bobber bike : " + maker + " " + model + " " + modelYear);
    }

    //Create Client Method
    /**
     * The method createClient takes in client properties from the
     * user via console io, creates a new Client instance from those properties, and
     * adds it to the clientArray in the car auction.
     * Used to welcome a new client into participating in the car auction.
     */
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
        Client client = Client.getInstance(firstName,lastName);
        clientArray.add(client);

        //Closure statement for Client
        System.out.println("Adding client option complete.");
    }

    //Create Bid Method
    /**
     * The method createBid takes in bid properties from the
     * user via console io, creates a new Bid instance from those properties, and
     * adds it to the respective vehicle the bid was placed on in the vehicleArray.
     * Used to enable a client to place a bid on a vehicle in the car auction.
     *
     * Also handles the calculation of tax for the vehicle if the vehicle is a taxable
     * vehicle, and displays the vehicle, bid, client, and tax status of the vehicle
     * on auction.
     */
    public void createBid(){
        int vehicleId;
        int clientId;
        int bidPrice;
        String bidDate;
        double tax = 0.00;
        String vehicleStr;
        String bidStr;
        boolean foundFlag = false;

        //Get identification (id) of vehicle for checking.
        System.out.print("Please enter the Vehicle Id of the vehicle the bid will be placed on: ");
        vehicleId = scanner.nextInt();

        //Search Car Array and add bid to a car if it exists in the car auction vehicle arraylist.
        //How to check subclass from superclass instance
        //Reference: https://stackoverflow.com/questions/46210273/how-to-get-the-objects-from-superclass-to-subclass-in-java
        for(Vehicle vehicle:vehicleArray){
            //If the car exists, add the corresponding bid to it.
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

                //Calculate Tax
                vehicleStr = "Bid for Vehicle: " + vehicle.getVehicleID() + "| MY" + vehicle.getModelYear() + "|" + vehicle.getMake() + "|" + vehicle.getModel() + "|";
                bidStr = "{0={" + vehicle.getBid(clientId).description() + "}}";
                if (TaxationManager.getInstance().getTaxableVehicles().contains(vehicle)) {
                    if (vehicle instanceof SportCar) {
                        tax = ((SportCar) vehicle).calculateTaxRate(bidPrice);
                    }
                    if (vehicle instanceof ChopperBike) {
                        tax = ((ChopperBike) vehicle).calculateTaxRate(bidPrice);
                    }
                    System.out.println(vehicleStr + bidStr + " Price: " + bidPrice + " Tax: " + tax);
                } else {
                    System.out.println(vehicleStr + bidStr + " Price: " + bidPrice + " Tax: NO TAX");
                }

                break;
            }
        }

        //Handles bids that are placed on a vehicle that does not exist in the car auction
        //vehicle arraylist.
        if (!foundFlag){
            System.out.println("Vehicle of Id: " + vehicleId + " is currently is not in the auction");
            System.out.println("Unable to place bid.");
        }
    }

    //Display Car method - display cars in carArray
    /**
     *  The method displayFleet displays the status of the car auction to the user,
     *  showing which cars are currently in the car auction.
     */
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
    /**
     *  The method displayFleet displays the status of the clients to the user,
     *  showing which clients are welcomed into participating in the auction.
     */
    public void displayClients(){
        if (clientArray.size() > 0) {
            for (int i = 0; i < clientArray.size(); i++) {
                //Get client out from array list to print description.
                System.out.println("Client (" + (i + 1) + ") " + clientArray.get(i).description());
            }
        } else {
            System.out.println("There are no clients participating in auction now.");
        }
    }

    //Print Auction Status method
    /**
     *  The method printStatus displays the status of the car auction to the user.
     */
    public void printStatus(){
        System.out.println("Welcome to FIT2099 Car Auction Systems");
        System.out.println("Cars currently in auction:");
        displayFleet();
        //System.out.println("Thank you for visiting FIT2099 Car Auction System");
    }
}