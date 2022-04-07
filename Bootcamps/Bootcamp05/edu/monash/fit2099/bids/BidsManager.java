package Bootcamps.Bootcamp05.edu.monash.fit2099.bids;

import Bootcamps.Bootcamp05.edu.monash.fit2099.Utils;

import java.util.HashMap;
import java.util.Map;

/**
 * BidsManager is a class that keeps track and manages all Bids placed in the car auction.
 *
 * This is version 5 of this class, as it is from Week 5's Bootcamp.
 *
 * @author How Yu Chern
 * @version 5.0.0
 */
public class BidsManager {
    /**
     * Hashmap that keeps track of all bids placed in the car auction. Maps each Bid to
     * the client who placed it, via the client's Id number.
     */
    private Map<Integer, Bid> bids = new HashMap<Integer, Bid>();

    //Add Bid Method
    /**
     * A add bid method that adds a bid to the BidsManager Hashmap.
     * @param clientId the id number of the client placing the bid.
     * @param bidPrice the price of the bid.
     * @param bidDate the date that the bid was placed.
     */
    public void addBid(int clientId, int bidPrice, String bidDate){
        Bid newBid = new Bid(Utils.nextID(),clientId,bidPrice, bidDate);
        bids.put(clientId, newBid);
    }

    //Get Bid Method
    /**
     * A get bid method that retrieves a bid from BidsManager.
     * @param clientId the id number of the client whom placed the bid.
     * @return a bid instance, the bid placed by the client.
     */
    public Bid getBid(int clientId){
       return bids.get(clientId);
    }

}
