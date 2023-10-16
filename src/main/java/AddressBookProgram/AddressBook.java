package AddressBookProgram;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;

import java.util.List;

@Entity
public class AddressBook implements Serializable {

    @Id
    @GeneratedValue
    int id;

    @OneToMany (fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<BuddyInfo> buddies;

    public AddressBook() {
        buddies = new ArrayList<>();
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * Adds a buddy to the AddressBookProgram.AddressBook
     * @param buddy The buddy to be added, stored as a AddressBookProgram.BuddyInfo
     */
    public void addBuddy(BuddyInfo buddy) {
        buddies.add(buddy);
    }

    public void setBuddies(List<BuddyInfo> buddies) {
        this.buddies = buddies;
    }

    /**
     * Removes a buddy from the AddressBookProgram.AddressBook
     * @param buddy The buddy to be removed, stored as a AddressBookProgram.BuddyInfo
     */
    public void removeBuddy(BuddyInfo buddy) {
        buddies.remove(buddy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (BuddyInfo b : buddies) {
            sb.append(b.getName()).append(" / ").append(b.getAddress()).append(" / ").append(b.getPhoneNumber()).append("\n");
        }

        return sb.toString();
    }

    public List<BuddyInfo> getBuddies() {
        return buddies;
    }

    public int getId() {
        return id;
    }

//    public static void main(String[] args) {
//        AddressBook my_addressbook = new AddressBook();
//
//        BuddyInfo Isaac = new BuddyInfo("Isaac", "Isaac's House", "Isaac's Phone");
//        BuddyInfo Ian = new BuddyInfo("Ian", "Ian's House", "Ian's Phone");
//        BuddyInfo Liam = new BuddyInfo("Liam", "Liam's House", "Liam's Phone");
//
//        my_addressbook.addBuddy(Isaac);
//        my_addressbook.addBuddy(Ian);
//        my_addressbook.addBuddy(Liam);
//
//        for (int i = 0; i < my_addressbook.getBuddies().size(); i++)
//        {
//            System.out.print(my_addressbook.getBuddies().get(i).getName());
//            System.out.print(" | ");
//            System.out.print(my_addressbook.getBuddies().get(i).getAddress());
//            System.out.print(" | ");
//            System.out.println(my_addressbook.getBuddies().get(i).getPhoneNumber());
//        }
//    }
}


