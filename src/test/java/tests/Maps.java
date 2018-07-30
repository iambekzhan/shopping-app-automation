package tests;

import java.util.HashMap;
import java.util.Map;

public class Maps {
	
	public static void main(String[] args) {
		
		Map<String, String> capitals = new HashMap<>();
		capitals.put("USA", "Wasington D.C.");
		capitals.put("Russia", "Moscow");
		capitals.put("England", "London");
		
		System.out.println(capitals);
		System.out.println(capitals.get("England"));
		
		
	}
}
