package ExceptionsFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumberApp {

	public static void main(String[] args) {
		// This will read a text file and will retrieve phone number
		
		String filename = "C:\\Users\\EatLocal\\Google Drive\\Education\\JAVA\\files\\PhoneNumbers.txt";
		File file = new File(filename);
		BufferedReader br = null;
		String [] phoneNum = new String[8];
		
		// Open the file outside the loop
		try {
			br = new BufferedReader(new FileReader(file));
			} catch (FileNotFoundException e) {
			System.out.println("ERROR: File not found");
			e.printStackTrace();
			}
		
		// Now iterate through file reading lines into array
		for (int i = 0; i < phoneNum.length; i++) {	
			try {
				phoneNum[i] = br.readLine();
			} catch (IOException e) {
				System.out.println("ERROR: Could not read file");
				e.printStackTrace();
			}
		}
		// close the file
		try {
			br.close();
		} catch (IOException e) {
			System.out.println("ERROR: Could not read file");
			e.printStackTrace();
		}

		// 9 values in the File Array
		// Valid phone number: Custom Exceptions
		// 10 digits long
		// Area Code cannot start in 0 or 9
		// There can be no 911 substring in the number
		
		for (int i = 0; i<phoneNum.length ;i++) {	
			try {
				// Algorithm Test and Throw Goes Here
				if (phoneNum[i].length() != 10) {
					throw new TenDigitException(phoneNum[i]);
				}
				if (phoneNum[i].substring(0, 1).equals("0") || phoneNum[i].substring(0, 1).equals("9")) {
					throw new AreaCodeException(phoneNum[i]);
				}
				for (int n = 0; n<(phoneNum[i].length()-3);n++) {
					if (phoneNum[i].substring(n, n+1).equals("9")) {
						if (phoneNum[i].substring(n+1, n+2).equals("1") && phoneNum[i].substring(n+2, n+3).equals("1")) {
							throw new EmergencyException(phoneNum[i]);
						}
					}
				}
				System.out.println("Validated Number: " + phoneNum[i]);
			
			
			} catch (TenDigitException e) {
				System.out.println("ERROR: Number must have 10 digits.");
				System.out.println(e.toString());
			} catch (AreaCodeException e) {
				System.out.println("ERROR: Number must not start with 0 or 9.");
				System.out.println(e.toString());
			} catch (EmergencyException e) {
				System.out.println("ERROR: Number cannot contain 911.");
				System.out.println(e.toString());
			}
		}	
	}
} 

class TenDigitException extends Exception {
	String num;
	TenDigitException(String num){
		this.num = num; 
	}
	public String toString() {
		return "TenDigitsException: " + num;
	}
}

class AreaCodeException extends Exception {
	String num;
	AreaCodeException(String num){
		this.num = num; 
	}
	public String toString() {
		return "AreaCodeException: " + num;
	}
}

 class EmergencyException extends Exception {
		String num;
		EmergencyException(String num){
			this.num = num; 
		}
		public String toString() {
			return "EmergencyException " + num;
		}
}


