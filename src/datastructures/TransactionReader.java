package datastructures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TransactionReader {

	public static void main(String[] args) {
		
		// Create a data structure to read data from CSV file
		List<String[]> data = new ArrayList<String[]>();
		String filename = "C:\\Users\\EatLocal\\Google Drive\\Education\\JAVA\\files\\creditcard.csv";
		String dataRow;
		double balance = 0;
	    final double penalty = 0.1;
		try {
			// Open the file
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			// Read the file as long as its not empty
			while((dataRow = br.readLine()) != null) {
				// Parse the data by commas
				String[] line = dataRow.split(",");
				// Add the data to the collection
				data.add(line);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (String[] transaction : data) {
			// transaction array [0]date [1]type [2]location [3]amount
			// wrap algorithm in try/catch with custom exception
			try {
				// Algorithm Test and Throw Goes Here
				if (transaction[1].equals("CREDIT")) {
					System.out.println("On " + transaction[0] + " a CREDIT made for " + transaction[3] + "\nPREVIOUS BALANCE: $" + balance);
					balance = balance + Double.parseDouble(transaction[3]);
					System.out.println("NEW BALANCE: $" + balance + "\n");
				}else if (transaction[1].equals("DEBIT")) {
					System.out.println("On " + transaction[0] + " a DEBIT made for " + transaction[3] + "\nPREVIOUS BALANCE: $" + balance);
					balance = balance - Double.parseDouble(transaction[3]);
					System.out.println("NEW BALANCE: $" + balance + "\n");					
					
				}else {
					throw new InvalidTypeException(transaction[1]);
				}
			} catch (InvalidTypeException e) {
				System.out.println("ERROR: Transaction Type is invalid.");
				System.out.println(e.toString());
			}	
		}
		// Add final amount logic and rough messaging
		if (balance == 0) {
			System.out.println("Thank you for your payments.\n Balance is $" + balance);
		} else if (balance < 0) {
			System.out.println("Thank you for your payments.  You have overpaid. \n Balance due to you is : $" + -(balance));
		} else {
			balance = (balance + (balance * penalty));
			System.out.println("You have a balance due and a 10% fee is incurred. \n New Balance is : $" + balance);
		}		
		
		
		
	}
}

class InvalidTypeException extends Exception {
	String type;
	InvalidTypeException(String type){
		this.type = type; 
	}
	public String toString() {
		return "InvalidTypeException: " + type;
	}
}
