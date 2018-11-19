package OOP;

public class BankAccount implements IRate {
	
	// Declare Properties
	
	// Static variables
	// static >> belongs to the CLASS not the object instance
	// final >> constant (often static final, not always)
	private static final String routingNumber = "43524";
	
	// Instance Variables
	String accountNumber;
	private String name;
	private String ssn; 
	String accountType;
	double balance = 0;
	
	// Constructor definitions: unique methods
		// 1. They are used to define / setup / initialize properties of an object
		// 2. Constructors are IMPLICITLY called upon instantiation
		// 3. The same name as the class itself
		// 4. Constructors have NO retrn type 
	BankAccount() {
		System.out.println("NEW ACCOUNT CREATED");
	}
	// Overloading is example of Polymorphism: Call same method name with different arguments
	BankAccount(String accountType){
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	BankAccount(String accountType, double initDeposit){
		System.out.println("NEW ACCOUNT: " + accountType + " with balance of: " + initDeposit);
		if (initDeposit < 1000) {
			String errorMsg = "ERROR: Minimum deposit must be at least $1,000";
			System.out.println(errorMsg);
		}
		balance = balance + initDeposit;
	}
	
	// Interface methods
	public void setRate() {
		System.out.println("SETTING RATE");
	}  
	
	public void increaseRate() {
		System.out.println("INCREASING RATE");
	}
	
	
	// Getters / Setters
	// Allow the user to define the name
	public void setName(String name) {
		this.name = "Mr. " + name;
	}
	public String getName() {
		 return name;
	}
	
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	
	
	// Defined methods
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	public void withdraw(double amount) {
		balance = balance - amount;
		showActivity("WITHDRAW");
	}
	public void checkBalance() {
		System.out.println("Balance: " + balance);
	}
	void getStatus() {

	}
	// Private: Can only be called from within the CLASS
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION: " + activity);
		System.out.println("YOUR NEW BALANCE IS: " + balance);
	}
	
	// Override is example of Polymorphism
	@Override 
	public String toString() { 
		return "[ NAME: " + getName() + ". ACCOUNT# " + accountNumber + ". ROUTING# " + routingNumber + " BALANCE: $" + balance + " ]";
	}
}
