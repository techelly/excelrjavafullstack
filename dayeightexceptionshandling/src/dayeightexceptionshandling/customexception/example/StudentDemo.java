package dayeightexceptionshandling.customexception.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentDemo {

	public static void main(String[] args) {
		Student stud1 = new Student(1,"Ibrahim",LocalDate.of(1947,8,15));
		Student stud2 = new Student(2,"Varun",LocalDate.of(1977,10,15));
		
		List<Student> listOfStudents = new ArrayList<Student>();
		listOfStudents.add(stud2);
		listOfStudents.add(stud1);
		
		Integer studentId =5;
		try {
			searchStudent(studentId,listOfStudents);
		} catch (StudentNotFoundException e) {
			System.out.println(e);
		}
	}

	private static void searchStudent(Integer studentId, List<Student> listOfStudents) throws StudentNotFoundException {
		for(Student st : listOfStudents) {
			if(st.getStudentId() == studentId) {
				System.out.println("Student with student Id "+studentId+" record exists");
			}else {
				throw new StudentNotFoundException();
			}
		}
		
	}


}
