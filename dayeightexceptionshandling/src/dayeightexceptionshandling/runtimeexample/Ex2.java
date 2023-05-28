package dayeightexceptionshandling.runtimeexample;

class Ex2 {
	public static void main(String[] args) {
	try {
		int i= Integer.parseInt(args[0]);
		System.out.println(i);
	}//try ends here
	//System.out.println("abc");
	catch(NumberFormatException e) {
		System.out.println(e);
	}
	}
}
