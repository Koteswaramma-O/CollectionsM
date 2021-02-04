package collections;

/*
 * Set interface used for storing group of individual elements where the elements can not be duplicated
 * Set is an interface which can not be instantiated 
 * we take the help of the implementation classes.
 * The implementation classes of Set interface are
 * 1)HashSet
 * 2)LinkedHashSet
 * 3)TreeSet
 * 
 * */
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
/*
 * HashSet is an implementation class of Set interface.
 * HashSet can be used for storing Individual objects.
 * HashSet does't allows duplicates.
 * HashSet allows null value.
 * HashSet is not Synchronized. 
 * Initial capacity of ArrayList is 16.
 * HashSet implements internally HashTable.
 * HashSet does not guarantee the order of insertion
 * 
 * */

public class SetDemo {

	public static void main(String[] args) {
//		HashSet hs = new HashSet();
//		hs.add(23);
//		hs.add(24);
//		hs.add(23);
//		System.out.println(hs);
		HashSet<EmployeeMain> hs = new HashSet<EmployeeMain>();
		hs.add(new EmployeeMain("pooja ", " EMP001", 24));
		hs.add(new EmployeeMain("Manvi ", " EMP002", 22));
		hs.add(new EmployeeMain("Madhu ", " EMP003", 34));
		hs.add(new EmployeeMain("pooja ", " EMP001", 24));
		hs.add(new EmployeeMain("Bablu ", " EMP005", 25));
		System.out.println(hs);
		System.out.println();

		System.out.println();
		System.out.println("using iterator");
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		// it will remove Single object
		hs.remove(hs);
		// it will remove specified collection reference Object
		hs.removeAll(hs);
		hs.size();
		hs.clear();
		hs.contains(hs);

	}

}
