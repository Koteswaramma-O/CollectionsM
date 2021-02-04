package collections;

import java.util.LinkedHashSet;
import java.util.Set;
/*
 * LinkedHashSet is an implementation class of Set interface.
 * LinkedHashSet can be used for storing Individual objects.
 * LinkedHashSet does't allows duplicates.
 * LinkedHashSet allows null value.
 * LinkedHashSet is not Synchronized. 
 * Initial capacity of ArrayList is 16.
 * LinkedHashSet implements internally HashTable+doubleLinkedList.
 * it follows ordered by insertion.
 * */
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		Set<EmployeeMain> Lhs = new LinkedHashSet<EmployeeMain>();
		Lhs.add(new EmployeeMain("pooja ", " EMP001", 24));
		Lhs.add(new EmployeeMain("Manvi ", " EMP002", 22));
		Lhs.add(new EmployeeMain("Madhu ", " EMP003", 34));
		Lhs.add(new EmployeeMain("Mansi ", " EMP004", 31));
		Lhs.add(new EmployeeMain("Bablu ", " EMP005", 25));
		System.out.println(Lhs);
		Set<Object> s = new LinkedHashSet<Object>();
		s.add(23);
		s.add(33);
		s.add(33);
		s.add(90);
		s.add(13);
		s.add(4);
		s.addAll(Lhs);
		System.out.println(s.contains(23));
		// s.retainAll(s);
		System.out.println(s);
		for (Object o : s) {
			System.out.println(o);
		}

	}

}
