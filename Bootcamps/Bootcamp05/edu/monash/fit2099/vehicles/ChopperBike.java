package Bootcamps.Bootcamp05.edu.monash.fit2099.vehicles;

import Bootcamps.Bootcamp05.edu.monash.fit2099.taxation.TaxableVehicle;

/**
 * The ChopperBike class handles the creation, characteristics and
 * behaviour of all chopper bikes present in the car auction. It represents
 * a generic chopper bike, and extends the vehicle class as it a type of vehicle.
 *
 * This is version 5 of this class, as it is from Week 5's Bootcamp.
 *
 * @author How Yu Chern
 * @version 5.0.0
 */
public class ChopperBike extends Vehicle implements TaxableVehicle {

    //Constructor
    /**
     * The ChopperBike contructor creates a new instance of a chopperbike.
     * @param vehicleId the chopper bike id number.
     * @param make the maker of the chopper bike.
     * @param model the model of the chopper bike.
     * @param modelYear the model year of the chopper bike.
     * @throws Exception when it's super class: Vehicle throws and exception due to incorrect maker, model, or modelYear.
     */
    public ChopperBike(int vehicleId, String make, String model, int modelYear) throws Exception{
        super(vehicleId, make, model, modelYear);
        this.addToTaxationManager();
    }

    //Description Method
    /**
     * String method that displays the details of a bobber bike.
     */
    public void description(){
        //Bike description
        System.out.println("MY"+ getModelYear() + " " + getMake() + " " + getModel());
    }

    //Calculate Tax
    /**
     * The calculateTaxRate method calculates the tax of the chopper bike.
     * @param price the price of the chopper bike.
     * @return the tax rate of the chopper bike.
     */
    public double calculateTaxRate(double price){
        return getModelYear()*0.001;
    }
}
