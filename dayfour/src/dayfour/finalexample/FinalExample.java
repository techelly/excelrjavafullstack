package dayfour.finalexample;

public class FinalExample {

	public static void main(String[] args) {
		/**
		 * final is a keyword. 
		 * Its non access modifier applicablel only to a vriable, a method or a class
		 * 
		 * static is a also a keyword mainly used for memory management.
		 * In java if we want to share the same variable or method of a given class then we use static keyword
		 * Users can apply static keywords with variables,method, blocks and nested classes
		 */
		
		
		System.out.println("ExcelrR");
		final Integer number = 15;
		System.out.println(number);
		//number = 25; //compilation error as final variable number we cannot assign the value
		Student student = new Student();
		System.out.println(student.hashCode());
		System.out.println(student);
		student.setName("Raju");
		student.setStudentId(1);
		System.out.println(student);
		
		student.setName("X");
		student.setStudentId(2);
		System.out.println(student);
		
		student = new Student();
		System.out.println(student.hashCode());
		System.out.println(student);
		Student newStudent= new Student();
		System.out.println(newStudent.hashCode());
		

	}

}
