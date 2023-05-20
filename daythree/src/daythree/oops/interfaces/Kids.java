package daythree.oops.interfaces;

public class Kids extends Father implements Mother,GrandMother{
	public void displayKids() {
		System.out.println("I am Kid class at the bottom of class hierarchy");
	}

	@Override
	public void displayMother() {
	System.out.println("I am your Mother inside Kids class");
		
	}

	@Override
	public void displayGrandMother() {
		System.out.println("I am your Grand Mother inside Kids class");	
	}
}
