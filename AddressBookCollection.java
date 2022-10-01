package AddressBook.Addressbook;



	import java.util.HashMap;
	import java.util.Scanner;
	public class AddressBookCollection {


	    HashMap<String, AddressBook> AddressBookSystem = new HashMap<String, AddressBook>();
	    Scanner s = new Scanner(System.in);

	    void homeMenu() {
	        while (true) {
	            System.out.println(
	                    "Welcome to AddressBookSystem: Choose an option 1: Open an Address Book 2: Create an Address Book 3: Delete an AddressBook ");
	            int input = Integer.parseInt(s.nextLine());
	            switch (input) {
	                case 1:
	                    openAddressBook();
	                    break;
	                case 2:
	                    createAddressBook();
	                    break;
	                case 3:
	                    deleteAddressBook();
	                    break;

	            }
	        }

	    }

	    void openAddressBook() { // takes input form user checks inside hashmap if key exits if it does then
	                             // store it in a then call addressbook access function

	    	System.out.println("Give name for the addressbook to open :");
	        String searchKey = s.nextLine();
	        // hashmap checks for key if exists
	        AddressBook a = AddressBookSystem.get(searchKey);
	        if (a == null) {
	        	System.out.println("Address book does not exist");
	        } else {

	        	System.out.println("opening Address Book : " + searchKey);
	            a.accessAddressBook(a, s);
	        }
	    }

	    void createAddressBook() { // create new address book with a name
	    	System.out.println("Give name for the addressbook to create :");
	        String name = s.nextLine();
	        AddressBook newAddressBook = new AddressBook();
	        newAddressBook.accessAddressBook(newAddressBook, s);
	        AddressBookSystem.put(name, newAddressBook);
	    }

	    void deleteAddressBook() { // delete address book with name
	    	System.out.println("Give name for the addressbook to delete :");
	        String name = s.nextLine();
	        if ((AddressBookSystem.get(name)) != null) {
	            if (AddressBookSystem.remove(name) == null) {
	            	System.out.println("Address book does not exist");
	            } else {

	                AddressBookSystem.remove(name);
	                System.out.println("Address book deleted");
	            }
	        } else {
	        	System.out.println("Create Address Book first !!");
	        }
	    }
	}


