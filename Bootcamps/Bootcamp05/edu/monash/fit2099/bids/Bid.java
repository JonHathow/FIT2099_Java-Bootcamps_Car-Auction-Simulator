package Bootcamps.Bootcamp05.edu.monash.fit2099.bids;

/**
 * The Bid class represents a generic Bid, and handles the creation, characteristics and
 * behaviour of all bids which are placed by clients in the car auction.
 *
 * This is version 5 of this class, as it is from Week 5's Bootcamp.
 *
 * @author How Yu Chern
 * @version 5.0.0
 */
public class Bid {
    //Attributes
    /**
     * The Id number of the Bid.
     */
    private int bidId;

    /**
     * The Id number of the client placing the bid.
     */
    private int clientId;

    /**
     * The price of the bid specified by the client.
     */
    private int bidPrice;

    /**
     * The Date the bid was placed.
     */
    private String bidDate;

    //Methods
    //Constructor
    /**
     * A Constructor that creates an instance of a Bid.
     * @param bidId The bid Id number.
     * @param clientId The client Id number, of the client who is placing the bid.
     * @param bidPrice The price of the bid specified by the client.
     * @param bidDate The date the bid was placed.
     */
    public Bid(int bidId, int clientId, int bidPrice, String bidDate) {
        setBidId(bidId);
        setClientId(clientId);
        setBidPrice(bidPrice);
        setBidDate(bidDate);
    }

    //Getters

    /**
     * Getter to retrieve the bid Id number.
     * @return the bid Id number.
     */
    public int getBidId() {
        return bidId;
    }

    /**
     * Getter to retrieve the client Id number.
     * @return the Id number of the client who placed the bid.
     */
    public int getClientId() {
        return clientId;
    }

    /**
     * Getter to retrieve the bid price.
     * @return the bid price.
     */
    public int getBidPrice() {
        return bidPrice;
    }

    /**
     * Getter to retrieve the bid date.
     * @return the date the bid was placed.
     */
    public String getBidDate() {
        return bidDate;
    }

    //Setters

    /**
     * Setter to set the bid Id number.
     * @param bidId the id number of the new bid.
     */
    public void setBidId(int bidId) {
        this.bidId = bidId;
    }

    /**
     * Setter to set the client Id number for the new bid.
     * @param clientId the Id number of the client who placed the new bid.
     */
    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    /**
     * Setter to set the price of the new bid.
     * @param bidPrice The bid price of the new bid.
     */
    public void setBidPrice(int bidPrice) {
        this.bidPrice = bidPrice;
    }

    /**
     * Setter to set the new bid date.
     * @param bidDate the date the new bid was placed.
     */
    public void setBidDate(String bidDate) {
        this.bidDate = bidDate;
    }

    //Description Method
    /**
     * String method to return the bid Id, the client Id, the price, and the date of
     * a bid.
     * @return A string containing the the bid Id, the client Id, the price, and the date of
     *      * a bid.
     */
    public String description() {
        return "Id=" + getBidId() + ", buyerId=" + getClientId() + ", price=" + getBidPrice() + ", date=" + getBidDate();
    }
}