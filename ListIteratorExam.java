package collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorExam {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(12);
		ll.add(22);
		ll.add(34);
		ll.add(56);
		ll.add(80);
		ListIterator li = ll.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}

		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}

	}

}
