package Bootcamps.Bootcamp05.edu.monash.fit2099.vehicles;

import Bootcamps.Bootcamp05.edu.monash.fit2099.bids.Bid;
import Bootcamps.Bootcamp05.edu.monash.fit2099.bids.BidsManager;

/**
 * The Vehicle class handles the creation, characteristics and
 * behaviour of all vehicles present in the car auction. It represents
 * a generic vehicle.
 *
 * This is version 5 of this class, as it is from Week 5's Bootcamp.
 *
 * @author How Yu Chern
 * @version 5.0.0
 */
abstract public class Vehicle {
    //Attributes
    /**
     * The id number of the vehicle.
     */
    private int vehicleID;
    /**
     * The maker of the vehicle.
     */
    private String make;
    /**
     * The model of the vehicle.
     */
    private String model;
    /**
     * The model year of the vehicle.
     */
    private int modelYear;
    //Bids
    /**
     * An instance of BidManager to keep track of bids placed on the vehicle by clients.
     */
    private BidsManager bidsManager = new BidsManager();

    //Methods
    //Vehicle Constructors
    /**
     * The Vehicle contructor creates a new instance of a vehicle.
     * @param vehicleId The id number of the vehicle.
     * @param make The maker of the vehicle.
     * @param model The model of the vehicle.
     * @param modelYear The model year of the vehicle.
     * @throws Exception when maker, model, or model year is incorrect in format.
     */
    public Vehicle(int vehicleId, String make, String model, Integer modelYear) throws Exception {
        if (setMake(make) && setModel(model) && setModelYear((modelYear))) {
            setVehicleID(vehicleId);
        } else {
            throw new Exception("Incorrect Vehicle's Maker, Model or Make/Model Year ");
        }
    }

    //Add bid Mutator
    /**
     * The addBid method adds a bid to the vehicle.
     * @param clientId the id number of the client who placed the bid.
     * @param price the price of the bid.
     * @param date the date the bid was placed.
     */
    public void addBid(int clientId, int price, String date){
        bidsManager.addBid(clientId, price, date);
    }

    //Get bid Accessor
    /**
     * Getter to get a bid from the vehicle.
     * @param clientId the id of the client who placed the bid.
     * @return the Bid (Bid instance) placed by the client.
     */
    public Bid getBid(int clientId){
        return bidsManager.getBid(clientId);
    }

    //Get Vehicle description
    /**
     *  String method to display the details of the vehicle.
     */
    public void description(){
        //Car description
        System.out.println("MY"+ getModelYear() + " " + getMake() + " " + getModel());
    }

    //Getters
    /**
     * Getter for the vehicle id number.
     * @return the id number of the vehicle.
     */
    public int getVehicleID() {
        return vehicleID;
    }

    /**
     * Getter for the maker of the vehicle.
     * @return the maker of the vehicle.
     */
    public String getMake() {
        return make;
    }

    /**
     * Getter for the model of the vehicle.
     * @return the model of the vehicle.
     */
    public String getModel() {
        return model;
    }

    /**
     * Getter for the model year of the vehicle.
     * @return the model year of the vehicle.
     */
    public int getModelYear() {
        return modelYear;
    }

    //Setters
    /**
     * Setter for the id number of the vehicle.
     * @param vehicleID the id number of the vehicle.
     */
    public void setVehicleID(int vehicleID) {
        this.vehicleID = vehicleID;
    }

    /**
     * Setter for the maker of the vehicle.
     * @param make the maker of the vehicle, where the maker must be within 3 to 15 characters.
     * @return true is correct maker name format, otherwise false.
     */
    public boolean setMake(String make) {
        boolean isValid = false;
        if (make.length() >= 3 && make.length() <= 15) {
            isValid = true;
            this.make = make;
        }
        return isValid;
    }

    /**
     * Setter for the model of the vehicle.
     * @param model the model of the vehicle, where the maker must be within 3 to 15 characters.
     * @return true is correct model name format, otherwise false.
     */
    public boolean setModel(String model) {
        boolean isValid = false;
        if (model.length() >= 3 && model.length() <= 15) {
            isValid = true;
            this.model = model;
        }
        return isValid;
    }

    /**
     * Setter for the model year of the vehicle.
     * @param modelYear the model of the vehicle, where the model year must be more than 1000.
     * @return true is correct model year format, otherwise false.
     */
    public boolean setModelYear(int modelYear) {
        boolean isValid = false;
        if (modelYear > 1000) {
            isValid = true;
            this.modelYear = modelYear;
        }
        return isValid;
    }
}