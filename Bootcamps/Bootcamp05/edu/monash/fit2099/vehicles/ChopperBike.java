package Bootcamps.Bootcamp05.edu.monash.fit2099.vehicles;

import Bootcamps.Bootcamp05.edu.monash.fit2099.taxation.TaxableVehicle;

public class ChopperBike extends Vehicle implements TaxableVehicle {

    //Constructor
    public ChopperBike(String make, String model, int modelYear){
        super(make, model, modelYear);
        this.addToTaxationManager();
    }

    public ChopperBike(int vehicleId, String make, String model, int modelYear){
        super(vehicleId, make, model, modelYear);
        this.addToTaxationManager();
    }

    //Description Method
    public void description(){
        //Bike description
        System.out.println("MY"+ getModelYear() + " " + getMake() + " " + getModel());
    }

    //Calculate Tax
    public double calculateTaxRate(double price){
        return getModelYear()*0.001;
    }
}
