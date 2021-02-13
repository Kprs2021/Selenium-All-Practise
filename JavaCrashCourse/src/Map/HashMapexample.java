package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapexample {
	/*
	 * MAPC(I)is not the child interfaces of collection(I) and hence it is not
	 * considered to be true collection
	 * 
	 * It represents data in KEY-VALUE Pair.
	 * 
	 * Duplicate keys are not allowed in map
	 * 
	 * Duplicate values are allowed.
	 * 
	 * Example: Employee#(Key)->Employee Name(Value) PinCode(Key)->Town or City name
	 */

	public static void main(String[] args) {

		HashMap<Integer, String> employeeMap = new HashMap<Integer, String>();
		// To insert an element PUT method is used..
		employeeMap.put(1, "Karthi");
		employeeMap.put(2, "vinoth");
		employeeMap.put(3, "Arjun");
		employeeMap.put(4, "Ganesh");
		employeeMap.put(5, "Arav");

		System.out.println("Employee map :" + employeeMap);

		// To Make a copy of the existing map
		Map<Integer, String> duplicateMap = new HashMap<Integer, String>();
		duplicateMap.putAll(employeeMap);
		System.out.println("Duplicate map :" + duplicateMap);

		// clear to delete the map contents
		duplicateMap.clear();
		System.out.println("After clearing :" + duplicateMap);

		// To check if a key is present or not in the map
		System.out.println("Does this man has key 1? :" + employeeMap.containsKey(1));

		// To check if a value is present or not in the map
		System.out.println("Does this man has key 1? :" + employeeMap.containsValue("Karthi"));

		// clone the map
		System.out.println("Cloned the map :" + employeeMap.clone());

		// Check the map is empty or not
		System.out.println("Is Empty :" + duplicateMap.isEmpty());

		// Fetch the set of keys in the map(Note: Here it's not list of keys, it's set
		// of keys.
		// because list will allow duplicate but set wont, keys should be unique.
		System.out.println("Ket Set :" + employeeMap.keySet());
		
		//fetch a value
		System.out.println("Value Set :" + employeeMap.get(3));
		//fetch all value
		System.out.println("All Value Set :" + employeeMap.values());
		
		//entry set
		System.out.println("Entry Set :" + employeeMap.entrySet());
		
		
		
	}

}
