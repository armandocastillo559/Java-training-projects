package OOP;

public class BankAccountApp {
	
	public static void main(String[] args) {
		// Creating a new bank account >> think instantiate an object
		
		BankAccount acc1 = new BankAccount();

		//acc1.name = "Roger Hue";
		// With Encaspilation : public API methods
		acc1.setName("Roger Hue");
		System.out.println(acc1.getName());
		acc1.setSsn("3452345");
		System.out.println("SSN: " + acc1.getSsn());
				
		
		acc1.accountNumber = "4523453";
		acc1.balance = 10000;
		acc1.setRate();
		acc1.increaseRate();
		
		
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.withdraw(2000);
		acc1.checkBalance();
		
		
		System.out.println(acc1.toString());
		
		/*
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "2344553";
		
		BankAccount acc3 = new BankAccount("Savings Account", 5644.43);
		acc3.accountNumber = "6765556";
		acc3.checkBalance();
		
		System.out.println(acc1.routingNumber);
		System.out.println(acc2.routingNumber);
		System.out.println(acc3.routingNumber);
		
		// Demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		cd1.name = "Jaun";
		cd1.accountType = "CD Account";
		cd1.compound();
		System.out.println(cd1.toString());
		*/
	}
	
}
