package Bootcamps.Bootcamp05.edu.monash.fit2099.vehicles;

/**
 * The BobberBike class handles the creation, characteristics and
 * behaviour of all bobber bikes present in the car auction. It represents
 * a generic bobber bike, and extends the vehicle class as it a type of vehicle.
 *
 * This is version 5 of this class, as it is from Week 5's Bootcamp.
 *
 * @author How Yu Chern
 * @version 5.0.0
 */
public class BobberBike extends Vehicle {

    //Constructor
    /**
     * The Bobberbike contructor creates a new instance of a bobberbike.
     * @param vehicleId the bobber bike id number.
     * @param make the maker of the bobber bike.
     * @param model the model of the bobber bike.
     * @param modelYear the model year of the bobber bike.
     * @throws Exception when it's super class: Vehicle throws and exception due to incorrect maker, model, or modelYear.
     */
    public BobberBike(int vehicleId, String make, String model, int modelYear) throws Exception{
        super(vehicleId, make, model, modelYear);
    }

    //Description Method
    /**
     * String method to displays the details of a bobber bike.
     */
    public void description(){
        //Bike description
        System.out.println("MY"+ getModelYear() + " " + getMake() + " " + getModel());
    }
}
