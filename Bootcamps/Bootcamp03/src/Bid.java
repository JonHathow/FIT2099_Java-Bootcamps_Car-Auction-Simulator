package Bootcamps.Bootcamp03.src;
import java.util.Date;

public class Bid {
    //Attributes
    private int bidId;
    private Client client;
    private int bidPrice;
    private Date bidDate;

    //Methods
    //Constructor
    public Bid(int newBidId, Client newClient, int newBidPrice, Date newBidDate){
        setBidId(newBidId);
        setClient(newClient);
        setBidPrice(newBidPrice);
        setBidDate(newBidDate);
    }

    //Getters
    public int getBidId() {
        return bidId;
    }

    public Client getClient() {
        return client;
    }

    public int getBidPrice() {
        return bidPrice;
    }

    public Date getBidDate() {
        return bidDate;
    }

    //Setters
    public void setBidId(int bidId) {
        this.bidId = bidId;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setBidPrice(int bidPrice) {
        this.bidPrice = bidPrice;
    }

    public void setBidDate(Date bidDate) {
        this.bidDate = bidDate;
    }
}
