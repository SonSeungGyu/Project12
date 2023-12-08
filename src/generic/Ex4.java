package generic;

import java.util.ArrayList;

public class Ex4 {
	public static void main(String[] args) {
		
		//숫자를 저장하는 리스트 생성
		ArrayList<Integer> list1 = new ArrayList<>();
		
		list1.add(10);//int타입의 값만 저장 가능

		Integer i = list1.get(0);//값을 꺼낼때 형변환 필요 없음
		System.out.println(i);
		
		
		//불리언을 사용하는 리스트 생성
		ArrayList<Boolean> list2 = new ArrayList<>();
		
		list2.add(true);
		
		boolean bool = list2.get(0);
		System.out.println(bool);
	}
}
