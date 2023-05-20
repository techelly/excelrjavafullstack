package dayfour.staticexample;

public class StaticExample {
	/***
	 * Static is an acess modifier that is applicable for methods,variables,blocks but not for classes
	 * We can declare top level class with a stactic modifier but we can declare 
	 * the inner class as static.
	 * 
	 * In the case of instance variable for every object, a separate copy 
	 * will be created but in the case of static variable, a single copy 
	 * will be created at class level and shared by every object of that class.
	 */
	
	public static void main(String[] args) {
		Circle circle = new Circle();
		Double area = Circle.pi * 2.5 * 2.5;
		System.out.println(area);
		String hi = "hi";
		if(ApplicationConstants.HELLO.equals(hi)) {
			System.out.println(ApplicationConstants.WORD_MATCHES);
		}else {
			System.out.println(ApplicationConstants.NOT_MATCHES);
		}
	}
}
