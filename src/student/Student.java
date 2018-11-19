package student;

// Student Object

public class Student {

	// PROPERTIES
	private static int systemID;
	private String userID;
	private String firstname;
	private String lastname;
	private String ssn;
	private String email;
	private String phone;
	private String city;
	private String state;
	private double balance;
		
		
	// EXPOSED METHODS
	
	public void enroll() {
		System.out.println("");
		System.out.println("You have selected - Anatomy of a Personal Computer ($100 USD)");
		double cost = -100;
		balance = Double.sum(balance, cost);
		checkBalance();
	}
	
	public void pay(double payment) {
		balance = Double.sum(balance, payment);
		System.out.println("");
		System.out.println("Thank you for you payment of :" + payment);
		checkBalance();
	}
	
	public void checkBalance() {
		System.out.println("");
		System.out.println("Your balance is :" + balance);
	}
	
	public void showCources() {
		System.out.println("");
		System.out.println("Choose a course:");
		System.out.println("1.  Anatomy of a Personal Computer ($100 USD)");
		System.out.println("2.  Origins of Artificial Intelligence (CLASS FULL)");
		System.out.println("3.  Mind: A Perpetual Staircase (CLASS FULL)");
	}
	// Override example used to output student information in format
	@Override 
	public String toString() { 
		return "[ NAME: " + lastname + ", " + firstname + " PHONE: " + getPhone() + " CITY: " + getCity() + " STATE: " + getState() + " ]";
	}
	
		
	// CONSTRUCTORS
	// newStudent constructor that takes NAME and SSN as arguments and automatically generates an EMAIL address and a Private Static ID [
	Student(String first, String last, String social){
		firstname = first;
		lastname = last;
		ssn = social;
		systemID = GenerateUniqueSystemID();
		userID = GenerateUserID(ssn);
		email = GenerateEmail(firstname, lastname);
		balance = 0;

	// PRIVATE DEBUG	
	/*	System.out.println("systemID: " + systemID);
		System.out.println("userID: " + userID);
		System.out.println("name: " + firstname + " " + lastname);
		System.out.println("email: " + email);
		System.out.println("ssn: " + ssn);	
	*/
	}
		
	
	// GETTERS // SETTERS
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	// PRIVATE METHODS
	private int GenerateUniqueSystemID(){
		// code to query and set system to next available unique id, for now it simply being incremented from 0 as there is no system storage above execution
		return systemID + 1;
	}
	
	private String GenerateUserID(String ssn) {
		// code to build userID concat: systemID + rand(4digits 1000-9000) + last4(ssn) 
		return systemID + "_" + String.format("%04d",(int)(Math.random() * 10000 + 1)) + "_" + ssn.substring(6);
	}
	
	private String GenerateEmail(String firstname, String lastname) {
		// code to build email, using first digit of first name and last name
		return firstname.substring(0, 1) + lastname + "@topschool.com";
	}
	
}
