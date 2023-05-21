package dayfive.innerclassexample;

public class OuterClass {
	private String name= "JAVA";
	
	class InnerClass{
		void message(String msg) {
			System.out.println(msg+name);
		}
	}
}
