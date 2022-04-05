package Bootcamps.Bootcamp05.fit2099.bids;

import Bootcamps.Bootcamp05.fit2099.Utils;

import java.util.HashMap;
import java.util.Map;

public class BidsManager {
    private Map<Integer, Bid> bids = new HashMap<Integer, Bid>();

    //Setters
    //Add Bid Method
    public void addBid(int clientId, int bidPrice, String bidDate){
        Bid newBid = new Bid(Utils.nextID(),clientId,bidPrice, bidDate);
        bids.put(clientId, newBid);
    }

    //Getters
    //Get Bid Method
    public Bid getBid(int clientId){
       return bids.get(clientId);
    }

}
