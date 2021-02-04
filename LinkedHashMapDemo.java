package collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*
 * LinkedHashMap is an implementation class of Map interface.
 * LinkedHashMap can be used for storing Individual objects.
 * LinkedHashMap can be used for storing the elements i the form of key-value pairs,where keys can not be duplicated and the values can be duplicated.
 * LinkedHashMap allows null value in both keys and values.
 * LinkedHashMap is not Synchronized. 
 * Initial capacity of ArrayList is 16.
 * LinkedHashMap implements internally HashTable+DoubleLinkedList.
 * LinkedHashMap guarantee the order of insertion
 * 
 * */
public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> lMap = new LinkedHashMap<String, Integer>();
		lMap.put("one", 1);
		lMap.put("Two", 2);
		lMap.put("Three", 3);
		lMap.put("Four", 4);
		lMap.put("Five", 5);
		System.out.println(lMap);

		Set s = lMap.keySet();
		System.out.println("keys :" + s);

		Iterator i = s.iterator();
		while (i.hasNext()) {
			Object obj = i.next();
			String str = (String) obj;
			System.out.println(str + " " + lMap.get(str));
		}
		Collection<Integer> c = lMap.values();
		System.out.println("values :" + c);

		System.out.println(lMap.containsKey("Four"));
		System.out.println(lMap.containsKey(7));
	}

}
