package daysixcollections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "Raju");
		map.put(2, "Ibrahim");
		map.put(null, null);
		map.put(null, "Varun");
		map.put(null, "Raju");
		map.put(3,"Eldo");
		map.put(4,null);
		map.put(5, null);
		System.out.println(map);
		System.out.println(map.get(null));
		System.out.println(map.get(4));
		System.out.println(map.get(2));
		
		System.out.println(map.keySet());
		System.out.println("****************");
		List<String> values = new ArrayList<String>();
		
		for(Integer key : map.keySet()) {
			values.add(map.get(key));
			
		}
		System.out.println(values);
		
		Map<Integer,String> treeMap = new TreeMap<Integer,String>();
		treeMap.put(5, "Prabhat");
		treeMap.put(4, "Shruti");
		treeMap.put(1, "Rajesh");
		//Internally treemap tries to sort the data on the basis value of key
		//here key is null so null.equals(1) throws NullPointerException
		//treeMap.put(null, "Saket");//Null key is not allowed it will give NullPointerException
		System.out.println(treeMap);
	}
}
