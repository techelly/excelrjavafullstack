package dayfour.stringexample;

public class StringBufferExample {
	/**
	 * Whenever a change to a String is made, an entirely new String is created. 
	 * However, java provides multiple classes through which strings can be used. 
	 * Two such classes are StringBuffer and StringBuilder. 
	 * 
	 */
	public static void main(String[] args) {
		/**
		 * StringBuffer
		 * 
		 * The string represents fixed-length, immutable character sequences 
		 * while StringBuffer represents growable and writable character sequences. 
		 * StringBuffer may have characters and substrings inserted in the middle 
		 * or appended to the end. It will automatically grow to make room for such 
		 * additions and often has more characters preallocated than are actually 
		 * needed, to allow room for growth. 
		 */
		StringBuffer sbr = new StringBuffer("Hello");
		sbr.append(" world !");
		System.out.println(sbr);
		System.out.println(sbr.capacity());
		System.out.println(sbr.length());
		
		StringBuffer sbr1 = new StringBuffer();
		System.out.println(sbr1.capacity());
		System.out.println(sbr1.length());
		System.out.println(sbr.reverse());
		
		
	}

}
