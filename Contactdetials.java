
class Detials {
	String firstname;
	String lastname;
	String Address;
	String city;
	String state;
	int pincode;
	long phonenumber;
	String email;

	public void display() {
		System.out.println("firstName:" + this.firstname);
		System.out.println("LastName:" + this.lastname);
		System.out.println("Address:" + this.Address);
		System.out.println("City:" + this.city);
		System.out.println("State:" + this.state);
		System.out.println("pincode:" + this.pincode);
		System.out.println("PhoneNumber:" + this.phonenumber);
		System.out.println("Email:" + this.email);

	}

}

public class Contactdetials {
	public static void main(String[] args) {
	Detials contacts = new Detials();
	contacts.firstname = "lakshman";
	contacts.lastname = "Balireddy";
	contacts.Address = "Appannapalem";
	contacts.city = "Visakhapatnam";
	contacts.state = "Andhara Pradesh";
	contacts.phonenumber =916014474;
	contacts.pincode =530047;
	contacts.email = "laxmansgvp@gmail.com";
	contacts.display();
	
	
	}

}
