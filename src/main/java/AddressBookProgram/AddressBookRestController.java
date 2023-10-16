package AddressBookProgram;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressBookRestController {
    @Autowired
    AddressBookRepository repository;

    @GetMapping("/")
    public Iterable<AddressBook> getDefaultPage() {
        return repository.findAll();
    }

    @GetMapping("/getAddressBooks")
    public Iterable<AddressBook> getAddressBooks() {
        return repository.findAll();
    }

    @GetMapping("/getAddressBook")
    public AddressBook getAddressBook(@RequestParam int id) {
        return repository.findById(id);
    }

    @GetMapping("/getBuddies")
    public Iterable<BuddyInfo> getBuddies(@RequestParam int addressBookId) {
        return repository.findById(addressBookId).getBuddies();
    }

    @GetMapping("/getBuddy")
    public BuddyInfo getBuddy(@RequestParam int addressBookId, @RequestParam int buddyInfoId) {
        return repository.findById(addressBookId).getBuddies().get(buddyInfoId);
    }
}
