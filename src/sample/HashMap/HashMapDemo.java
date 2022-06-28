package sample.HashMap;

import java.util.HashMap;

public class HashMapDemo {
	
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("QA","https://qa.com");
		hm.put("Proheath", "https://www.prohealth.com");
		hm.put("Google","https://www.google.com");
		hm.put("Microsoft","https://www.microsoft.com");
		hm.put("Apple","https://www.apple.com");
		
		hm.remove("QA");
		System.out.println(hm);
		
		for(String key:hm.keySet()) {
			System.out.println("Key is: "+key+" | Value is: "+hm.get(key));
		}
	}
}
