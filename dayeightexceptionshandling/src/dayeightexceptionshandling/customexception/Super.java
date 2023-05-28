package dayeightexceptionshandling.customexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class Super1 {
	void m1() throws IOException {
		FileInputStream fx = new FileInputStream("Super.txt");
	}
	
	
}

class Sub extends Super1 {
	void m1() throws FileNotFoundException {
		FileInputStream fx = new FileInputStream("Sub.txt");
	}
	
}

class Super{
	
	public static void main(String[] args) {
		Sub sub = new Sub();
		try {
			sub.m1();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
