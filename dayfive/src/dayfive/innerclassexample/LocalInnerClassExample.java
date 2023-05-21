package dayfive.innerclassexample;

public class LocalInnerClassExample {
	private String greetings = "Hello How are you ?";
	
	void display() {
		
		class Local{
			void message() {
				System.out.println(greetings);
			}
		}//Inner class ending
		//Local inner class cannot be invoked from outside the method
		//Local inner class cannot access non-final local variable till jdk 1.7
		//In Java 8 it is possible to access the non-final local variable in the local inner class
		Local local = new Local();
		local.message();
	}//End of display method
		
	public static void main(String[] args) {
		LocalInnerClassExample object = new LocalInnerClassExample();
		object.display();
	}
}
