package collection.quiz;

import java.util.ArrayList;

public class Quiz5 {
	public static void main(String[] args) {
		MemberArrayList memArrayList = new MemberArrayList();
		Member member1 = new Member(1001,"둘리");
		Member member2 = new Member(1002,"또치");
		Member member3 = new Member(1003,"도우너");
		Member member4 = new Member(1004,"고길동");
		
		//회원 4명 추가
		memArrayList.addMember(member1);
		memArrayList.addMember(member2);
		memArrayList.addMember(member3);
		memArrayList.addMember(member4);
		memArrayList.showAllMember();
		
		//아이디로 4번째 회원 삭제
		memArrayList.removeMember(1004);
		memArrayList.showAllMember();
		
	}
}


class Member{
	int memberId;
	String memberName;
	
	public Member(int memberId, String memberName) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + "]";
	}	
	
	
}

//회원관리 클래스
class MemberArrayList{
	
	//회원 목록
	ArrayList<Member> list; //리스트 선언
	
	
	//객체생성, 멤버변수 초기화가 생성자의 목적
	public MemberArrayList() {
		list = new ArrayList<Member>(); //리스트 생성
	}
	
	
	//리스트에 회원을 추가하는 메소드
	public void addMember(Member member) {
		list.add(member);
	}
	
	//아이디로 회원을 삭제하는 메소드
	public boolean removeMember(int memberId) {//인자
		//리스트를 순회하면서 특정회원아이디를 가지는 회원 찾기
		for (int i = 0; i < list.size(); i++) {
			
			Member member = list.get(i);
			int id = member.memberId;
			
			//해당 회원의 아이디가 인자가 같은지 비교
			if(id == memberId) {
				list.remove(i);//같으면 삭제
				
				System.out.println(memberId + "번 회원을 삭제하였습니다.");
				return true;//삭제에 성공했으면 true 반환
			}
		}
		
		return false;//삭제에 실패했으면 false 반환
	}
	
	void showAllMember() {
		for (int i = 0; i < list.size(); i++) {
			Member member = list.get(i);
			System.out.println(member);
			
		}
//		for (Member member : list) {
//			System.out.println(member);
//		}
	}
}
