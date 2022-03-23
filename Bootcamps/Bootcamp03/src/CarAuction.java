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

        //Add Bids
        car1.addBid(new Client(Utils.nextID(), "Lau", "Minely"), 10000,new Date(2022, Calendar.MARCH, 23));
        carArray.add(car1);

        //Closure statement - To assure user that a cas has been added to the car auction.
        System.out.println("A new Car: " + maker + " " + model + " " + modelYear + " has been added. ");
        System.out.println("--------------------------------------");

        //Car car2 = new Car();
        //car2.createCar("Audi", "TT", 2014);
        //carArray.add(car2);

        //Car car3 = new Car();
        //car3.createCar("Chevrolet", "Corvette", 2020);
        //carArray.add(car3);
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