package Bootcamps.Bootcamp05.edu.monash.fit2099.clients;

/**
 * The Client class handles the creation and operations of all clients which participate
 * in the car auction.
 *
 * This is version 5 of this class, as it is from Week 5's Bootcamp.
 *
 * @author How Yu Chern
 * @version 5.0.0
 */
public class Client {
    //Attributes
    private int clientId;
    private String firstName;
    private String lastName;

    //Methods
    //Constructors

    //Old Constructors
//    private Client (int clientId){
//        setClientId(clientId);
//    }

//    private Client(int clientId, String firstName, String lastName){
//        setClientId(clientId);
//        setFirstName(firstName);
//        setLastName(lastName);
//    }

    //Zero parameter Constructor
    /**
     * Zero parameter constructor for client, that is used in the getInstance
     * static factory method.
     */
    private Client() {
    }

    //Static Factory Method
    /**
     * Public static factory method for other classes to create instances of the client
     * class.
     *
     * @param firstName the first name of the client.
     * @param lastName the last name of the client.
     * @return a client instance if the first name and last name are of correct format, otherwise null.
     */
    public static Client getInstance(String firstName, String lastName) {
        Client client = new Client();
        if (!(client.setFirstName(firstName) && client.setLastName(lastName)))
            client = null;
        return (client);
    }

    //Setters
    /**
     * Setter for client Id number.
     * @param clientId The id number of the client.
     */
    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    /**
     * Setter for the first name of the client.
     * @param firstName The first name of the client, an alphabetic word of length 2 to 15.
     * @return a boolean verifier, where true for setting of correct format first name, and false otherwise.
     */
    public boolean setFirstName(String firstName) {
        boolean isValid = false;
        if (firstName.length() >= 2 && firstName.length() <= 15) {
            isValid = true;
            this.firstName = firstName;
        }
        return isValid;

    }

    /**
     * Setter for the last name of the client.
     * @param lastName The last name of the client, an alphabetic word of length 2 to 15.
     * @return a boolean verifier, where true for setting of correct format last name, and false otherwise.
     */
    public boolean setLastName(String lastName) {
        boolean isValid = false;
        if (lastName.length() >= 2 && lastName.length() <= 15) {
            isValid = true;
            this.lastName = lastName;
        }
        return isValid;
    }

    //Getter
    /**
     * Getter for client Id number.
     * @return the client's Id number.
     */
    public int getClientId() {
        return clientId;
    }

    /**
     * Getter for client's first name.
     * @return the client's first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Getter for client's last name.
     * @return the client's last name.
     */
    public String getLastName() {
        return lastName;
    }

    //Description Method

    /**
     * String method to print out the description of the client.
     * @return A string containing the client's Id, first name, and last name.
     */
    public String description(){
        return getClientId() + " " + getFirstName() + " " + getLastName();
    }
}
