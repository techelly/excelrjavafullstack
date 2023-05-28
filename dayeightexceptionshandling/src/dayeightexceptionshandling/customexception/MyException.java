package dayeightexceptionshandling.customexception;

public class MyException extends Exception{

	/**
	 * 
	 */
	public MyException() {
		System.out.println("User defined exception thrown");
	}

	@Override
	public String toString() {
		return "MyException Object : Age cannot be < 18 " ;

	}
	
	

}
