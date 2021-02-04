package collections;

import java.util.Stack;

/*
 * Stack is an implementation class of List interface.
 * Stack can be used for storing Individual objects.
 * Stack allows duplicates.
 * Stack allows null value.
 * Stack is not Synchronized. 
 * Stack implements internally stack data structure.
 * Ordered By insertion
 * initial capacity is 10.
 * */
public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(23);
		s.push(20);
		s.push(63);
		s.push(67);
		s.push(100);
		s.push(201);

		System.out.println("List :" + s);
		// pop() is used to remove the object from the top of the stack
		System.out.println(s.pop());
		System.out.println("List :" + s);
		// peek() is used to access the top most element from the stack
		System.out.println(s.peek());
		System.out.println("List :" + s);
		// push() is used to push the specified object into the top of stack
		s.push(190);
		System.out.println("List :" + s);

	}

}
