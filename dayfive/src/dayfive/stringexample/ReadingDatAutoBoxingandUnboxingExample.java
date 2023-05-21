package dayfive.stringexample;

import java.util.Scanner;

public class ReadingDatAutoBoxingandUnboxingExample {

	public static void main(String[] args) {
		//This program will read name and age ! 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name and age! ");
		String name = scan.next();
		int age = scan.nextInt();
		System.out.println("Dear "+name+" You have won ");
		System.out.println("Prize of rupees "+getMoney(age));
		
	
	}

	private static String getMoney(int age) {
		double a = age;
		double samp= Math.rint(a)* Math.random();
		String s = Double.toString(samp);
		return s;
	}
}
