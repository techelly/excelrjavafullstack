package daysixcollections.map.hashmapinternalworking;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo {
	public static void main(String[] args) {
		Map<Key, String> cityMap = new HashMap<Key, String>();
		cityMap.put(new Key(1, "NY"), "New York");
		cityMap.put(new Key(2, "ND"), "New Delhi");
		cityMap.put(new Key(3, "CH"), "Chennai");
		cityMap.put(new Key(4, "BLR"), "Bengaluru");
		System.out.println("size before iteration -- " + cityMap.size());

		Set<Key> keyset = cityMap.keySet();
		
		//Iterator<Key> itr = cityMap.keySet().iterator();
		Iterator<Key> itr = keyset.iterator();
		
		while (itr.hasNext()) {
			System.out.println(cityMap.get(itr.next()));
		}
		System.out.println("size after iteration -- " + cityMap.size());
		
		Map<Integer,String> courseMap = new HashMap<Integer,String>();
		
		courseMap.put(1, "Java");
		courseMap.put(2, "C++");
		courseMap.put(3, "Python");
		courseMap.put(4, "Advance Java");
		courseMap.put(5, "DS using C++");
		courseMap.put(6, "Python with DataScience");
		System.out.println(courseMap);
		System.out.println(courseMap.keySet());
		
		Iterator iter = courseMap.keySet().iterator();
		while(iter.hasNext()) {
			System.out.println(courseMap.get(iter.next()));
		}
	}
	
}
