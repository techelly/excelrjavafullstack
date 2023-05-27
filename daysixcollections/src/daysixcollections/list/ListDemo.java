package daysixcollections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {
		// List can store the ordered collection of objects. It can have duplicate
		// values.
		// List interface is implemented by the classes ArrayList,LinkedList,Vector and
		// Stack
		List arrayList = new ArrayList();

		List vectorList = new Vector(); // synchronized

		ArrayList arryList = new ArrayList();

		// ArrayList class implements the List interface. It uses a dynamic array to
		// store the duplicate element of different data types.
		// It maintains insertion order and is non-synchronized.
		// using add() method we can insert the objects or data in an ArrayList
		arrayList.add(11);
		arrayList.add("Hello");// different type of element allowed
		arrayList.add(54.55);
		arrayList.add("Everyone");
		arrayList.add(null); // null allowed
		arrayList.add(11); // duplicate element allowed

		System.out.println(arrayList);
		// size of arrayList
		System.out.println(arrayList.size());

		List<Integer> listOfInteger = new ArrayList<Integer>();
		listOfInteger.add(15);
		listOfInteger.add(16);
		// not allowed because we have specified that our
		// ArrayList object referred by listOfInteger variable is going to store Integer
		// listOfInteger.add("Hi");
		System.out.println(listOfInteger);
		System.out.println(listOfInteger.size());
		System.out.println(listOfInteger.get(0));
		System.out.println(listOfInteger.get(1));
		System.out.println("*************Traversing through arraylist using for loop*********");
		// Traversing through arraylist
		for (Integer num : listOfInteger) {
			System.out.println(num);
		}

		System.out.println("*************Traversing through arraylist using old for loop*********");
		// Traversing through arraylist
		for (int index = 0; index < listOfInteger.size(); index++) {
			System.out.println(listOfInteger.get(index));
		}

		System.out.println("*************Traversing through arraylist using forEach*********");
		// Traversing through arraylist
		listOfInteger.forEach(System.out::println); // Java 8 feature passing the Method Reference

		System.out.println("*************Traversing through arraylist using Iterator*********");
		// Traversing through arraylist
		Iterator<Integer> itr = listOfInteger.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("*****************ArrayList Methods*****************************");
		System.out.println(arrayList);
		System.out.println(arrayList.isEmpty());
		System.out.println(arrayList.contains("Hello"));
		System.out.println(arrayList.get(2));
		System.out.println(arrayList.size());
		System.out.println(arrayList.remove(0));
		System.out.println(arrayList);

		System.out.println("*****************Use generices in List ********************");
		// We are decoupling our code from a specific implementation of the interface
		// This is called programming to interface. It will be helpful in case if you
		// wish to move to some other implementations of List in the future.
		List<String> strList = new ArrayList<String>();
		strList.add("Hi");
		strList.add("Good");
		strList.add("Morning");
		strList.add(null);
		strList.add("Ayush");

		System.out.println(strList);
		
		Employee e = new Employee();
		e.setEmpId(11);
		e.setEmpName("Ayush");
		
		Employee e1 = new Employee();
		e1.setEmpId(15);
		e1.setEmpName("Jyotika");
		
		
		Employee e2 = new Employee();
		e2.setEmpId(15);
		e2.setEmpName("Jyotika");
		
		List<Employee> listOfEmployee = new ArrayList<Employee>();
		listOfEmployee.add(e1);
		listOfEmployee.add(e);
		listOfEmployee.add(e2);
		
		System.out.println(listOfEmployee);
		System.out.println("********************************************");
		for(Employee emp : listOfEmployee) {
			System.out.println(emp);
		}
		System.out.println("********************************************");
		Iterator iter = listOfEmployee.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
