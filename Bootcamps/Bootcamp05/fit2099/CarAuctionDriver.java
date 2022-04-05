package Bootcamps.Bootcamp05.fit2099;

import java.util.Scanner;

/**
 * CarAuctionDriver class is the main class which runs the Car Auction code. It also
 * presents the main console based menu for the user to interact with the car auction.
 * This is version 5 of this class, as it is from Week 5's Bootcamp.
 *
 * @author How Yu Chern
 * @version 5.0.0
 */
public class CarAuctionDriver{
    //Main
    public static void main(String[] args) {
        int selection;
        CarAuction carAuction = new CarAuction();

        //Handle user input
        do{
            selection = mainMenuSelect();
            switch(selection){
                case 1:
                    carAuction.createSportsCars();
                    break;
                case 2:
                    carAuction.createChopperBike();
                    break;
                case 3:
                    carAuction.createBobberBike();
                    break;
                case 4:
                    carAuction.displayFleet();
                    break;
                case 5:
                    carAuction.createClient();
                    break;
                case 6:
                    carAuction.displayClients();
                    break;
                case 7:
                    carAuction.createBid();
                    break;
                case 8:
                    //Exit option.
                    break;
                default:
                    System.out.println("Please select an valid option from the menu.");
                    break;
            }
        }while(selection != 8);
        System.out.println("Thank you for visiting FIT2099 Car Auction System");
    }

    //Method to print menu
    public static int mainMenuSelect(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("+----------------------------------+");
        System.out.println("|        Welcome to Bootcamp       |");
        System.out.println("|             Week 4               |");
        System.out.println("+----------------------------------+");
        System.out.println("1) New Sport Car");
        System.out.println("2) New Chopper Bike");
        System.out.println("3) New Bobber Bike");
        System.out.println("4) Display Fleet");
        System.out.println("5) Add Client");
        System.out.println("6) List Clients");
        System.out.println("7) Add Bid");
        System.out.println("8) Exit");
        System.out.print("Please select an option: ");
        return scanner.nextInt();
    }
}