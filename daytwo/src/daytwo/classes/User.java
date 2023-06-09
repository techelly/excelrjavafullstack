package daytwo.classes;

import java.time.LocalDate;
/**
 * 
 * @author UD SYSTEMS
 *POJO -- Plain Old Java Object class
 *Class with properties with default constructor
 *Getter and Setter methods to access the properties of classes 
 */
public class User {

	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private Long mobileNumber;
	private String city;


	/**
	 * @param firstName
	 * @param lastName
	 * @param dateOfBirth
	 * @param mobileNumber
	 * @param city
	 */
	public User(String firstName, String lastName, LocalDate dateOfBirth, Long mobileNumber, String city) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.mobileNumber = mobileNumber;
		this.city = city;
	}

	public User() {
		// TODO Auto-generated constructor stub
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

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
