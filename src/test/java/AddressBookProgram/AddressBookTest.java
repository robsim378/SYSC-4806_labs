package AddressBookProgram;

import org.junit.Test;

/**
 * Class containing required unit tests for lab 8, namely tests for saving/loading to a text file, serialized, and to an
 * XML file.
 */
public class AddressBookTest {
    @Test
    public void testGettersAndSetters()
    {
        AddressBook testAddressBook = new AddressBook();
        BuddyInfo Isaac = new BuddyInfo("Isaac", "Isaac's House", "Isaac's Phone");
        testAddressBook.addBuddy(Isaac);
        assert testAddressBook.getBuddies().get(0).getName().equals("Isaac");
        assert testAddressBook.getBuddies().get(0).getAddress().equals("Isaac's House");
        assert testAddressBook.getBuddies().get(0).getPhoneNumber().equals("Isaac's Phone");
    }


}