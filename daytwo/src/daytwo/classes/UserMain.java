package daytwo.classes;

import java.time.LocalDate;

public class UserMain {

	public static void main(String[] args) {
		User u = new User();
		
		u.setCity("Bengaluru");
		u.setFirstName("Eldo");
		u.setLastName("Jose");
		u.setMobileNumber(999999111L);
		u.setDateOfBirth(LocalDate.of(1999, 10, 15));
		
		
		System.out.println("User Date of birth --"+u);
		System.out.println("User Date of birth --"+u.getDateOfBirth());
		
		//Calling or invoking Parameterized constructor of User class
		//Here at the time of creating an object itself we are initializing the values or data to properties of a calss
		User usr = new User("Ibrahim","Shekh",LocalDate.of(1999, 10, 15),9999555511L,"Trivandrum");
		
		System.out.println("User city is ---"+usr.getCity());
		System.out.println("User mobile number is ---"+usr.getMobileNumber());
		
	
	}

}
