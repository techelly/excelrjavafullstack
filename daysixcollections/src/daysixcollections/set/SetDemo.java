package daysixcollections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		//No duplicates
		//Sorted order elements
		Set<Integer> treeSet= new TreeSet<Integer>();
		treeSet.add(2);
		treeSet.add(1);
		treeSet.add(3);
		treeSet.add(5);
		treeSet.add(4);
		treeSet.add(3);
		
		System.out.println(treeSet);
		System.out.println(treeSet.size());
		treeSet.forEach(System.out::println);
		
		
		TreeSet<String> treeSet1 = new TreeSet<String>(); 
		treeSet1.add("One");
		treeSet1.add("Two");
		treeSet1.add("Three");
		treeSet1.add("Four");
		treeSet1.add("Five");
		System.out.println("Contents of treeset");
		Iterator iterator = treeSet1.iterator(); // obtaining iterator object
		while (iterator.hasNext()) { // to iterate thru collection.
		Object object = iterator.next();
		System.out.print(object + "\t");
		}
		
		treeSet1.forEach(System.out::println);

		System.out.println(treeSet1);	
		System.out.println(treeSet1.descendingSet());
		System.out.println(treeSet1.size());
		System.out.println(treeSet1.remove("Four"));
		System.out.println(treeSet1);	
		System.out.println(treeSet1.size());
		
		Set<Integer> s = new HashSet<Integer>();
		s.add(14);
		s.add(6);
		s.add(4);
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(11);
		s.add(21);
		s.add(31);
		s.add(21); //Duplicates are not allowed
		s.add(31);//Duplicates are not allowed
		System.out.println(s);
		

		

	}

}
