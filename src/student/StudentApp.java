package student;

public class StudentApp {

			
	public static void main(String[] args) {
		
		Student stud1 = new Student("Jake", "Smith", "5633452233");
		stud1.setPhone("555-444-3333");
		stud1.setCity("Los Angeles");
		stud1.setState("California");
		System.out.println(stud1.toString());
		stud1.showCources();
		stud1.enroll();
		stud1.pay(50.00);
		
	/*		
		Student stud2 = new Student("Jill", "Stone", "4635672233");
		stud2.setPhone("666-444-7777");
		stud2.setCity("New York");
		stud2.setState("New York");
		System.out.println(stud2.toString());
		stud2.showCources();
		stud2.enroll();
		stud2.pay(150.00);
	*/		
			
			
	


	}

}
