package collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * TreeMap is an implementation class of Map interface.
 * TreeMap can be used for storing Individual objects.
 * TreeMap can be used for storing the elements i the form of key-value pairs,where keys can not be duplicated and the values can be duplicated.
 * TreeMap allows null value in both keys and values.
 * TreeMap is not Synchronized. 
 * TreeMap does not guarantee the order of insertion.
 * TreeMap sorts the keys in natural order(Ascending order)
 * TreeMap allows null into keys in java 1.6 version , if it contains only one element and java 1.7version does not allow null value even if the TreeSe contains one element. TreeMap allows null into values.
 * 
 * */
public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		// Adding elements
		treeMap.put("a", 100);
		treeMap.put("b", 200);
		treeMap.put("c", 300);
		treeMap.put("d", 400);
		// Displaying TreeMap
		System.out.println(treeMap);
		// First Element
		System.out.println("First Element: " + treeMap.firstEntry());
		// Last Element
		System.out.println("Last Element: " + treeMap.lastEntry());
		// Head Map
		System.out.println("Head Map: " + treeMap.headMap("c"));
		// Tail Map
		System.out.println("Tail Map: " + treeMap.tailMap("c"));

		Set<Map.Entry<String, Integer>> st = treeMap.entrySet();

		System.out.println();
		System.out.println("Using forEach");
		for (Map.Entry<String, Integer> me : st) {
			System.out.print(me.getKey() + ":");
			System.out.println(me.getValue());

		}

	}
}
