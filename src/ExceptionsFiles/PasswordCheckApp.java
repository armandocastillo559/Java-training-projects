package ExceptionsFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PasswordCheckApp {

	public static void main(String[] args) {
		// This will read a text file and will retrieve phone number
		
		String filename = "C:\\Users\\EatLocal\\Google Drive\\Education\\JAVA\\files\\Passwords.txt";
		File file = new File(filename);
		BufferedReader br = null;
		String [] Passwords = new String[12];
		
		// Open the file outside the loop
		try {
			br = new BufferedReader(new FileReader(file));
			} catch (FileNotFoundException e) {
			System.out.println("ERROR: File not found");
			e.printStackTrace();
			}
		
		// Now iterate through file reading lines into array
		for (int i = 0; i < Passwords.length; i++) {	
			try {
				Passwords[i] = br.readLine();
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

		// 13 lines in the File
		// Iterate through array here
		
		for (int i = 0; i < Passwords.length ;i++) {	
		
			// Algorithm Test and Throw Goes Here
			// At least 1 number [ascii(48-57]
			// At least 1 letter [ascii(65-90), ascii(97-122)]
			// At least 1 Special Character (! @ #) [ascii(33, 64, 35)]
			// If all these booleans stay false after iteration, throw exception
			boolean hasNumber = false;
			boolean hasLetter = false;
			boolean hasSpecial = false;

			// Iterate through the Password
			// looking for at least one value character
			// if found set boolean to true
			for (int n = 0; n < Passwords[i].length() ; n++) {
				if ((int)(Passwords[i].charAt(n)) >= 48 && (int)(Passwords[i].charAt(n)) <= 57) {
					//System.out.println("check it off, Number");
					hasNumber = true;
				}
				if (((int)(Passwords[i].charAt(n)) >= 65 && (int)(Passwords[i].charAt(n)) <= 90) || ((int)(Passwords[i].charAt(n)) >= 97 && (int)(Passwords[i].charAt(n)) <= 122)) {
					//System.out.println("check it off, Letter");
					hasLetter = true;
				}
				if ((int)(Passwords[i].charAt(n)) == 33 || (int)(Passwords[i].charAt(n)) == 64 || (int)(Passwords[i].charAt(n)) == 35) {
					//System.out.print(Passwords[i]);
					//System.out.println("check it off, Special");
					hasSpecial = true;
				}
			}
			
			try {
				if (!hasNumber) {
					throw new OneNumberException(Passwords[i]);
				}
				if (!hasLetter) {
					throw new OneLetterException(Passwords[i]);
				}
				if (!hasSpecial) {
					throw new OneSpecialCharException(Passwords[i]);
			}
			// Valid Password found!
			System.out.println("Validated Password: " + Passwords[i]);
			
			} catch (OneNumberException e) {
				System.out.println("ERROR: Password must have at least 1 number.");
				System.out.println(e.toString());
			} catch (OneLetterException e) {
				System.out.println("ERROR: Password must have at least 1 letter");
				System.out.println(e.toString());
			} catch (OneSpecialCharException e) {
				System.out.println("ERROR: Password must have at least 1 special character (! @ #)");
				System.out.println(e.toString());
			}	
		}
	} 
}


class OneNumberException extends Exception {
	String num;
	OneNumberException(String num){
		this.num = num; 
	}
	public String toString() {
		return "OneNumberException: " + num;
	}
}

class OneLetterException extends Exception {
	String num;
	OneLetterException(String num){
		this.num = num; 
	}
	public String toString() {
		return "OneLetterException: " + num;
	}
}

 class OneSpecialCharException extends Exception {
	String num;
	OneSpecialCharException(String num){
		this.num = num; 
	}
	public String toString() {
		return "OneSpecialCharException " + num;
	}
}