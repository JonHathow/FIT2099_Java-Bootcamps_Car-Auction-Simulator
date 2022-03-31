package Bootcamps.Bootcamp04.src.vehicles;

import Bootcamps.Bootcamp04.src.Utils;
import Bootcamps.Bootcamp04.src.vehicles.Vehicle;

public class CruiserBike extends Vehicle {

    CruiserBikeType type;

    //Constructor
    public CruiserBike(String make, String model, int modelYear, CruiserBikeType type){
        setVehicleID(Utils.nextID());
        setMake(make);
        setModel(model);
        setModelYear(modelYear);
        setType(type);
    }

    public CruiserBike(int vehicleId, String make, String model, int modelYear, CruiserBikeType type){
        setVehicleID(vehicleId);
        setMake(make);
        setModel(model);
        setModelYear(modelYear);
    }

    //Description Method
    @Override
    public void description(){
        //Bike description
        System.out.println("MY"+ getModelYear() + " " + getMake() + " " + getModel() + "Type: " + getType());
    }

    //Setter
    public void setType(CruiserBikeType type) {
        this.type = type;
    }

    //Getter
    public CruiserBikeType getType() {
        return type;
    }
}
