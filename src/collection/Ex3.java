package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex3 {
	public static void main(String[] args) {
		
		//HashSet생성
		HashSet<String> hash = new HashSet<>();
		
		hash.add("둘리"); //회원추가
		hash.add("또치");
		hash.add("도우너");
		hash.add("도우너"); //중복된 값은 추가 불가
		
		System.out.println("set 목록: " + hash);
		System.out.println("크기: " + hash.size());
		
		hash.remove("도우너");
		System.out.println("set 목록: " + hash);
		
		
		Iterator<String> ir = hash.iterator();
		
		while(ir.hasNext()) { //다음 요소가 있으면
			String member = ir.next(); //다음 요소를 가져옴
			System.out.println(member + " ");
			
		}
		
		for (String member : hash) {
			System.out.println(member + " ");
		}
	}
}
