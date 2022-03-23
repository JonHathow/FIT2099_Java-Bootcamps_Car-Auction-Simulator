package Bootcamps.Bootcamp03.src;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Car{
    //Attributes
    private String make;
    private String model;
    private int modelYear;
    //Bids
    private List<Bid> bids = new ArrayList<>();

    //Methods
    //Add bid
    public void addBid(Client newClient, int newPrice, Date newDate){
        bids.add(new Bid(Utils.nextID(), newClient, newPrice, newDate));
    }

    //Get Car Description
    public void description(){
        System.out.println("MY"+ getModelYear() + " " + getMake() + " " + getModel());
    }

    //Car Constructor
    public void createCar(String make, String model, int modelYear){
        setMake(make);
        setModel(model);
        setModelYear(modelYear);
    }

    //Getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getModelYear() {
        return modelYear;
    }

    //Setters
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }
}