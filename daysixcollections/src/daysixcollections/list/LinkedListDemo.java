package daysixcollections.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		// LinkedList implements List and List implements Collection interface.It used doubley linked list to
		// store the elements.
		// It can store the duplicate elements.
		// It maintains insertion order and is non-synchronized.
		// The manipulation is fast because no shifting is required
		
		List<String> linkedList = new LinkedList<String>();
		
		linkedList.add("Ragini");
		linkedList.add("Rakesh");
		linkedList.add("Rajesh");
		linkedList.add("Mahesh");
		linkedList.add("Asaf");
		linkedList.add("Ragini");
		
		Iterator iterator = linkedList.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println(linkedList);
		linkedList.forEach(System.out::println);
		
		System.out.println("*****************************************");
		System.out.println(linkedList);
		//replacing the element at particular index position
		linkedList.set(1, "Ayushi");
		System.out.println(linkedList);
		
		Collections.replaceAll(linkedList, "Ragini", "Shyam");
		System.out.println(linkedList);
		
		System.out.println("*****************************************");
		linkedList.replaceAll(String::toLowerCase); //method reference or you can use lambda expression
		System.out.println(linkedList);
		
		
	}

}
