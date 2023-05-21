package dayfive.innerclassexample;

public class OuterClassMain {

	public static void main(String[] args) {
		OuterClass object = new OuterClass();
		OuterClass.InnerClass innerObject = object.new InnerClass();
		innerObject.message("How are you ? ");
	}

}
