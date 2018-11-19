package OOP;

class Person {
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + "is walking");
	}
	
	void eat() {
		System.out.println(email);
	}
	
	void sleep(){
		System.out.println(name + "is sleeping");
	}
	
}



public class Demo {

		public static void main(String[] args) {
			// instatiating an object
			Person person1 = new Person();
			
			// define some properties
			person1.name = "Joe";
			person1.email = "joe@testemail.com";
			person1.phone = "656745675";
			
			// Abstraction
			person1.walk();
			
			Person person2 = new Person();
			person2.name = "Sarah";
			person2.sleep();
			
			
			
			/*
			// Person -
			
			// Attributse, variables, adjectives, descriptions
			
			
			
			// Actions, activity, behavior
			
			
			// What if we wanted to do this for another person?
			
			
			// What about binding attributes and properties togather
			
			*/
		}
	
		// Enhance by adding functions to minimize code
		
		
		
	 
}

