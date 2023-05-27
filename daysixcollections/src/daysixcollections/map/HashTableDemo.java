package daysixcollections.map;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<String,Double> balance = new Hashtable<String,Double>();
		balance.put("Arun", 3434.34);
		balance.put("Radha",123.22);
		System.out.println(balance);
		System.out.println(balance.get("Radha"));

	}

}
