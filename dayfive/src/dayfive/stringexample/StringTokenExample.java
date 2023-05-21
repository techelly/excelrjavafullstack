package dayfive.stringexample;

import java.util.StringTokenizer;

public class StringTokenExample {
	
	static String str="Title=The Java HandBook:"+
			"Author=PatrickNaughton:"+
			"ISBN=0-07-882199-1:"+
			"Email=naughton@starwave.com";
	
	public static void main(String[] args) {
		System.out.println(str);
		//using split()
		String[] splittedStr = str.split(":");
		System.out.println(splittedStr[0]);
		System.out.println("********************************************");
		for(String s : splittedStr) {
			System.out.println(s);
		}
		
		System.out.println("********************************************");
		for(int index =0; index<splittedStr.length;index++) {
			System.out.println(splittedStr[index]);
		}
		
		System.out.println("********************************************");
		StringTokenizer st = new StringTokenizer(str,"=:");
		while(st.hasMoreTokens()) {
			String key = st.nextToken();
			String val =st.nextToken();
			System.out.println(" "+key+"\t"+val+"\n");
		}
	}

}
