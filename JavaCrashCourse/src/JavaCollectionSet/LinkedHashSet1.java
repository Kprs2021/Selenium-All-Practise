package JavaCollectionSet;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	/*
	 * Linkedhashset(i) is implementation class for SET(I).
	 * 
	 * Duplicate values are not allowed
	 * 
	 * insertion order is maintained
	 * 
	 * underlying DS is Hahtable+Linkedlist
	 * 
	 * can insert heterogeneous objects(if generics are not used).
	 * 
	 * Null elements are allowed in Hashset.
	 * 
	 * implements serializable amd cloneable interfaces
	 * 
	 * data are stored based on hashcode, so search is very effective.
	 * 
	 * fill ratio or load factor:0.75% or 75%
	 * 
	 * Default capacity - 16
	 */
	
	/*
	 * Linkedhashset->child class of hashset
	 * DS->Hash table + Linked list
	 * Insertion order is preserved
	 * Duplicates not allowed
	 */
	
	
	public void LinkedHasSetExample() {
		
		Set linkedHashSet = new LinkedHashSet();
		linkedHashSet.add(1);
		linkedHashSet.add("A");
		linkedHashSet.add("B");
		linkedHashSet.add("C");
		linkedHashSet.add("D");
		linkedHashSet.add(10);
		linkedHashSet.remove(10);
		System.out.println("Insertion order preserved linked hash set :"+linkedHashSet);
		System.out.println("Size :"+linkedHashSet.size());
		
		
	}

	public static void main(String[] args) {
		
		
		LinkedHashSet1 linkedHashSet = new LinkedHashSet1();
		linkedHashSet.LinkedHasSetExample();
		
		

	}

}
