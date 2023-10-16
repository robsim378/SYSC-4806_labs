package AddressBookProgram;

import org.junit.Test;

public class BuddyInfoTest {
    @Test
    public void testGettersAndSetters()
    {
        BuddyInfo Isaac = new BuddyInfo("Isaac", "Isaac's House", "Isaac's Phone");
        assert Isaac.getName().equals("Isaac");
        assert Isaac.getAddress().equals("Isaac's House");
        assert Isaac.getPhoneNumber().equals("Isaac's Phone");
    }
}