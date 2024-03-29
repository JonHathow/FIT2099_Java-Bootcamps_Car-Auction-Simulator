package Bootcamps.Bootcamp03.src;
import java.util.ArrayList;
import java.util.List;

public class Car{
    //Attributes
    private String make;
    private String model;
    private int modelYear;
    //Bids
    private List<Bid> bids = new ArrayList<>();

    //Methods
    //Add bid Mutator
    public void addBid(Client newClient, int newPrice, String newDate){
        bids.add(new Bid(Utils.nextID(), newClient, newPrice, newDate));
    }
    //Get bid Accessor
    public Bid getBid(int index){
        return bids.get(index);
    }

    //Get Car Description Method
    public void description(){
        //Car description
        System.out.println("MY"+ getModelYear() + " " + getMake() + " " + getModel());
        System.out.println("Bids: ");

        //Bids and Clients description.
        if (bids.size() > 0){
            for (Bid bid:bids) {
                System.out.println(bid.description());
            }
        } else {
            System.out.println("None");
        }
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