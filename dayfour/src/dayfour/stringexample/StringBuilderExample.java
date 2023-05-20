package dayfour.stringexample;

public class StringBuilderExample {

	public static void main(String[] args) {
		/**
		 * Similar to StringBuffer we have StringBUilder class in Java
		 * to represent a mutable squence of characters.
		 * Introduced in Java 5
		 * Its not thread safe or asynchronized. This means that multiple threads
		 * can call the methods of StringBuilder simultaneously
		 */
		
		StringBuilder sbr = new StringBuilder();
		System.out.println(sbr.capacity());
		System.out.println(sbr.length());
		StringBuilder sbl = new StringBuilder("pqr");
		sbl.append("stu").reverse().insert(3, "---");
		System.out.println(sbl);

	}

}
