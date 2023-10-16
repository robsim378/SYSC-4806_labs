package AddressBookProgram;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Lab4Application {
	
	private static final Logger log = LoggerFactory.getLogger(Lab4Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Lab4Application.class);
	}

	@Bean
	public CommandLineRunner initAddressBook(AddressBookRepository repository) {
		return (args) -> {
			BuddyInfo buddy0 = new BuddyInfo();
			buddy0.setName("Ian");
			buddy0.setAddress("Ian's house");
			buddy0.setPhoneNumber("Ian's number");

			BuddyInfo buddy1 = new BuddyInfo();
			buddy1.setName("Liam");
			buddy1.setAddress("Liam's house");
			buddy1.setPhoneNumber("Liam's number");

			BuddyInfo buddy2 = new BuddyInfo();
			buddy2.setName("Curtis");
			buddy2.setAddress("Curtis's house");
			buddy2.setPhoneNumber("Curtis's number");

			AddressBook ab0 = new AddressBook();
			ab0.addBuddy(buddy0);
			ab0.addBuddy(buddy1);
			ab0.addBuddy(buddy2);

			BuddyInfo buddy3 = new BuddyInfo();
			buddy3.setName("Isaac");
			buddy3.setAddress("Isaac's house");
			buddy3.setPhoneNumber("Isaac's number");

			BuddyInfo buddy4 = new BuddyInfo();
			buddy4.setName("Noah");
			buddy4.setAddress("Noah's house");
			buddy4.setPhoneNumber("Noah's number");

			BuddyInfo buddy5 = new BuddyInfo();
			buddy5.setName("Andrew");
			buddy5.setAddress("Andrew's house");
			buddy5.setPhoneNumber("Andrew's number");

			AddressBook ab1 = new AddressBook();
			ab1.addBuddy(buddy3);
			ab1.addBuddy(buddy4);
			ab1.addBuddy(buddy5);

			repository.save(ab0);
			repository.save(ab1);

		};
	}
}
