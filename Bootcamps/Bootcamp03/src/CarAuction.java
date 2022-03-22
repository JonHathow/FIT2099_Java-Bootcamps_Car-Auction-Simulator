package Bootcamps.Bootcamp03.src;

public class CarAuction{
    //Attributes - Car Array of max size 3.
    private Car[] carArray = new Car[3];

    //Methods
    //Create Cars method - inserts 3 new cars into carArray.
    public void createCars() {
        Car car1 = new Car();
        car1.createCar("BMW", "X7", 2017);
        carArray[0] = car1;

        Car car2 = new Car();
        car2.createCar("Audi", "TT", 2014);
        carArray[1] = car2;

        Car car3 = new Car();
        car3.createCar("Chevrolet", "Corvette", 2020);
        carArray[2] = car3;
    }

    //Display Car method - display cars in carArray;
    public void displayCar(){
        for (int i = 0; i < carArray.length; i++){
            System.out.print("Car (" + (i + 1) + ") ");
            carArray[i].getCarDescription();
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