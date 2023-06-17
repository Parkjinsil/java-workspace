package A_ArrayList.controller;

import A_ArrayList.model.Member;

public class MemberController {

	private Member[] m = new Member[3];
	public int count;
	
	public void insertMember(Member m) {
		this.m[count++] = m; 
	}
	
	public boolean updateMember(String id, String name, String password, String email) {
		
		for(Member member : m) {
			if(member.getId().equals(id)) {
				member.setName(name);
				member.setPassword(password);
				member.setEmail(email);
				return true;
			}
		}
		
		return false;
	}
	
	public int checkId(String id) {
		
		
		
		return -1;
	}
	
	public Member[] printAll() {
		return null;
	}
	
}
