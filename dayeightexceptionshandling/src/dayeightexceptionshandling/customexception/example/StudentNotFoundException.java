package dayeightexceptionshandling.customexception.example;

public class StudentNotFoundException extends Exception{

	/**
	 * 
	 */
	public StudentNotFoundException() {
		System.out.println("Student not found exception thrown");
	}

	@Override
	public String toString() {
		return "Student id doesn't exists";
	}
	
	

}
