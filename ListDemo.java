package collections;

/*Collection is a interface present in java.util.package.
 *It is used to represent a group of individual objects as a single unit. 
 *The collection is considered as the root interface of the collection framework. 
 *It provides several classes and interfaces to represent a group of individual objects as a single unit. 
 *	
 * The List, Set are the main sub-interfaces of the collection interface. 
 * The map interface is also part of the java collection framework,
 * but it doesn’t inherit the collection of the interface
 * 
 * collections:
 * It is a utility class.
 * It defines several utility methods that are used to operate on collection.
 * It contains only static methods. 
 * 
 * 
 * 
 * List interface used for storing group of individual elements where the elements can be duplicated
 * List is an interface which can not be instantiated 
 * we take the help of the implementation classes.
 * The implementation classes of List interface are
 * 1) ArrayList
 * 2)LinkedList
 * 3)Vector
 * 4)stack
 * */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * ArrayList is an implementation class of List interface.
 * ArrayLst can be used for storing Individual objects.
 * ArrayList allows duplicates.
 * ArrayList allows null value.
 * ArrayList is not Synchronized. 
 * Initial capacity of ArrayList is 10.
 * ArrayList implements internally Resizable Array
 * 
 * */
public class ListDemo {

	public static void main(String[] args) {

		List<EmployeeMain> arrayList = new ArrayList<EmployeeMain>();
		arrayList.add(new EmployeeMain("pooja ", " EMP001", 24));
		arrayList.add(new EmployeeMain("Manvi ", " EMP002", 22));
		arrayList.add(new EmployeeMain("Madhu ", " EMP003", 34));
		arrayList.add(new EmployeeMain("Mansi ", " EMP004", 31));
		arrayList.add(new EmployeeMain("Bablu ", " EMP005", 25));

		System.out.println(arrayList);
		// removing element at particular index
		arrayList.remove(2);
		// adding element at particular index
		arrayList.add(2, new EmployeeMain("Anjali ", "EMP006", 24));

		System.out.println("SizeOf List :" + arrayList.size());

		// here using Iterator
		Iterator it = arrayList.iterator();
		System.out.println();
		System.out.println("EmpName:" + "EmpId :" + "age :");

		while (it.hasNext()) {
			// it.remove();//java.lang.IllegalStateException
			System.out.println(it.next());
			it.remove();
		}
		// removing all the elements from specifies reference Object
		arrayList.removeAll(arrayList);
		// clearing all the elements from the collection
		arrayList.clear();
		System.out.println(arrayList);
	}

}
