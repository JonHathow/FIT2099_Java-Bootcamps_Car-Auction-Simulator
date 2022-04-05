package Bootcamps.Bootcamp05.fit2099.vehicles;

import Bootcamps.Bootcamp05.fit2099.TaxableVehicle;

public class ChopperBike extends Vehicle implements TaxableVehicle {

    //Constructor
    public ChopperBike(String make, String model, int modelYear){
        super(make, model, modelYear);
    }

    public ChopperBike(int vehicleId, String make, String model, int modelYear){
        super(vehicleId, make, model, modelYear);
    }

    //Description Method
    public void description(){
        //Bike description
        System.out.println("MY"+ getModelYear() + " " + getMake() + " " + getModel() + "Type: ");
    }

    //Calculate Tax
    public double calculateTaxRate(double price){
        return getModelYear()*0.001;
    }
}
