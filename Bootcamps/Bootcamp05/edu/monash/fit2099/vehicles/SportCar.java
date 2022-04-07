package Bootcamps.Bootcamp05.edu.monash.fit2099.vehicles;

import Bootcamps.Bootcamp05.edu.monash.fit2099.taxation.TaxableVehicle;

/**
 * The SportCar class handles the creation, characteristics and
 * behaviour of all sport cars present in the car auction. It represents
 * a generic sport car, and extends the vehicle class as it a type of vehicle.
 *
 * This is version 5 of this class, as it is from Week 5's Bootcamp.
 *
 * @author How Yu Chern
 * @version 5.0.0
 */
public class SportCar extends Vehicle implements TaxableVehicle {
    //Attributes
    /**
     * The number of seats of the sport car.
     */
    private int seats;
    /**
     * The "is convertible" status of the sport car (true = is convertible, false = is not convertible).
     */
    private boolean isConvertible;

    //Constructors
    /**
     * The SportCar contructor creates a new instance of a SportCar.
     * @param vehicleId the sport car id number.
     * @param make the maker of the sport car.
     * @param model the model of the sport car.
     * @param modelYear the model year of the sport car.
     * @param seats the number of seats of the sport car.
     * @param isConvertible the "is convertible" status of the sport car (true = is convertible, false = is not convertible).
     * @throws Exception when it's super class: Vehicle throws and exception due to incorrect maker, model, or modelYear, or this constructor throws an exception due to incorrect seats number.
     *
     */
    public SportCar(int vehicleId, String make, String model, int modelYear, int seats, Boolean isConvertible) throws Exception {
        super(vehicleId, make, model, modelYear);
        if (!setSeats(seats)) {
            setIsConvertible(isConvertible);
        } else {
            throw new Exception("Incorrect Vehicle's Seats.");
        }
    }

    //Description Method
    /**
     * String method that displays the details of the sport car.
     */
    public void description(){
        //Car description
        System.out.println("MY"+ getModelYear() + " " + getMake() + " " + getModel() + " Seats: " + getSeats() + " Is Convertible: " + getIsConvertible());
    }

    //Calculate Tax Method
    /**
     * The method calculateTaxRate calculates the tax rate of the sport car.
     * @param price the price of the sport car.
     * @return the tax rate of the sport car.
     */
    public double calculateTaxRate(double price){
        double taxRate;

        if (isConvertible) {
            taxRate = (seats * 0.01);
        } else {
            taxRate = (price * 0.02);
        }

        return taxRate;
    }

    //Getter
    /**
     * Getter for the number of seats of the sport car.
     * @return the number of seats of the sport car.
     */
    public int getSeats() {
        return seats;
    }

    /**
     * The getter for the "is convertible" status of the sport car.
     * @return the "is convertible" status of the sport car (true = is convertible, false = is not convertible).
     */
    public boolean getIsConvertible(){
        return isConvertible;
    }

    //Setter
    /**
     * Getter for the number of seats of the sport car.
     * @param seats the number of seats of the sport car, where seats must be within 2 to 5.
     * @return true if correct number of seats, false otherwise.
     */
    public boolean setSeats(int seats){
        boolean isValid = false;
        if (seats >= 2 && seats <= 5) {
            isValid = true;
            this.seats = seats;
        }
        return isValid;
    }

    /**
     * Setter for the "is convertible" status of the sport car.
     * @param isConvertible the "is convertible" status of the sport car (true = is convertible, false = is not convertible).
     */
    public void setIsConvertible(boolean isConvertible){
        this.isConvertible = isConvertible;
    }
}
