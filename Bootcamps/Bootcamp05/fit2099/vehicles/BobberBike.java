package Bootcamps.Bootcamp05.fit2099.vehicles;

public class BobberBike extends Vehicle {

    //Constructor
    public BobberBike(String make, String model, int modelYear){
        super(make, model, modelYear);
    }

    public BobberBike(int vehicleId, String make, String model, int modelYear){
        super(vehicleId, make, model, modelYear);
    }

    //Description Method
    public void description(){
        //Bike description
        System.out.println("MY"+ getModelYear() + " " + getMake() + " " + getModel());
    }
}
