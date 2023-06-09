package daythree.oops;

import java.time.LocalDate;

public class StudentMain {

	public static void main(String[] args) {
		//here student is a reference variable referring to Student object created by invoking Student() constructor using new keyword
		
		/**
		 * student and s are know as instances, references or instance variable or reference variable
		 * or simple object of Student class
		 */
		Student student = new Student();
		Student s = new Student();
		
		System.out.println(s);
		System.out.println(student);
		
		System.out.println(s.hashCode());
		System.out.println(student.hashCode());
		
		// set the student object properties
		student.setStudentId(1);
		student.setName("Karthik");
		
		LocalDate dob= LocalDate.of(2020, 10, 1);
		student.setDateOfBirth(dob);
		
		student.setCourseEnrolled("Java FS");
		
		System.out.println(student);
		System.out.println(student.getDateOfBirth());
		
		LocalDate  dateOfBirth = student.getDateOfBirth();
		System.out.println(dateOfBirth);
		
		student.displayInfo();
	}

}
