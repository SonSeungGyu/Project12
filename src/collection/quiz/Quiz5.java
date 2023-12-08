package collection.quiz;

import java.util.ArrayList;

public class Quiz5 {
	public static void main(String[] args) {
		MemberArrayList arr = new MemberArrayList();
		
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
}

class MemberArrayList{
	ArrayList<Member> list;
	
	void addMember(Member member) {
		list.add(member);
	}
	
	boolean removeMember(int memberId) {
	
		return false;
	}
	
	void showAllMember() {
		
	}
}
