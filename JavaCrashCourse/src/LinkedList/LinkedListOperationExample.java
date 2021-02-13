package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

import org.apache.commons.math3.ode.FirstOrderConverter;

import com.sun.xml.bind.v2.runtime.reflect.ListIterator;

public class LinkedListOperationExample {

	/*
	 * Linkedlist is implemented using doubly linked list. this is best suitable for
	 * insertion and deletion.. unlike arraylist, this is not the best for
	 * retrieving data.
	 * 
	 * All the collections implements serializable and clonable interface.
	 * Linkedlist also implements those interfaces but not randomaccess interface.
	 */

	public void LinkedListExample() {

		// create a simple linked list

		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		linkedlist.add(2);
		linkedlist.add(3);
		linkedlist.add(4);
		linkedlist.add(5);
		System.out.println("LinkedList ListIterator :" + linkedlist);

		// add an element to the first position
		linkedlist.addFirst(1);
		System.out.println("First Element adding first:" + linkedlist);

		// add an element to the first position using index
		System.out.println("First Element using index :" + linkedlist);

		// get the first value
		System.out.println("First value:" + linkedlist.getFirst());

		// add an element to the Last position
		linkedlist.addLast(6);
		System.out.println("First Element adding last:" + linkedlist);

		// remove first and remove last
		System.out.println("remove first :" + linkedlist.removeFirst());
		System.out.println("remove last :" + linkedlist.removeLast());

		// poll method and poll first() the first element in the list
		System.out.println("Deleting the First element :" + linkedlist.pollFirst());

		// poll method and poll last() the last element in the list
		System.out.println("Deleting the last element :" + linkedlist.pollLast());

		// occurances - remove first occurance of any value.
		linkedlist.removeFirstOccurrence(2);
		System.out.println("after removing first occurance of :" + linkedlist);

		// occurances - remove last occurance of any value.
		linkedlist.removeLastOccurrence(4);
		System.out.println("after removing last occurance of :" + linkedlist);

	}

	public void iterationwithsimplefor() {

		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");

		System.out.println(linkedList);
		for (int index = 0; index < linkedList.size(); index++) {
			// System.out.println("Elements in the LL are:"+linkedList);
			System.out.println("Elements in the LL are:" + linkedList.get(index));
		}

		System.out.println("---------------------------------");

	}

	public void iterationwithadvancedfor() {

		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");

		System.out.println("for each");
		for (String string : linkedList) {
			// System.out.println("Elements in the LL are:"+linkedList);
			System.out.println("Elements in the LL are:" + string);
		}

		System.out.println("---------------------------------");

	}

	// iterate using while

	public void iterateUsingWhile() {

		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		int number=0;

		System.out.println("for while");
		while (linkedList.size()>number) {
			System.out.println("Elements in the LL are:" + linkedList.get(number));
			number++;
		}
		
		System.out.println("---------------------------------");

	}
	
	public void IterateUsingIterator() {

		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		
		Iterator<String> iterator= linkedList.iterator();
		System.out.println("Iterator");
		while (iterator.hasNext()) {
			System.out.println("Elements in the LL are:" + iterator.next());
			
		}
		
		System.out.println("---------------------------------");

	}

	public static void main(String[] args) {

//		LinkedListOperationExample link = new LinkedListOperationExample();
//		link.LinkedListExample();

		LinkedListOperationExample link1 = new LinkedListOperationExample();
		link1.iterationwithsimplefor();

		LinkedListOperationExample link2 = new LinkedListOperationExample();
		link1.iterationwithadvancedfor();
		
		LinkedListOperationExample link3 = new LinkedListOperationExample();
		link1.iterateUsingWhile();
		
		LinkedListOperationExample link4 = new LinkedListOperationExample();
		link1.IterateUsingIterator();
		
		

	}

}
