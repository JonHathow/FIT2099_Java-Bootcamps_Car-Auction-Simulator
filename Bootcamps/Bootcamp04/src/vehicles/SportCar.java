package Bootcamps.Bootcamp04.src.vehicles;

import Bootcamps.Bootcamp04.src.vehicles.Vehicle;

public class SportCar extends Vehicle {
    int seats;
    boolean isConvertible;

    //Constructors
    public SportCar(String make, String model, int modelYear, int seats, boolean isConvertible){
        setMake(make);
        setModel(model);
        setModelYear(modelYear);
    }

    public SportCar(int vehicleId, String make, String model, int modelYear, int seats, boolean isConvertible){
        setVehicleID(vehicleId);
        setMake(make);
        setModel(model);
        setModelYear(modelYear);
    }

    //Getter
    public int getSeats() {
        return seats;
    }
    public boolean getIsConvertible(){
        return isConvertible;
    }

    //Setter
    public void setSeats(int seats){
        this.seats = seats;
    }

    public void setIsConvertible(boolean isConvertible){
        this.isConvertible = isConvertible;
    }
}
