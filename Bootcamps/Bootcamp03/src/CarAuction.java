package Bootcamps.Bootcamp03.src;
import java.util.ArrayList;
import java.util.List;

public class CarAuction{
    //Attributes - Car Array is a dynamic array list.
    private List<Car> carArray = new ArrayList<>();

    //Methods
    //Create Cars method - inserts 3 new cars into carArray.
    public void createCars() {
        Car car1 = new Car();
        car1.createCar("BMW", "X7", 2017);
        carArray.add(car1);

        Car car2 = new Car();
        car2.createCar("Audi", "TT", 2014);
        carArray.add(car2);

        Car car3 = new Car();
        car3.createCar("Chevrolet", "Corvette", 2020);
        carArray.add(car3);
    }

    //Display Car method - display cars in carArray;
    public void displayCar(){
        for (int i = 0; i < carArray.size(); i++){
            System.out.print("Car (" + (i + 1) + ") ");
            carArray.get(i).description();
        }

    }

    //Print Auction Status method
    public void printStatus(){
        System.out.println("Welcome to FIT2099 Car Auction Systems");
        createCars();
        displayCar();
        System.out.println("Thank you for visiting FIT2099 Car Auction System");
    }
}