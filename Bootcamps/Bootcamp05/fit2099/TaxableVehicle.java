package Bootcamps.Bootcamp05.fit2099;

/**
 * TaxableVehicle is an interface that defines the behaviour for vehicles in the car auction
 * which can be subjected to tax.
 * This is version 1, the first update of this interface.
 *
 * @author How Yu Chern
 * @version 1.0.0
 */
public interface TaxableVehicle {

    /**
     * A method to calculate the tax rate of the vehicle.
     * @param price the Price of the vehicle.
     */
    public double calculateTaxRate(double price);
}
