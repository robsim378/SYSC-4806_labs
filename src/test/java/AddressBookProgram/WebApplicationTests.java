package AddressBookProgram;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class WebApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void smokeTest() throws Exception {
        this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk());
    }

    @Test
    public void testGetAddressBook() throws Exception {
        this.mockMvc.perform(get("/getAddressBook?id=1")).andDo(print()).andExpect(status().isOk()).andExpect(content().string(containsString("buddies")));
    }

    @Test
    public void testGetAddressBooks() throws Exception {
        this.mockMvc.perform(get("/getAddressBooks")).andDo(print()).andExpect(status().isOk()).andExpect(content().string(containsString("buddies")));
    }

    @Test
    public void testGetBuddy() throws Exception {
        this.mockMvc.perform(get("/getBuddy?addressBookId=1&buddyInfoId=1")).andDo(print()).andExpect(status().isOk()).andExpect(content().string(containsString("name"))).andExpect(content().string(containsString("house"))).andExpect(content().string(containsString("number")));
    }

    @Test
    public void testGetBuddies() throws Exception {
        this.mockMvc.perform(get("/getBuddies?addressBookId=1")).andDo(print()).andExpect(status().isOk()).andExpect(content().string(containsString("name"))).andExpect(content().string(containsString("house"))).andExpect(content().string(containsString("number")));
    }
}
