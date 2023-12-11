package map;

import java.util.HashMap;
import java.util.Iterator;

public class Ex4 {
	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member member1 = new Member(1001, "둘리");
		Member member2 = new Member(1002, "또치");
		Member member3 = new Member(1003, "도우너");
		Member member4 = new Member(1004, "고길동");
		
		memberHashMap.addMember(member1);
		memberHashMap.addMember(member2);
		memberHashMap.addMember(member3);
		memberHashMap.addMember(member4);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004);
		
		memberHashMap.showAllMember();
	}
}

//회원관리 클래스
class MemberHashMap {

	// 회원목록을 저장할 map
	HashMap<Integer, Member> map; // map 선언

	public MemberHashMap() {
		map = new HashMap<>();// map생성
	}

	// 매베 회원을 추가하는 메소드
	public void addMember(Member member) {
		map.put(member.memberId, member);
	}

	// 아이디로 회원을 삭제하는 메소드
	public boolean removeMember(int memberId) {

		if (map.containsKey(memberId)) { // memberId가 map의 키값으로 존재한다면 true
			map.remove(memberId); //존재하는 memberId값을 삭제
			System.out.println(memberId + "번 회원을 삭제하였습니다.");
			return true;
		}
		System.out.println(memberId + "번 회원이 존재하지 않습니다.");

		return false;
	}

	public void showAllMember() {
//		Set<Integer> keyset = map.keySet();
//
//		for (int key : keyset) {
//			System.out.println("[Key]: " + key + " [Member]: " + map.get(key));
//		}
		
		Iterator<Integer> keys = map.keySet().iterator();
		
		while(keys.hasNext()) {
			int key = keys.next();
			Member member = map.get(key);
			System.out.println(member);
		}
	}

}
