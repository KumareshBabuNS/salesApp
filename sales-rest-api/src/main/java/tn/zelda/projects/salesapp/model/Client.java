package tn.zelda.projects.salesapp.model;

/**
 * Created by zelda on 27/01/17.
 */
public class Client {

    String firstName;
    String address;


    public Client(String firstName, String address) {
        this.firstName = firstName;
        this.address = address;
    }

    public Client() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

}
