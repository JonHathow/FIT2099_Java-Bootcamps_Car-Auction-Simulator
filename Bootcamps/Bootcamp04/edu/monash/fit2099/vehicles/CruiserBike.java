package Bootcamps.Bootcamp04.edu.monash.fit2099.vehicles;

import Bootcamps.Bootcamp04.edu.monash.fit2099.Utils;

public class CruiserBike extends Vehicle {

    CruiserBikeType type;

    //Constructor
    public CruiserBike(String make, String model, int modelYear, CruiserBikeType type){
        super(make, model, modelYear);
        setType(type);
    }

    public CruiserBike(int vehicleId, String make, String model, int modelYear, CruiserBikeType type){
        super(vehicleId, make, model, modelYear);
        setType(type);
    }

    //Description Method
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
