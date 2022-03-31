package Bootcamps.Bootcamp04.edu.monash.fit2099;

import java.util.Scanner;

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
                    carAuction.createCruiserBike();
                    break;
                case 3:
                    carAuction.displayFleet();
                    break;
                case 4:
                    carAuction.createClient();
                    break;
                case 5:
                    carAuction.displayClients();
                    break;
                case 6:
                    carAuction.createBid();
                    break;
                case 7:
                    //Exit option.
                    break;
                default:
                    System.out.println("Please select an valid option from the menu.");
                    break;
            }
        }while(selection != 7);
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
        System.out.println("2) New Cruiser Bike");
        System.out.println("3) Display Fleet");
        System.out.println("4) Add Client");
        System.out.println("5) List Clients");
        System.out.println("6) Add Bid");
        System.out.println("7) Exit");
        System.out.print("Please select an option: ");
        return scanner.nextInt();
    }
}