package dayfour.stringexample;

public class StringOperations {

	public static void main(String[] args) {
		// 01234 --- start index position is 0 and end position is length -1
		String s = "hello";
		System.out.println("Length or size of the hello string --- " + s.length());
		System.out.println("Index of character 'e' in hello string --- " + s.indexOf('e'));
		System.out.println("Index of character 'l' in hello string --- " + s.indexOf('l'));
		System.out.println("Index of character 'l' in hello string --- " + s.lastIndexOf('l'));
		System.out.println("Substring from the hello ---" + s.substring(1));
		System.out.println("Substring from the hello ---" + s.substring(1, 3));

		String hi = "Hi   ";
		System.out.println(hi);
		/**
		 * a string whose value is this string, with all leading and trailing space
		 * removed, or this string if it has no leading or trailing space.
		 */
		System.out.println("Remove spcaes----" + hi.trim());

		// valueOf - converts data to string
		int num = 12345;
		String numStr = String.valueOf(num);
		System.out.println(numStr);
		System.out.println(numStr instanceof String);

		/**
		 * String emptyString = null;
		 * System.out.println(emptyString.isEmpty());//NullPointerException
		 */
		String emptyString = "";
		System.out.println("********************************");
		// Java 6 onwards we have isEmpty method
		System.out.println(emptyString.isEmpty());
		System.out.println("********************************");
		checkStringForEmpty(emptyString);
		System.out.println("*****************concat***************");
		String str = "Hello";
		String str1 = "How are you ?";
		String concatResult = str.concat(str1);
		System.out.println(concatResult);
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(concatResult.hashCode());
		
		
	}

	private static void checkStringForEmpty(String emptyString) {
		if (emptyString.equals("")) {
			System.out.println("String provided is an empty string");
		} else {
			System.out.println("String provided is not an empty string");
		}

	}

}
