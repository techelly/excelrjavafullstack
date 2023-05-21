package dayfive.innerclassexample;

public class MemberInnerClassExample {
	
	/**
	 * A non-static class that is created inside a class but outside a method 
	 * is called member inner class. It is also known as a regular inner class.
	 * It can be declared with access modifiers like public, default, private, 
	 * and protected.
	 */
	
	private Integer number =18;
	
	class InnerClass{
			void message() {
				System.out.println("number is ---"+number);
			}
	}
	public static void main(String[] args) {
		MemberInnerClassExample obj1 = new MemberInnerClassExample();
		MemberInnerClassExample.InnerClass innerObject = obj1.new InnerClass();
		innerObject.message();
	}
	
}
