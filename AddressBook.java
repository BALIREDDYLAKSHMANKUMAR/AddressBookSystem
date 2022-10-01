package AddressBook.Addressbook;


	import java.util.ArrayList;
	import java.util.Scanner;

	public class AddressBook {

	    ArrayList<Contact> arrli = new ArrayList<Contact>();

	    void addContact(Scanner s) {

	        System.out.println("Enter first name :");
	        String firstName = s.nextLine();
	        System.out.println("Enter last name :");
	        String lastName = s.nextLine();
	        System.out.println("Enter address :");
	        String address = s.nextLine();
	        System.out.println("Enter city :");
	        String city = s.nextLine();
	        System.out.println("Enter state :");
	        String state = s.nextLine();
	        System.out.println("Enter zip code :");
	        String zip = s.nextLine();
	        System.out.println("Enter phone number :");
	        String phoneNumber = s.nextLine();
	        System.out.println("Enter   email Id :");
	        String emailId = s.nextLine();
	        arrli.add(new Contact(firstName, lastName, address, city, state, zip, phoneNumber, emailId));
	    }

	    void displayContact() {
	        System.out.println(arrli);

	    }

	    void editContact(Scanner s) {
	        System.out.println("Enter first name of Contact to search : ");
	        String search = s.nextLine();
	        Contact matchedContact = null;
	        for (int i = 0; i < arrli.size(); i++) {
	            Contact contact = arrli.get(i);
	            String currentName = contact.getFirstName();
	            if (currentName.equals(search)) {
	                matchedContact = contact;
	                break;
	            }
	        }

	        System.out.println("Found" + matchedContact);
	        if (matchedContact != null) {
	            System.out.println(
	                    "Select what field to edit 1: first name 2: last name 3: address 4: city 5: state 6: zip 7: phone number 8: email Id");
	            String change;
	            int choice = Integer.parseInt(s.nextLine());

	            switch (choice) {
	                case 1:
	                    System.out.println("Give new first name:");
	                    change = s.nextLine();
	                    matchedContact.setFirstName(change);
	                    System.out.println("Updated Contact: " + matchedContact);
	                    break;
	                case 2:
	                	System.out.println("Give new last name:");
	                    change = s.nextLine();
	                    matchedContact.setLastName(change);
	                    System.out.println("Updated Contact: " + matchedContact);
	                    break;
	                case 3:
	                	System.out.println("Give new address:");
	                    change = s.nextLine();
	                    matchedContact.setAddress(change);
	                    System.out.println("Updated Contact: " + matchedContact);
	                    break;
	                case 4:
	                	System.out.println("Give new city:");
	                    change = s.nextLine();
	                    matchedContact.setCity(change);
	                    System.out.println("Updated Contact: " + matchedContact);
	                    break;
	                case 5:
	                	System.out.println("Give new state:");
	                    change = s.nextLine();
	                    matchedContact.setState(change);
	                    System.out.println("Updated Contact: " + matchedContact);
	                    break;
	                case 6:
	                	System.out.println("Give new zip code:");
	                    change = s.nextLine();
	                    matchedContact.setZip(change);
	                    System.out.println("Updated Contact: " + matchedContact);
	                    break;
	                case 7:
	                	System.out.println("Give new phone number:");
	                    change = s.nextLine();
	                    matchedContact.setPhoneNumber(change);
	                    System.out.println("Updated Contact: " + matchedContact);
	                    break;
	                case 8:
	                	System.out.println("Give new email Id:");
	                    change = s.nextLine();
	                    matchedContact.setEmailId(change);
	                    System.out.println("Updated Contact: " + matchedContact);
	                    break;
	            }
	        }

	    }

	    void deleteContact(Scanner s) {
	    	System.out.println("Enter first name of Contact to delete : ");
	        String search = s.nextLine();
	        Contact matchedContact = null;
	        for (int i = 0; i < arrli.size(); i++) {
	            Contact contact = arrli.get(i);
	            String currentName = contact.getFirstName();
	            if (currentName.equals(search)) {
	                matchedContact = contact;
	                break;
	            }
	        }
	        arrli.remove(matchedContact);
	        displayContact();
	    }

	    void addMultipleContacts(Scanner s) {
	        String input = "yes";
	        while (input.equalsIgnoreCase("yes")) {
	            addContact(s);
	            System.out.println("Add More yes/no?");
	            input = s.nextLine();
	        }
	    }

	    void accessAddressBook(AddressBook a, Scanner s) {
	        while (true) {
	        	System.out.println("Welcome to Address Book Program");
	        	System.out.println(
	                    "Give choice 1. Create a contact: 2: Display Contacts 3: Edit a Contact 4: Delete a contact 5: Add Multiple contacts 6: Go back");
	            String str = s.nextLine(); // get the number as a single line

	            int choice = Integer.parseInt(str);

	            switch (choice) {
	                case 1:
	                    a.addContact(s);
	                    break;
	                case 2:
	                    a.displayContact();
	                    break;
	                case 3:
	                    a.editContact(s);
	                    break;
	                case 4:
	                    a.deleteContact(s);
	                    break;
	                case 5:
	                    a.addMultipleContacts(s);
	                case 6:
	                    return;
	            }
	        }
	    }
	}


