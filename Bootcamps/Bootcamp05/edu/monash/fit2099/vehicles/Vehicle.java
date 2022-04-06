package Bootcamps.Bootcamp05.edu.monash.fit2099.vehicles;

import Bootcamps.Bootcamp05.edu.monash.fit2099.Utils;
import Bootcamps.Bootcamp05.edu.monash.fit2099.bids.Bid;
import Bootcamps.Bootcamp05.edu.monash.fit2099.bids.BidsManager;

abstract public class Vehicle {
    //Attributes
    private int vehicleID;
    private String make;
    private String model;
    private int modelYear;
    //Bids
    private BidsManager bidsManager = new BidsManager();

    //Methods
    //Vehicle Constructors
    public Vehicle(String make, String model, int modelYear){
        setVehicleID(Utils.nextID());
        setMake(make);
        setModel(model);
        setModelYear(modelYear);

    }

    public Vehicle(int vehicleId, String make, String model, int modelYear){
        setVehicleID(vehicleId);
        setMake(make);
        setModel(model);
        setModelYear(modelYear);
    }

    //Add bid Mutator
    public void addBid(int clientId, int price, String date){
        bidsManager.addBid(clientId, price, date);
    }

    //Get bid Accessor
    public Bid getBid(int clientId){
        return bidsManager.getBid(clientId);
    }

    //Get Car Description
    public void description(){
        //Car description
        System.out.println("MY"+ getModelYear() + " " + getMake() + " " + getModel());
    }

    //Getters
    public int getVehicleID() {
        return vehicleID;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getModelYear() {
        return modelYear;
    }

    //Setters
    public void setVehicleID(int vehicleID) {
        this.vehicleID = vehicleID;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }
}