package daysixcollections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// Vector uses a dynamic array to store the data elements. It is similar to
		// ArrayList.
		// It is synchronized and contains many methods that are not part of Collection
		// framework

		List<Integer> vectr = new Vector<Integer>();
		vectr.add(14);
		vectr.add(11);
		vectr.add(10);
		vectr.add(12);
		vectr.add(13);

		for (Integer intNum : vectr) {
			System.out.println(intNum);
		}
		
		System.out.println(vectr.size());
		
		Vector vec = new Vector();
		
		Vector<Integer> vect = new Vector<Integer>();
		System.out.println(vec.size());
		System.out.println(vect.size());
		System.out.println(vec.capacity());
		System.out.println(vect.capacity());
		vect.add(11);
		vect.add(12);
		vect.add(13);
		vect.add(14);
		vect.add(15);
		vect.add(16);
		vect.add(17);
		vect.add(18);
		System.out.println(vect);
		System.out.println(vect.size());
		System.out.println(vect.capacity());
		vect.add(19);
		vect.add(20);
		System.out.println(vect.size());
		System.out.println(vect.capacity());
		
		vect.add(21);
		vect.add(22);
		System.out.println(vect.size());
		System.out.println(vect.capacity());
		
		ArrayList<String> listOfString = new ArrayList<String>();
		System.out.println(listOfString.size());
		listOfString.ensureCapacity(21);
		System.out.println(listOfString.size());
		
	}
}
