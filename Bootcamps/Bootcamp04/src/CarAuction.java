package Bootcamps.Bootcamp04.src;

import Bootcamps.Bootcamp04.src.clients.Client;
import Bootcamps.Bootcamp04.src.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarAuction{
    //Attributes - Car Array is a dynamic array list.
    private List<Vehicle> vehicleArray = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    //Methods
    //Create Cars method - inserts 3 new cars into carArray.
    public void createCars() {
        Vehicle vehicle1 = new Vehicle();
        String maker;
        String model;
        int modelYear;
        int selection;
        int bidQuantity = 0;

        //Create car
        System.out.println("--------------------------------------");
        System.out.println("Adding a new car to the auction.");
        System.out.print("Please enter a car maker: ");
        maker = scanner.next();
        System.out.print("Please enter a car model: ");
        model = scanner.next();
        System.out.print("Please enter a car model year: ");
        modelYear = scanner.nextInt();
        vehicle1.createCar(maker, model, modelYear);
        //Closure statement - To assure user that a cas has been added to the car auction.
        System.out.println("Added a new car : " + maker + " " + model + " " + modelYear);

        //Add Bids
        do {
            selection = bidMenuSelect();
            switch(selection){
                case 1:
                    System.out.println("Adding a bid . . .");
                    System.out.println("--------------------------------------");

                    //Adding Client
                    System.out.print("Please enter the Client's Id Number: ");
                    int clientId = scanner.nextInt();
                    System.out.print("Please enter the Client's First Name: ");
                    String clientFName = scanner.next();
                    System.out.print("Please enter the Client's Last Name: ");
                    String clientLName = scanner.next();
                    Client client = new Client(clientId, clientFName, clientLName);

                    //Adding Bid Price and Bid Date
                    System.out.println("Welcome Client " + client.description());
                    System.out.print("Please enter the Client's preferred Bid Price: ");
                    int bidPrice= scanner.nextInt();
                    System.out.print("Please enter the bid date in the form: day/month/year ");
                    System.out.print("(Example: 23/03/2022): ");
                    String bidDate = scanner.next();

                    //Adding bid and client to car.
                    vehicle1.addBid(client, bidPrice, bidDate);
                    System.out.println("Bid added.");
                    bidQuantity++;
                    break;
                case 2:
                    //Exit condition
                    break;
                default:
                    System.out.println("Please select an valid option from the menu.");
                    break;
            }
        } while (selection != 2);

        //Adding Car to car ArrayList
        System.out.println(bidQuantity + " Bids have been added to the car: " + maker + " " + model + " " + modelYear + ".");
        vehicleArray.add(vehicle1);
        System.out.println("Car addition to auction complete.");
        System.out.println("--------------------------------------");
    }

    //Bid console-based user interface method.
    public int bidMenuSelect(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("Would you like to add bids to the following car?");
        System.out.println("1) Add a Bid.");
        System.out.println("2) Exit.");
        System.out.print("Please select an option: ");
        return scanner.nextInt();
    }

    //Display Car method - display cars in carArray;
    public void displayCar(){
        if (vehicleArray.size() > 0) {
            for (int i = 0; i < vehicleArray.size(); i++) {
                //Get car out from array list to print description.
                System.out.print("Car (" + (i + 1) + ") ");
                vehicleArray.get(i).description();
            }
        } else {
            System.out.println("There are no cars in auction now.");
        }

    }

    //Print Auction Status method
    public void printStatus(){
        System.out.println("Welcome to FIT2099 Car Auction Systems");
        System.out.println("Cars currently in auction:");
        displayCar();
        //System.out.println("Thank you for visiting FIT2099 Car Auction System");
    }
}