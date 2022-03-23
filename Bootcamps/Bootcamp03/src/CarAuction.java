package Bootcamps.Bootcamp03.src;
import java.util.*;

public class CarAuction{
    //Attributes - Car Array is a dynamic array list.
    private List<Car> carArray = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    //Methods
    //Create Cars method - inserts 3 new cars into carArray.
    public void createCars() {
        Car car1 = new Car();
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
        car1.createCar(maker, model, modelYear);
        //Closure statement - To assure user that a cas has been added to the car auction.
        System.out.print("Added a new car : ");
        car1.description();
        System.out.println("--------------------------------------");

        //Add Bids
        do {
            selection = bidMenuSelect();
            switch(selection){
                case 1:
                    System.out.println("Adding a bid . . .");
                    System.out.println("Please enter the details of the client whom is placing the bid.");

                    //Adding Client
                    System.out.print("Please enter the Client's First Name: ");
                    String clientFName = scanner.next();
                    System.out.print("Please enter the Client's Last Name: ");
                    String clientLName = scanner.next();
                    Client client = new Client(Utils.nextID(), clientFName, clientLName);

                    //Adding Bid Price and Bid Date
                    System.out.println("Welcome Client: " + client.description());
                    System.out.print("Please enter the Client's preferred Bid Amount: ");
                    int bidPrice= scanner.nextInt();
                    System.out.print("Please enter the bid date in the form: day/month/year ");
                    System.out.print("(Example: 23/03/2022): ");
                    String bidDate = scanner.next();

                    //Adding bid and client to car.
                    car1.addBid(client, bidPrice, bidDate);
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
        System.out.println(bidQuantity + " Bids have been added to the car: " + maker + " " + model + " " + modelYear + ".");
        carArray.add(car1);
        System.out.println("Car addition to auction complete for car: ");
        car1.description();
        System.out.println("--------------------------------------");
    }

    //Bid console-based user interface method.
    public int bidMenuSelect(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to add bids to the following car?");
        System.out.println("1) Add a Bid.");
        System.out.println("2) Exit.");
        System.out.print("Please select an option: ");
        int choice = scanner.nextInt();
        return choice;
    }

    //Display Car method - display cars in carArray;
    public void displayCar(){
        if (carArray.size() > 0) {
            for (int i = 0; i < carArray.size(); i++) {
                System.out.print("Car (" + (i + 1) + ") ");
                carArray.get(i).description();
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