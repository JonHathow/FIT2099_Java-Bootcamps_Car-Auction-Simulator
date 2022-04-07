package Bootcamps.Bootcamp05.edu.monash.fit2099.taxation;

import Bootcamps.Bootcamp05.edu.monash.fit2099.vehicles.Vehicle;

import java.util.ArrayList;

/**
 * TaxationManager is a class that keeps track and manages all taxable vehicles.
 *
 * This is version 1, the first update of this interface.
 * @author FIT2099 Teaching Team
 * @version 1.0.0
 */
public class TaxationManager {
    //Attributes
    /**
     * The array list that will store all taxable vehicles that is managed by TaxationManager.
     */
    private ArrayList<TaxableVehicle> taxableVehicleList;

    /**
     * A static instance of TaxationManager.
     */
    private static TaxationManager instance;

    //Methods
    /**
     * TaxationManager constructor that creates an ArrayList for Taxable Vehicles.
     */
    private TaxationManager() { // 1-  private to prevent anyone else from instantiating
        taxableVehicleList = new ArrayList<>();
    }

    /**
     * Public static factory method of TaxationManager, to create a new instance
     * of TaxationManager
     * @return a new instance of TaxationManager.
     */
    public static TaxationManager getInstance() {
        if (instance == null) {
            instance = new TaxationManager();
        }
        return instance;
    }

    /**
     * A method to add a taxable vehicle to the TaxationManager ArrayList.
     * @param item the taxable vehicle to be added.
     */
    public void appendTaxableItem(TaxableVehicle item) {
        this.taxableVehicleList.add(item);
    }

    /**
     * A method to get the ArrayList of taxable vehicles, and return all taxable vehicles
     * that are being managed by TaxationManager.
     * @return an ArrayList of taxable vehicles.
     */
    public ArrayList<TaxableVehicle> getTaxableVehicles() {
        return new ArrayList<TaxableVehicle>(this.taxableVehicleList);
    }

    /**
     * A method to get a specific taxable vehicle from the TaxationManager ArrayList.
     * @param vehicleObj the taxable vehicle to be retrieved.
     * @return The taxable vehicle if present in TaxationManager, otherwise null.
     */
    public TaxableVehicle getTaxableVehicle(Vehicle vehicleObj){
        for(TaxableVehicle vehicle : taxableVehicleList){
            if(vehicle.equals(vehicleObj)) {
                return vehicle;
            }
        }
        return null;
    }
}
