package Bootcamps.Bootcamp04.src;

import java.util.Scanner;

public class CarAuctionDriver{
    //Main
    public static void main(String[] args) {
        int selection;
        CarAuction carAuction1 = new CarAuction();
        //carAuction1.createCars();
        //carAuction1.displayCar();

        //Take in user input
        do{
            selection = mainMenuSelect();
            switch(selection){
                case 1:
                    System.out.println("Displaying Car Auction Status . . .");
                    System.out.println("-------------------------------------------");
                    carAuction1.printStatus();
                    System.out.println("-------------------------------------------");
                    break;
                case 2:
                    System.out.println("Adding car . . .");
                    carAuction1.createCars();
                    break;
                case 3:
                    //Exit option.
                    break;
                default:
                    System.out.println("Please select an valid option from the menu.");
                    break;
            }
        }while(selection != 3);
        System.out.println("Thank you for visiting FIT2099 Car Auction System");
    }

    public static int mainMenuSelect(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("Welcome to FIT2099 Car Auction Systems");
        System.out.println("==================================================");
        System.out.println("Please enter a number to select an option below:");
        System.out.println("1) Display Car Auction Status.");
        System.out.println("2) Add a car to the Car Auction.");
        System.out.println("3) Exit.");
        System.out.print("Please select an option: ");
        return scanner.nextInt();
    }
}