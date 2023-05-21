package dayfive.dateandtimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class NewDateAndTimeApiExample {

	public static void main(String[] args) {
		/**
		 * New datetime introduced in Java  8 to solve the following drawbacks:
		 * 1. Old date time api was not thread safe.
		 * 2. In old api there are only few date operations 
		 * 
		 * New API:
		 * It prvoides many date operations
		 * It is immutable and doesn't setter methods
		 * 
		 * java.time package contains class of new api
		 * 1. Local : Simplified date-time API with no complexity of timezone handling
		 * 2. Zoned : Specialized date-time API to deal with various timezones.
		 */

		
		LocalDate date = LocalDate.now();
		System.out.println("The current date is "+date);
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("The current date and time is "+dateTime);
		
		LocalTime time  = LocalTime.now();
		System.out.println("The current time is "+time);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		String formatedDateTime = dateTime.format(format);
		System.out.println(formatedDateTime);
		
		//Print some specified date
		LocalDate date2 = LocalDate.of(1947, 8, 15);
		System.out.println(date2);
		
		int month = date2.getDayOfMonth();
		System.out.println(month);
		System.out.println(date2.getDayOfWeek());
		System.out.println(date2.getDayOfYear());
		System.out.println(date2.getMonthValue());
		System.out.println(dateTime.getSecond());
		
		System.out.println(dateTime.getMinute());
		System.out.println(date2.isAfter(date));
		System.out.println(date2.isBefore(date));
		System.out.println(date.isLeapYear());
		
		
	}

}
