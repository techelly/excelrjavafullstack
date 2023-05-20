package dayfour.stringexample;

public class StringsOperationsExample {

	public static void main(String[] args) {
		// create 3 strings
		String first = "java programming";
		String second = "java programming";
		String third = "python programming";

		// compare first and second strings
		boolean result1 = first.equals(second);
		System.out.println("Strings first and second are equal: " + result1);

		// compare first and third strings
		boolean result2 = first.equals(third);
		System.out.println("Strings first and third are equal: " + result2);
		
		
		//Escape character in Java Strings
		String example = "This is the \"String\" class";
		System.out.println(example);
		
		//String other methods
		String greetings = "How are you ?";
		System.out.println(greetings.toLowerCase());
		System.out.println(greetings.toUpperCase());
		System.out.println(first.contains("java"));
		
		//join method returns a new string with the given elements joined with the specified delimiter.
		String str1 = "I";
		String str2 = "love";
		String str3 = "Java";
		
		String joinedStr = String.join(" : ", str1,str2,str3);
		System.out.println(joinedStr);
		
		String str4 = str1.concat(","+str2);
		System.out.println(str4);
		
		String message = "How are you ? Can you all try palindrome example";
		System.out.println(message.split(" "));
		String[] splittedMessage = message.split(" ");
		System.out.println(splittedMessage.length);
		System.out.println(splittedMessage[0]);
		
		for(int index=0;index<splittedMessage.length;index++) {
			System.out.println(splittedMessage[index]);
		}
		
		String s1 = "   How are you ?  ";
		System.out.println(s1.strip());
		System.out.println(s1.stripLeading());
		System.out.println(s1.stripTrailing());
	}

}
