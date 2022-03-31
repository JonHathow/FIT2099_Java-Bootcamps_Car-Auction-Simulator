package Bootcamps.Bootcamp04.src.vehicles;

import Bootcamps.Bootcamp04.src.bids.Bid;
import Bootcamps.Bootcamp04.src.Utils;
import Bootcamps.Bootcamp04.src.bids.BidsManager;

import java.util.ArrayList;
import java.util.List;

abstract public class Vehicle {
    //Attributes
    private int vehicleID;
    private String make;
    private String model;
    private int modelYear;
    //Bids
    private BidsManager bidsManager = new BidsManager();

    //Methods
    //Car Constructors
    public void Vehicle(String make, String model, int modelYear){
        setVehicleID(Utils.nextID());
        setMake(make);
        setModel(model);
        setModelYear(modelYear);
    }

    public void Vehicle(int vehicleId, String make, String model, int modelYear){
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