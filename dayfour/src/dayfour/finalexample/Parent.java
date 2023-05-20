package dayfour.finalexample;

public class Parent {
	public void firstName() {
		System.out.println("Varun");
	}
	
	//I don't want to override the lastName so making this method as final
	public final void lastName() {
		System.out.println("Kumar");
	}
}
