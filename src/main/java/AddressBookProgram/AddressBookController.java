package AddressBookProgram;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class AddressBookController {
    @Autowired
    AddressBookRepository repository;

    @GetMapping("/addressBookPage")
    public String addressBookPage(@RequestParam(value = "id", defaultValue = "1") Integer id, Model model) {
        model.addAttribute("id", id);

        AddressBook addressBook = repository.findById(id).get();
        model.addAttribute("buddies", addressBook.getBuddies());

        return "addressBook";
    }
}
