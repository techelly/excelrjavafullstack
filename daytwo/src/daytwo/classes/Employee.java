package daytwo.classes;

import java.time.LocalDate;

//Class is a Blueprint of an object

public class Employee {
	//attributes of class Employee and properties of Employee class object
	private int empId;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private long mobileNumber;
	private double salary;
	
	private Address address;
	private Department department;
	
	
	//Constructor with no arguments
	public Employee(){
		
	}

	/**
	 * Parameterized
	 * Constructor with all arguments
	 * @param empId
	 * @param firstName
	 * @param lastName
	 * @param dateOfBirth
	 * @param mobileNumber
	 * @param salary
	 */
	public Employee(int id, String fName, String lName, LocalDate dob, long mobile,
			double sal) {
		this.empId = id;
		this.firstName = fName;
		this.lastName = lName;
		this.dateOfBirth = dob;
		this.mobileNumber = mobile;
		this.salary = sal;
	}
	//Constructor with 3 arguments
	public Employee(int id, String fName, String lName) {
		this.empId = id;
		this.firstName = fName;
		this.lastName = lName;
	}
	
	
	/**
	 * @param empId
	 * @param firstName
	 * @param lastName
	 * @param dateOfBirth
	 * @param mobileNumber
	 * @param salary
	 * @param address
	 * @param department
	 */
	public Employee(int empId, String firstName, String lastName, LocalDate dateOfBirth, long mobileNumber,
			double salary, Address address, Department department) {
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.mobileNumber = mobileNumber;
		this.salary = salary;
		this.address = address;
		this.department = department;
	}

	/**
	 * To access all attributes of class we need accessor methods
	 * These methods are getter and setter methods
	 */
	
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth="
				+ dateOfBirth + ", mobileNumber=" + mobileNumber + ", salary=" + salary + ", address=" + address
				+ ", department=" + department + "]";
	}

	
	
	
}
