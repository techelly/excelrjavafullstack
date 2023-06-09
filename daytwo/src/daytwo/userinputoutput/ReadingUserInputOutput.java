package daytwo.userinputoutput;

import java.util.Scanner;

public class ReadingUserInputOutput {

	public static void main(String[] args) {
		/**
		 * Scanner in java.util.Scanner
		 * using new keyword we are invoking Scanner() constructor to create an object of Scanner class
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer:  ");
		int number = scanner.nextInt();
		System.out.println("You have entered integer number :  "+number);
		
		System.out.println("Enter a double:  ");
		double dNum = scanner.nextDouble();
		System.out.println("You have entered double number :  "+dNum);
		
		System.out.println("Enter a float number:  ");
		float fNum = scanner.nextFloat();
		System.out.println("You have entered float number :  "+fNum);
		
		System.out.println("Enter your name:  ");
		String name = scanner.next();
		System.out.println("You have entered your name :  "+name);

	}

}
