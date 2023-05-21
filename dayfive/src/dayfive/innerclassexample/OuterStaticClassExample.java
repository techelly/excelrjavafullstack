package dayfive.innerclassexample;

public class OuterStaticClassExample {
/**
 * A static class is a class that is created inside a class, 
 * is called a static nested class in Java. It cannot access non-static data 
 * members and methods. 
 * It can be accessed by outer class name.
 * 1. It can access static data members of the outer class, including private.
 * 2.The static nested class cannot access non-static (instance) data members or
 */
	private static int number = 15;
	//static inner or nested class 
	static class Inner{
		void displayNumber() {
			System.out.println("number is "+number);
		}
	}
	
	public static void main(String[] args) {
		OuterStaticClassExample.Inner object = new OuterStaticClassExample.Inner();
		object.displayNumber();
	}
}
