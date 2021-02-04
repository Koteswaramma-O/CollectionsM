package collections;

import java.util.*;

import java.util.Vector;

/*
 * Vector is an implementation class of List interface.
 * Vector can be used for storing Individual objects.
 * Vector allows duplicates.
 * Vector allows null value.
 * Vector is not Synchronized. 
 * Vector implements internally Resizable Array.
 * Ordered By insertion
 * initial capacity is 10.
 * */
public class VectorDemo {

	public static void main(String[] args) {
		Vector<EmployeeMain> v = new Vector<EmployeeMain>();
		v.addElement(new EmployeeMain("pooja ", " EMP001", 24));
		v.addElement(new EmployeeMain("Manvi ", " EMP002", 22));
		v.addElement(new EmployeeMain("Madhu ", " EMP003", 34));
		v.addElement(new EmployeeMain("Mansi ", " EMP004", 31));
		v.addElement(new EmployeeMain("Bablu ", " EMP005", 25));

		System.out.println(v);
		// Element removing At particular Index
		v.removeElementAt(2);
		// Element adding at particular index
		v.addElement(new EmployeeMain("Anjali ", "EMP006", 24));
		//total size 
		System.out.println("SizeOf List :" + v.size());

		// Accessing The elements in different ways
		// here using forLoop
		System.out.println("using forLoop");
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i) + " ");
		}
		System.out.println();
		// using forEach
		System.out.println("using forEach loop");
		for (EmployeeMain obj : v) {
			System.out.println(obj);
		}
		// here Using Enumeration
		// only for Legacy classes
		// only forward direction for accessing elements
		System.out.println();
		System.out.println("using enumeration");
		Enumeration e = ((Vector<EmployeeMain>) v).elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
