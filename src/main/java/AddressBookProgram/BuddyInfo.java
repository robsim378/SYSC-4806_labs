package AddressBookProgram;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class BuddyInfo {

    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String address;
    private String phoneNumber;

    /**
     * Constructor for a AddressBookProgram.BuddyInfo. Takes the name, address, and phone number as parameters.
     * @param name Buddy's name as a String
     * @param address Buddy's address as a String
     * @param phoneNumber Buddy's phone number as a String
     */
    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public BuddyInfo() {
        this.name = "NoName";
        this.address = "Homeless";
        this.phoneNumber = "";
    }

    /**
     * Getter for the buddy's name
     * @return Buddy's name as a String
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for the buddy's address
     * @return Buddy's address as a String
     */
    public String getAddress() {
        return address;
    }

    /**
     * Getter for the buddy's phone number
     * @return Buddy's phone number as a String
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getId() {
        return id;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" / ").append(address).append(" / ").append(phoneNumber);

        return sb.toString();
    }

    public boolean equals(BuddyInfo buddyInfo) {
        return name.equals(buddyInfo.getName())
                && address.equals(buddyInfo.getAddress())
                && phoneNumber.equals(buddyInfo.getPhoneNumber());
    }
}
