package map.quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Quiz3 {
	public static void main(String[] args) {
		HashMap<String, Float> map = new HashMap<>();
		map.put("국어", 80.0f);
		map.put("수학", 90.0f);
		map.put("영어", 100.0f);
		
		Set<String> keyset = map.keySet();
		System.out.println(map.keySet());//[국어, 수학, 영어] -> 키들의 집합을 보여준다.
		
		Iterator<String> keys = keyset.iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println("[과목명]: " + key);
			
			System.out.println("[점수]: " + map.get(key));
		}
		
		System.out.println("----------for 이용--------------");
		for (String key : keyset) {
			System.out.println("[Key]: " + key);
		}
		for(String key : keyset) {
			System.out.println("[Value]: " + map.get(key));
		}
		
		
	}
}
