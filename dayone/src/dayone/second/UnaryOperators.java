package dayone.second;

public class UnaryOperators {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		int incr = ++a;
		int decr = --b;
		System.out.println("++a = "+ incr);
		System.out.println("--b = "+ decr);
		
		System.out.println("+a = "+ +a);
		System.out.println("-b = "+ -b);
	}

}
