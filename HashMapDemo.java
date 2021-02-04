package collections;

/*
 * Map interface used for storing group of individual elements in the form of Key-Value pairs.
 * One set of key-value pair is called as entry.
 * Map does not allow keys to be duplicated whereas values can be duplicated.
 * Map is an interface which can not be instantiated 
 * we take the help of the implementation classes.
 * The implementation classes of Map interface are
 * 1)HashMap
 * 2)LinkedHashMap
 * 3)TreeMap
 * 
 * */
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
/*
 * HashMap is an implementation class of Map interface.
 * HashMap can be used for storing Individual objects.
 * HashMap can be used for storing the elements i the form of key-value pairs,where keys can not be duplicated and the values can be duplicated.
 * HashMap allows null value in both keys and values.
 * HashMap is not Synchronized. 
 * Initial capacity of ArrayList is 16.
 * HashMap implements internally HashTable.
 * HashMap does not guarantee the order of insertion
 * 
 * */

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> hMap = new HashMap<String, Integer>();
		hMap.put("one", 1);
		hMap.put("Two", 2);
		hMap.put("Three", 3);
		hMap.put("Four", 4);
		hMap.put("Five", 5);
//		Optional<String> optionalhmap = hMap.entrySet().stream().filter(e -> "one".equals(e.getValue()))
//				.map(Map.Entry::getKey).findAny();
//		assertEquals("1", optionalhmap.get());

		for (Map.Entry<String, Integer> entry : hMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());

		}
		System.out.println();
		System.out.println("Using Stream");
		hMap.entrySet().forEach(entry -> {
			System.out.println("Key : " + entry.getKey() + " " + " Value : " + entry.getValue());
		});
	}

}
