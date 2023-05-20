package daythree.oops.inheritance;

//Kids inherit Father so Kids is a sub or child class and Father is super class or parent class
//public class Kids extends Father is not supported i.e. Multiple inheritance is not supported in Java
public class Kids extends Father{
	public void displayKids() {
		System.out.println("I am Kid class at the bottom of class hierarchy");
	}
}
