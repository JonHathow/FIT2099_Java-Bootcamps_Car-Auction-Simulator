package Bootcamps.Bootcamp05.fit2099.vehicles;

import Bootcamps.Bootcamp05.fit2099.taxation.TaxableVehicle;

public class SportCar extends Vehicle implements TaxableVehicle {
    private int seats;
    private boolean isConvertible;

    //Constructors
    public SportCar(String make, String model, int modelYear, int seats, boolean isConvertible){
        super(make, model, modelYear);
        setSeats(seats);
        setIsConvertible(isConvertible);
        this.addToTaxationManager();
    }

    public SportCar(int vehicleId, String make, String model, int modelYear, int seats, boolean isConvertible){
        super(vehicleId, make, model, modelYear);
        setSeats(seats);
        setIsConvertible(isConvertible);
        this.addToTaxationManager();
    }

    //Description Method
    public void description(){
        //Car description
        System.out.println("MY"+ getModelYear() + " " + getMake() + " " + getModel() + " Seats: " + getSeats() + " Is Convertible: " + getIsConvertible());
    }

    //Calculate Tax Method
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
