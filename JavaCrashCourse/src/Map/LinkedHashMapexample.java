package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapexample {

	public static void main(String[] args) {
		
		LinkedHashMap<String, String> heros= new LinkedHashMap<String, String>();
		heros.put("Iron Man", "Tony Stark");
		heros.put("Bat Man", "Bruce Wayne");
		heros.put("Super Man", "Clark");
		heros.put(null, "power star");
		heros.put(null, "Little power star");
		heros.put(null, null);
		
		
		System.out.println(heros);
		
		HashMap<String, String> hasmapHerosHashMap = new HashMap<String, String>();
		hasmapHerosHashMap.put("Iron Man", "Tony Stark");
		hasmapHerosHashMap.put("Bat Man", "Bruce Wayne");
		hasmapHerosHashMap.put("Super Man", "Clark");
		hasmapHerosHashMap.put(null, "XYZ");
		
		
		System.out.println(hasmapHerosHashMap);

	}

}
