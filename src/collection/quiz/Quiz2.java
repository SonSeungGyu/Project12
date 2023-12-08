package collection.quiz;

import java.util.ArrayList;

public class Quiz2 {
	public static void main(String[] args) {
		
		ArrayList<Character> list = new ArrayList<Character>();
		
		list.add('A');
		list.add('B');
		list.add('C');
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i)=='A') {
				list.remove(i);
			}
		}
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
	}
}
