package Bootcamps.Bootcamp03.src;

public class Client {
    //Attributes
    private int clientId;
    private String firstName;
    private String lastName;

    //Methods
    //Constructors
    public Client(int newClientId){
        setClientId(newClientId);
    }

    public Client(int newClientId, String newFirstName, String newLastName){
        setClientId(newClientId);
        setFirstName(newFirstName);
        setLastName(newLastName);
    }

    //Setters
    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Getter
    public int getClientId() {
        return clientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    //Client String Method
    public String description(){
        return getClientId() + " " + getFirstName() + " " + getLastName();
    }
}
