package JavaCollectionSet;

import java.util.*;

import javax.lang.model.util.Elements;

public class HashSet1 {

	/*
	 * Set(1)->Hashset(c) Set(1)->LinkedHashset(c)
	 * Set(1)->Sortedset(1)->Navigableset(1)->Tressset(1)
	 * 
	 * *c-class,1-interface
	 * 
	 * Points to be remembered:
	 * 
	 * Hashset(1) is implementation class for SET(1) Duplicate values are not
	 * allowed insertion order is not maintained underlying DS is hashtable which is
	 * actually a hashmap instance. can insert heterogeneous objects(If generics are
	 * not used) Null elements are allowed in hashset. implements serializable amd
	 * cloneable interfaces data are stored based on hashcode, so search is very
	 * effective. fill ratio or load factor:0.75% or 75% Default capacity - 16
	 */

	/*
	 * 1. Hashset hs= new Hashset();//size is 16 and fill ratio is 0.75 2. Hashset
	 * hs= new Hashset(int initialsize);//size as declared and fill ratio is
	 * 0.75(default) 3. Hashset hs= new Hashset(int initialsize, float fill
	 * ratio);//size and fill ratio can be declared 4. Hashset hs= new
	 * Hashset(Collection c);//create a hashset for any given collection.
	 */

	public void BasicExampleHashSet() {

		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("A");
		hashSet.add("A");//The return type of add() is boolean. Since A is already there it will
		hashSet.add("C");
		hashSet.add("D");
		hashSet.add("E");
		hashSet.add("F");
		hashSet.add(null);
		hashSet.add("G");
		
		//we have no control on insertion order
		
		System.out.println("Contents of the hasset :"+hashSet);
		hashSet.remove(null);
		//System.out.println("Contents of the hasset :"+hashSet);
		System.out.println("Contains of the hasset :"+hashSet.contains("D"));
		
	}
	
	public void iterateUsingIterator() {
		
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("D");
		hashSet.add("E");
		hashSet.add("F");
		hashSet.add(null);
		hashSet.add("G");
		
		Iterator<String> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println("Elements of Hashset :"+iterator.next());
			
		}
		
		
	}

	public static void main(String[] args) {
		
		HashSet1 hashSet1=new HashSet1();
		hashSet1.BasicExampleHashSet();
		hashSet1.iterateUsingIterator();

	}

}
