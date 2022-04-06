package Bootcamps.Bootcamp05.edu.monash.fit2099.bids;

public class Bid {
    //Attributes
    private int bidId;
    private int clientId;
    private int bidPrice;
    private String bidDate;

    //Methods
    //Constructor
    public Bid(int newBidId, int newClientId, int newBidPrice, String newBidDate) {
        setBidId(newBidId);
        setClientId(newClientId);
        setBidPrice(newBidPrice);
        setBidDate(newBidDate);
    }

    //Getters
    public int getBidId() {
        return bidId;
    }

    public int getClientId() {
        return clientId;
    }

    public int getBidPrice() {
        return bidPrice;
    }

    public String getBidDate() {
        return bidDate;
    }

    //Setters
    public void setBidId(int bidId) {
        this.bidId = bidId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public void setBidPrice(int bidPrice) {
        this.bidPrice = bidPrice;
    }

    public void setBidDate(String bidDate) {
        this.bidDate = bidDate;
    }

    //Description Method
    public String description() {
        return "Id=" + getBidId() + ", buyerId=" + getClientId() + ", price=" + getBidPrice() + ", date=" + getBidDate();
    }
}