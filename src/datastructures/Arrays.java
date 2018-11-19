package datastructures;

public class Arrays {
	public static void main(String[] args) {
		String[] alphabet = {"a", "b", "c", "d", "e"};
		
		// The Olde Way (hard coded array size)
		System.out.println("The Olde Way");
		for (int i = 0; i < 5; i++) {
			System.out.print(alphabet[i] + " ");
		}
		
		// A Better Way (dynamic array size)
		System.out.println("\n\nA Better Way");
		for (int n = 0; n < alphabet.length; n++) {
			System.out.print(alphabet[n] + " ");
		}
		
		// A New Way (dont have to reference the array[index] during the loop)
		System.out.println("\n\nA New Way");
		for (String letter : alphabet) {
			System.out.print(letter + " ");
		}
		// Multi-Dimenional array
		System.out.println("\n\nA matrix of data");
		String[][] users = {
				{"John","Williams","jw@testemail.com","34523453"},
				{"Sarah","Jackson","sj@testemail.com","34534254"},
				{"Rachel","Wallace","rw@testemail.com","3225556"}
				};
		
		// Get the size of array
		int numOfUsers = users.length;
		int numOfFields = users[0].length;
		
		System.out.println("Users :" + numOfUsers + "\nFields: " + numOfFields);
		
		// traverse the double array knowing the contents of fields
		System.out.println("\nGet User Data");
		
		for (int k=0; k<numOfUsers; k++) {
			String firstName = users[k][0];
			String lastName = users[k][1];
			String email = users[k][2];
			String phone = users[k][3];
			System.out.println(firstName + " " + lastName + " " + email + " " + phone);

		}
		System.out.println("\n");
		for (String[] user : users) {
			for (String field : user) {
				System.out.print(field);
			}
			System.out.print("\n");
		}
		
		
		
		
		
		
		
		
	}
}
		

