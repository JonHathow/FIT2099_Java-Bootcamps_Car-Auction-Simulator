package Bootcamps.Bootcamp04.edu.monash.fit2099.vehicles;

import Bootcamps.Bootcamp03.src.Utils;

public class SportCar extends Vehicle {
    private int seats;
    private boolean isConvertible;

    //Constructors
    public SportCar(String make, String model, int modelYear, int seats, boolean isConvertible){
        super(make, model, modelYear);
        setSeats(seats);
        setIsConvertible(isConvertible);
    }

    public SportCar(int vehicleId, String make, String model, int modelYear, int seats, boolean isConvertible){
        super(vehicleId, make, model, modelYear);
        setSeats(seats);
        setIsConvertible(isConvertible);
    }

    //Description Method
    public void description(){
        //Car description
        System.out.println("MY"+ getModelYear() + " " + getMake() + " " + getModel() + "Seats: " + getSeats() + " Is Convertible: " + getIsConvertible());
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
