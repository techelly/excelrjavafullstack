package dayfour.finalexample;

public class Child  extends Parent{
	
	//Trying to override the lastName we cann't override the final method
	public void lastName() {
		System.out.println("Gowda");
	}

}
