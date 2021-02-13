package JavaCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.internal.runners.model.EachTestNotifier;

import com.sun.xml.bind.v2.runtime.reflect.ListIterator;

import net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation;

public class Collection {

	/*
	 * A group of individual object is called collection
	 * 
	 * Collection = Interfaces -> List, Set, Queue Set ->SortedSet, NavigatableSet
	 * List -> ArrayList and LinkedList.
	 * 
	 * Map is not a part of collection
	 * 
	 */

	public void arraylistExamples() {

		List<String> arrayList = new ArrayList<String>();

		arrayList.add("Benz");
		arrayList.add("Bmw");
		arrayList.add("Bugatti");
		arrayList.add("Lamborgini");
		arrayList.add("Bentli");
		arrayList.add("Bentli");
		// can be add duplicate values too.
		System.out.println(arrayList);
		System.out.println(arrayList.get(3));
		System.out.println(arrayList.indexOf("Bugatti"));
		System.out.println(arrayList.lastIndexOf("maruti"));
//		

		List<String> anotherList = new ArrayList<String>();
		anotherList.addAll(arrayList);
		System.out.println(anotherList);
		anotherList.clear();
		System.out.println(anotherList);
		arrayList.remove(0);
		System.out.println(arrayList);
		arrayList.remove("Bugatti");
		System.out.println(arrayList);
		arrayList.add("null");
		System.out.println(arrayList);

		arrayList.set(0, "Jaquar");
		System.out.println(arrayList);
		System.out.println(arrayList.isEmpty());

//		Iterate:

		for (String string : arrayList) {

			System.out.println("Using for Each : " + string);

		}

		for (int i = 0; i < arrayList.size(); i++) {

			System.out.println("Using for loop : " + arrayList.get(i));

		}

		java.util.ListIterator<String> myIterator = arrayList.listIterator();

		while (myIterator.hasNext()) {
			System.out.println(myIterator.next());
			System.out.println(myIterator.previous());
		}

		Iterator<String> hIterator = arrayList.iterator();

		while (hIterator.hasNext()) {
			System.out.println(hIterator.next());

		}

		System.out.println(myIterator.next());
	}

	public static void main(String[] args) {

		Collection arraylist = new Collection();
		arraylist.arraylistExamples();

	}

}
