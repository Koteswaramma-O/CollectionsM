package collections;

import java.util.*;

/*
 * TreeSet is an implementation class of Set interface.
 * TreeSet can be used for storing Individual objects.
 * TreeSet does't allows duplicates.
 * TreeSet allows null value.
 * TreeSet is not Synchronized. 
 * TreeSet implements internally Balanced Tree.
 * it follows sorted Order(Ascending order).
 * TreeSet allows null value in java 1.6 version if it contains only one element and java 1.7 version does not allow null value even if the TreeSet contains one element
 * */

class Student implements Comparable {
	/* TreeSet is a class which sorts the elements by default in natural order(Ascending order)
	 * If we want to change the order of sorting order, then we need to implement comparator interface
	 * Comparator interface is available in java.util.*
	 * it contains two methods
	 * 1)public abstract boolean equals(Object obj).
	 * 2)public abstract int compare(Object o1,Object o2).
	 * 
	 * Two objects can be compared by the Comparator interface only if those objects are eligible for comparison.
	 * An Object is said to be eligible for comparison when its corresponding class implements Comparable interface
	 *
	 * The comparable interface is available in java.lang.*
	 * it contains only one method
	 * 1)public int compareTo(Object obj).
	 * 
	 * 
	 * 
	 * 
	 * */
	int rollNo;

	Student(int rollNo) {
		this.rollNo = rollNo;
	}

	public int compareTo(Object obj) {
		Student s = (Student) obj;
		if (this.rollNo < s.rollNo) {
			return -1;
		} else {
			if (this.rollNo > s.rollNo) {
				return +1;
			}
		}
		return 0;
	}

	public String toString() {
		return "" + rollNo;
	}

}

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Student> ts = new TreeSet<Student>();
		ts.add(new Student(14));
		ts.add(new Student(11));
		ts.add(new Student(34));
		ts.add(new Student(46));
		ts.add(new Student(90));
		System.out.println("Using ForEach");
		ts.forEach(item -> {
			System.out.println(item);
		});
		System.out.println("Set :" + ts);

	}

}
