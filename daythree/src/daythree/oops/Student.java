package daythree.oops;

import java.time.LocalDate;

//public keyword is one of the access modifier
/**
 * 
 * @author UD SYSTEMS
 *public private
 *protected
 *default
 */
public class Student {
	//private int studentId;
	private Integer studentId;
	private String name; // "Karthik"
	private LocalDate dateOfBirth;
	private String courseEnrolled;
	
	/**
	 * 
	 */
	public Student() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param studentId
	 * @param name
	 * @param dateOfBirth
	 * @param courseEnrolled
	 */
	public Student(Integer studentId, String name, LocalDate dateOfBirth, String courseEnrolled) {
		this.studentId = studentId;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.courseEnrolled = courseEnrolled;
	}

	
	//accessor methods
	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getCourseEnrolled() {
		return courseEnrolled;
	}

	public void setCourseEnrolled(String courseEnrolled) {
		this.courseEnrolled = courseEnrolled;
	}

	// For string representation of an Object
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", dateOfBirth=" + dateOfBirth
				+ ", courseEnrolled=" + courseEnrolled + "]";
	}
		
	
	public void displayInfo() {
		System.out.println("I am very good student");
	}
	
}
