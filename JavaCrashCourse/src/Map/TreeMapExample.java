package Map;

import java.util.TreeMap;

public class TreeMapExample {
	
	/*
	 * Treemap
	 */
	
	public static void main(String[] args) {
		
		TreeMap<String, String> treeMap= new TreeMap<String, String>();
		treeMap.put("Tiruverumbur", "Trichy");
		treeMap.put("SriRangam", "Trichy");
		treeMap.put("Palakkarai", "Trichy");
		treeMap.put("Kallakuruchi", "Trichy");
		
		treeMap.put("Trichy", "TVS Toll Gate");
		treeMap.put("Trichy", "Melaputhur");
		treeMap.put(null, "Melaputhur");
		treeMap.put(null, "xyz");
		
		System.out.println(treeMap);
		
	}

}
