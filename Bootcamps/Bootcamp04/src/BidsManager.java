package Bootcamps.Bootcamp04.src;

import java.util.HashMap;
import java.util.Map;

public class BidsManager {
    Map<Integer,Bid> bids = new HashMap<Integer, Bid>();

    //Setters
    //Add Bid Method
    public void addBid(int newClientId, int newBidPrice, String newBidDate){
        Bid newBid = new Bid(Utils.nextID(),newClientId,newBidPrice, newBidDate);
        bids.put(newClientId, newBid);
    }
}
