package map.quiz;

import java.util.HashMap;
import java.util.Set;

public class Quiz1 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("국어", 80);
		map.put("수학", 90);
		map.put("영어", 100);
		
		
		
        Set<String> key = map.keySet();
		
		for (String key1 : key) {
			System.out.println("[Key]: " + key1 + " [Value]: " + map.get(key1));
		}
		System.out.println("map의 크기: " + map.size());
	}
}
