package dayeightexceptionshandling.customexception.example;

import java.time.LocalDate;

public class Student {
	private Integer studentId;
	private String name;
	private LocalDate dateOfBirth;
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
	 */
	public Student(Integer studentId, String name, LocalDate dateOfBirth) {
		this.studentId = studentId;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}
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
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", dateOfBirth=" + dateOfBirth + "]";
	}
	
	
}
