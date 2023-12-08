package collection.quiz;

import java.util.HashSet;
import java.util.Iterator;

public class Quiz4 {
	public static void main(String[] args) {
		
		HashSet<Integer> hash = new HashSet<>();
		hash.add(1);
		hash.add(2);
		hash.add(3);
		
		System.out.println("set의 크기: " + hash.size());
		
		System.out.println("lterator를 이용해 출력");
		Iterator<Integer> ir = hash.iterator();
		while(ir.hasNext()) { 
			System.out.println(ir.next());
			
		}
		
		System.out.println("람다식 for문 이용");
		for (Integer i : hash) {
			System.out.println(i);
		}
	}
}
