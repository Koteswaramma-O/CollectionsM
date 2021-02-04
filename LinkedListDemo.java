package collections;

/*
 * LinkedList is an implementation class of List interface.
 * LinkedList can be used for storing Individual objects.
 * LinkedList allows duplicates.
 * LinkedList allows null value.
 * LinkedList is not Synchronized. 
 * LinkedList implements internally DoubleLinkedList.
 * 
 * */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
/*
 * Differences between ArrayList and LinkedList
//ArrayList is faster in accessing Elements but slower in performing actions
//AL Implements dynamic array
//Linked List is slower in accessing the elements and faster in performing insertions and deletions
//LL Implements Doubly Linked List
 * 
 * */

public class LinkedListDemo {

	public static void main(String[] args) {
		List<EmployeeMain> LL = new LinkedList<EmployeeMain>();
		LL.add(new EmployeeMain("pooja ", " EMP001", 24));
		LL.add(new EmployeeMain("Manvi ", " EMP002", 22));
		LL.add(new EmployeeMain("Madhu ", " EMP003", 34));
		LL.add(new EmployeeMain("Mansi ", " EMP004", 31));
		LL.add(new EmployeeMain("Bablu ", " EMP005", 25));

		System.out.println(LL);
		LL.remove(4);
		LL.add(4, new EmployeeMain("Anjali ", "EMP006", 24));
		System.out.println("SizeOf List :" + LL.size());

		// using EnhancedforLoop(forEach)
		System.out.println(" using forEach");
		for (EmployeeMain obj : LL) {
			System.out.println(obj);
		}
		System.out.println();

		// Using ListIterator
		System.out.println("using ListIterator");
		ListIterator ll = LL.listIterator();
		while (ll.hasNext()) {
			System.out.println(ll.next());
		}
		System.out.println("Printing In reverse Order");
		while (ll.hasPrevious()) {
			System.out.println(ll.previous());

		}
		// here using Iterator
		System.out.println("Using Iterator");
		Iterator it = LL.iterator();
		System.out.println();
		System.out.println("EmpName:" + "EmpId :" + "age :");
		while (it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}
		System.out.println(LL);
	}

}
