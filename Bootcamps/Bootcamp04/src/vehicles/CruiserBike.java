package Bootcamps.Bootcamp04.src.vehicles;

import Bootcamps.Bootcamp04.src.Utils;
import Bootcamps.Bootcamp04.src.vehicles.Vehicle;

public class CruiserBike extends Vehicle {

    CruiserBikeType type;

    //Constructor
    public void CruiserBike(String make, String model, int modelYear, CruiserBikeType type){
        setVehicleID(Utils.nextID());
        setMake(make);
        setModel(model);
        setModelYear(modelYear);
        setType(type);
    }

    public void CruiserBike(int vehicleId, String make, String model, int modelYear, CruiserBikeType type){
        setVehicleID(vehicleId);
        setMake(make);
        setModel(model);
        setModelYear(modelYear);
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
