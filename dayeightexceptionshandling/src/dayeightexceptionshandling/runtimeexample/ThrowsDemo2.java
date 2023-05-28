package dayeightexceptionshandling.runtimeexample;

import java.io.FileNotFoundException;

class ThrowsDemo2 {
	static void throwOne() throws FileNotFoundException,Exception {
		System.out.println("Inside throwOne.");
		throw new FileNotFoundException();// Explicit exception is thrown using throw keyword
		
	}

	// public static void main(String args[]) throws FileNotFoundException {
	public static void main(String args[]) {
		try {
			throwOne();// calling another method
		} catch (FileNotFoundException e) {
		
			System.out.println("File doesn't exists");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
