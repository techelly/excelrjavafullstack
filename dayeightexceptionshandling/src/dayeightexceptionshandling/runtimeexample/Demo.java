package dayeightexceptionshandling.runtimeexample;

public class Demo {

	public static void main(String[] args) {
		int x = 0;
		try {
				int y = 50/x;
				System.out.println(y);
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println(ae.getMessage());
			System.out.println("Dvision by zero");
		}
		
		System.out.println("Exception is handled properly");
	}

}
