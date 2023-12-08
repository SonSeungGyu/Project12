package collection.quiz;

import java.util.ArrayList;

public class Quiz1 {
	public static void main(String[] args) {
		
		ArrayList<Character> list = new ArrayList<Character>();
		
		list.add('A');
		list.add('B');
		list.add('C');
		
		//하드하드하드하드하드하드하드하드하드하드
		list.get(0);
		list.get(1);
		list.get(2);
		
		for (Character ch : list) {
			System.out.println(ch);
		}
		
		list.remove(1);
		System.out.println(list.size());
	}
}
