package daytwo.userinputoutput;

public class ReadingCommandLineArgs {

	public static void main(String[] args) {//Array of String -- String[] referred by variable args
		System.out.println(args[0]);
		System.out.println(args[1]);
		//System.out.println(args[3]); //Error ArrayIndexOutOfBoundsException if you are passing 3 arguments in command line
		System.out.println(args[2]);
	}

}
