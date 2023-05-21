package dayfive.stringexample;

public class WrapperClassesExample {

	public static void main(String[] args) {
		//Wrapper classes and auto boxing and unboxing
		//primitive datatypes
		int num = 15;
		double dNum= 15.50;
		float fNum= 15.25f;
		long lNum= 9999106219l;
		char c = 'h';
		
		//In java everything is an  object so corresponding to the above primitve 
		//data types we have classes which is know as wrapper classes
		Integer wNum= 16;
		Double wDNum= 16.50;
		Float wFNum= 15.25f;
		Long wLNum= 9999106219l;
		Character wChar = 'h';
		
		//Autoboxing and uboxing example
		Integer i = 10; //i is referring to an integer object whose value is 10
		System.out.println(i instanceof Integer);
		//Unboxing the object
		int i1 = i;
		//System.out.println(i1 instanceof Integer);
		
		//Autoboxing of character
		Character ch = 'b';
		
		//Auto - uboxing of Character
		char  ch1 = ch;
		
		System.out.println(ch);
		System.out.println(ch1);

		System.out.println(i);
		System.out.println(i1);
		
	}

}
