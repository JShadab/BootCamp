package p4;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		map.put("INDIA", "New Delhi");
		map.put("PAKISTAN", "Isalamabad");
		map.put("PAKISTAN", "Lucknow");
		map.put("BANGLADESH", "Dhaka");
		map.put("SRILANKA", "Columbo");
		map.put("NEPAL", "Kathmandu");
		map.put("USA", "Washington DC");

		System.out.println(map.get("USA")); // Washington DC
		System.out.println(map);
		
		System.out.println(map.get("PAKISTAN")); // Lucknow

	}

}
